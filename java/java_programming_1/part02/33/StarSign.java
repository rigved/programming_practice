/*
 * StarSign.java
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


public class StarSign
{
    public static void main(String[] args)
    {
        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("---");
        printSquare(4);
        System.out.println("---");
        printRectangle(5, 6);
        printRectangle(17, 3);
        System.out.println("---");
        printTriangle(3);
        printTriangle(4);
        System.out.println("---");
    }

    public static void printStars(int number)
    {
        for (int i = 0; i < number; i++)
        {
            System.out.print("*");
        }

        System.out.println("");
    }

    public static void printSquare(int size)
    {
        for (int i = 0; i < size; i++)
        {
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height)
    {
        for (int i = 0; i < height; i++)
        {
            printStars(width);
        }
    }

    public static void printTriangle(int size)
    {
        for (int i = 1; i <= size; i++)
        {
            printStars(i);
        }
    }
}
