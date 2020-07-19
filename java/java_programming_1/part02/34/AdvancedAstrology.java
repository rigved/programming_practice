/*
 * AdvancedAstrology.java
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


public class AdvancedAstrology
{
    public static void printStars(int number)
    {
        for (int i = 0; i < number; i++)
        {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSpaces(int number)
    {
        for (int i = 0; i < number; i++)
        {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height)
    {
        for (int i = 1; i <= height; i++)
        {
            printSpaces(height - i);
            printStars((2 * i) - 1);
        }

        for (int i = 0; i < 2; i++)
        {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args)
    {
        printTriangle(4);
        System.out.println("---");
        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
