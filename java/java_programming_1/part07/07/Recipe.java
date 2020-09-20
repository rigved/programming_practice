/*
 * Recipe.java
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


import java.util.ArrayList;

public class Recipe
{
    private String recipeName;
    private int recipeCookingTime;
    private ArrayList<String> recipeIngredients;

    public Recipe()
    {
        this.recipeIngredients = new ArrayList<>();
    }

    public String getRecipeName()
    {
        return this.recipeName;
    }

    public int getRecipeCookingTime()
    {
        return this.recipeCookingTime;
    }

    public ArrayList<String> getRecipeIngredients()
    {
        return this.recipeIngredients;
    }

    public void setRecipeName(String recipeName)
    {
        this.recipeName = recipeName;
    }

    public void setRecipeCookingTime(int recipeCookingTime)
    {
        this.recipeCookingTime = recipeCookingTime;
    }

    public void addRecipeIngredients(String ingredient)
    {
        this.recipeIngredients.add(ingredient);
    }

    @Override
    public String toString()
    {
        return (this.recipeName + ", cooking time: " + this.recipeCookingTime);
    }
}
