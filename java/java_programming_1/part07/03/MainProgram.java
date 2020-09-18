/*
 * MainProgram.java
 * Copyright (C) 2020  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.Arrays;

public class MainProgram
{
    public static int smallest(int[] array)
    {
        if (array.length < 1)
        {
            return -1;
        }

        int smallest = array[0];

        for (int value : array)
        {
            if (value < smallest)
            {
                smallest = value;
            }
        }

        return smallest;
    }

    public static int indexOfSmallest(int[] array)
    {
        int smallestNumber = smallest(array);

        for (int smallestIndex = 0; smallestIndex < array.length; smallestIndex++)
        {
            if (smallestNumber == array[smallestIndex])
            {
                return smallestIndex;
            }
        }

        return -1;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex)
    {
        int[] tableSlice = new int[table.length - startIndex];

        System.arraycopy(table, startIndex, tableSlice, 0, tableSlice.length);

        return (indexOfSmallest(tableSlice) + startIndex);
    }

    public static void swap(int[] array, int index1, int index2)
    {
        array[index1] += array[index2];
        array[index2] = array[index1] - array[index2];
        array[index1] -= array[index2];
    }

    public static void sort(int[] array)
    {
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++)
        {
            int smallest = indexOfSmallestFrom(array, i);

            if (smallest != i)
            {
                swap(array, i, smallest);
            }

            System.out.println(Arrays.toString(array));
        }
    }

    public static void main(String[] args)
    {
        int[] array = {3, 1, 5, 99, 3, 12};

        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Smallest: " + MainProgram.smallest(array));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(array));

        int[] numbers = {5, 6, 8, 7, 11};

        System.out.println("\nArray: " + Arrays.toString(numbers));
        System.out.println("Smallest: " + MainProgram.smallest(numbers));
        System.out.println("Index of the smallest number: " + MainProgram.indexOfSmallest(numbers));

        numbers = new int[]{-1, 6, 9, 8, 12};

        System.out.println("\nArray: " + Arrays.toString(numbers));
        System.out.println("Index of the smallest number from index 0: " +
                           MainProgram.indexOfSmallestFrom(numbers, 0));
        System.out.println("Index of the smallest number from index 1: " +
                           MainProgram.indexOfSmallestFrom(numbers, 1));
        System.out.println("Index of the smallest number from index 2: " +
                           MainProgram.indexOfSmallestFrom(numbers, 2));

        numbers = new int[]{3, 2, 5, 4, 8};

        System.out.println("\nArray: " + Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println("Array after swapping indices 0 and 1: " + Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println("Array after swapping indices 0 and 3: " + Arrays.toString(numbers));

        numbers = new int[]{8, 3, 7, 9, 1, 2, 4};

        System.out.println("\nSelection sort:");
        MainProgram.sort(numbers);
    }
}
