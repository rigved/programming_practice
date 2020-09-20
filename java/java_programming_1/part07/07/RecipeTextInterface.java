/*
 * RecipeTextInterface.java
 * Copyright (C) 2020  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;
import java.util.regex.Pattern;

public class RecipeTextInterface
{
    private Scanner inputScanner, fileScanner;
    private ArrayList<Recipe> recipeArrayList;

    public RecipeTextInterface()
    {
        this.inputScanner = new Scanner(System.in);
        this.recipeArrayList = new ArrayList<>();
    }

    private void openFile()
    {
        String fileName;

        System.out.print("File to read: ");
        fileName = this.inputScanner.nextLine();

        try
        {
            this.fileScanner = new Scanner(Paths.get(fileName));
            this.readFile();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private void readFile()
    {
        Recipe recipe;
        String ingredient;

        while (this.fileScanner.hasNextLine())
        {
            recipe = new Recipe();

            recipe.setRecipeName(this.fileScanner.nextLine());
            recipe.setRecipeCookingTime(Integer.valueOf(this.fileScanner.nextLine()));

            while (this.fileScanner.hasNextLine())
            {
                ingredient = this.fileScanner.nextLine();

                if (ingredient.isEmpty())
                {
                    break;
                }
                else
                {
                    recipe.addRecipeIngredients(ingredient);
                }
            }

            this.recipeArrayList.add(recipe);
        }
    }

    private void printRecipes()
    {
        for (Recipe recipe : this.recipeArrayList)
        {
            System.out.println(recipe);
        }
    }

    private void searchRecipesByName(String recipeName)
    {
        Pattern recipeNamePattern = Pattern.compile(Pattern.quote(recipeName), Pattern.CASE_INSENSITIVE);

        for (Recipe recipe : this.recipeArrayList)
        {
            if (recipeNamePattern.matcher(recipe.getRecipeName()).find())
            {
                System.out.println(recipe);
            }
        }
    }

    public void searchRecipeByCookingTime(int maxCookingTime)
    {
        for (Recipe recipe : this.recipeArrayList)
        {
            if (recipe.getRecipeCookingTime() <= maxCookingTime)
            {
                System.out.println(recipe);
            }
        }
    }

    public void searchRecipeByIngredient(String ingredient)
    {
        for (Recipe recipe : this.recipeArrayList)
        {
            if (recipe.getRecipeIngredients().contains(ingredient))
            {
                System.out.println(recipe);
            }
        }
    }

    public void start()
    {
        String command;
        boolean continueStatus = true;

        this.openFile();

        System.out.println("\nCommands:");
        System.out.println("list - lists the recipes");
        System.out.println("stop - stops the program");
        System.out.println("find name - searches recipes by name");
        System.out.println("find cooking time - searches recipes by cooking time");
        System.out.println("find ingredient - searches recipes by ingredient");

        while (continueStatus)
        {
            System.out.print("\nEnter command: ");
            command = this.inputScanner.nextLine();

            switch (command)
            {
                case "list":
                    System.out.println("\nRecipes:");
                    this.printRecipes();
                    break;
                case "find name":
                    System.out.print("Searched word: ");
                    String recipeName = this.inputScanner.nextLine();

                    System.out.println("\nRecipes:");
                    this.searchRecipesByName(recipeName);
                    break;
                case "find cooking time":
                    System.out.print("Max cooking time: ");
                    int maxCookingTime = Integer.valueOf(inputScanner.nextLine());

                    System.out.println("\nRecipes:");
                    this.searchRecipeByCookingTime(maxCookingTime);
                    break;
                case "find ingredient":
                    System.out.print("Ingredient: ");
                    String ingredient = this.inputScanner.nextLine();

                    System.out.println("\nRecipes:");
                    this.searchRecipeByIngredient(ingredient);
                    break;
                case "stop":
                    continueStatus = false;
                    break;
            }
        }
    }
}
