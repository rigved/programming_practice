/*
 * IndexOfSmallest.java
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
import java.util.Scanner;

public class IndexOfSmallest
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int smallestNumber = 0;

        int number = Integer.valueOf(scanner.nextLine());

        if (number != 9999)
        {
            smallestNumber = number;
            numbers.add(number);
        }
        else
        {
            scanner.close();
            System.exit(0);
        }

        while (true)
        {
            number = Integer.valueOf(scanner.nextLine());

            if (number == 9999)
            {
                break;
            }

            if (smallestNumber > number)
            {
                smallestNumber = number;
            }

            numbers.add(number);
        }

        System.out.println("");
        System.out.println("Smallest number: " + smallestNumber);

        for (int i = 0; i < numbers.size(); i++)
        {
            if (smallestNumber == numbers.get(i))
            {
                System.out.println("Found at index: " + i);
            }
        }

        scanner.close();
    }
}
