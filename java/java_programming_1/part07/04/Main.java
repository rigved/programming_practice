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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main
{
    public static void sort(int[] array)
    {
        Arrays.sort(array);
    }

    public static void sort(String[] array)
    {
        Arrays.sort(array);
    }

    public static void sortIntegers(ArrayList<Integer> integers)
    {
        Collections.sort(integers);
    }

    public static void sortStrings(ArrayList<String> strings)
    {
        Collections.sort(strings);
    }

    public static void main(String[] args)
    {
        int[] integerArray = {3, 1, 5, 99, 3, 12};

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int value: integerArray)
        {
            integerArrayList.add(value);
        }

        System.out.println("Integer array sorting:");
        System.out.println(Arrays.toString(integerArray));
        Main.sort(integerArray);
        System.out.println(Arrays.toString(integerArray));

        String[] stringArray = {"Jim", "Clair", "Toby", "Blinky", "Aaarrrgh", "Draal", "Vendel", "Deya"};

        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String value : stringArray)
        {
            stringArrayList.add(value);
        }

        System.out.println("\nString array sorting:");
        System.out.println(Arrays.toString(stringArray));
        Main.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));

        System.out.println("\nInteger ArrayList sorting:");
        System.out.println(integerArrayList);
        Main.sortIntegers(integerArrayList);
        System.out.println(integerArrayList);

        System.out.println("\nString ArrayList sorting:");
        System.out.println(stringArrayList);
        Main.sortStrings(stringArrayList);
        System.out.println(stringArrayList);
    }
}
