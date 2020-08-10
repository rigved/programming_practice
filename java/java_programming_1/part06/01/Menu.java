/*
 * Menu.java
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

public class Menu
{
    private ArrayList<String> meals;

    public Menu()
    {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal)
    {
        if (!this.meals.contains(meal))
        {
            this.meals.add(meal);
        }
    }

    public void printMeals()
    {
        for (String meal : meals)
        {
            System.out.println(meal);
        }
    }

    public void clearMenu()
    {
        this.meals.clear();
    }
}
