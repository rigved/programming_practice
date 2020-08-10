/*
 * Main.java
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


public class Main
{
    public static void main(String[] args)
    {
        Menu menu = new Menu();

        menu.addMeal("Smoked salmon, white wine and butter sauce with basil");
        menu.addMeal("Seasonal green salad with apple-honey vinegarette");
        menu.addMeal("Roasted lamb in a red wine sauce");

        menu.printMeals();
        System.out.println();

        menu.clearMenu();
        menu.printMeals();

        System.out.println();

        menu.addMeal("Tofu ratatouille");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Chilli coconut chicken");
        menu.addMeal("Meatballs with mustard sauce");

        menu.printMeals();
        menu.clearMenu();

        System.out.println();

        menu.addMeal("Tomato and mozzarella salad");
        menu.printMeals();
    }
}
