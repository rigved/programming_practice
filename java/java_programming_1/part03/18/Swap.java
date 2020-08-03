/*
 * Swap.java
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

public class Swap
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];

        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length)
        {
            System.out.println(array[index]);
            index++;
        }

        System.out.println("");

        System.out.println("Give two indices to swap:");
        int index1 = Integer.valueOf(scanner.nextLine());
        int index2 = Integer.valueOf(scanner.nextLine());

        if (index1 < array.length && index1 > -1 && index2 < array.length && index2 > -1)
        {
            array[index1] += array[index2];
            array[index2] = array[index1] - array[index2];
            array[index1] -= array[index2];
        }

        System.out.println("");

        index = 0;
        while (index < array.length)
        {
            System.out.println(array[index]);
            index++;
        }

        scanner.close();
    }
}
