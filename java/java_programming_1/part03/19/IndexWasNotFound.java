/*
 * IndexWasNotFound.java
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

public class IndexWasNotFound
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];

        array[0] = 6;
        array[1] = 2;
        array[2] = 8;
        array[3] = 1;
        array[4] = 3;
        array[5] = 0;
        array[6] = 9;
        array[7] = 7;

        System.out.print("Search for? ");
        int searching = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < array.length; i++)
        {
            if (searching == array[i])
            {
                System.out.println(searching + " is at index " + i + ".");
                scanner.close();
                System.exit(0);
            }
        }

        System.out.println(searching + " was not found.");

        scanner.close();
    }
}
