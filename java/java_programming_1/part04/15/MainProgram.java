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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.Scanner;

public class MainProgram
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics1 = new Statistics();

        statistics1.addNumber(3);
        statistics1.addNumber(5);
        statistics1.addNumber(1);
        statistics1.addNumber(2);

        System.out.println("Count: " + statistics1.getCount());
        System.out.println("Sum: " + statistics1.sum());
        System.out.println("Average: " + statistics1.average());

        Statistics statistics2 = new Statistics();
        Statistics statisticsEvenNumbers = new Statistics();
        Statistics statisticsOddNumbers = new Statistics();

        System.out.println("Enter numbers:");
        int number = Integer.valueOf(scanner.nextLine());

        while (number != -1)
        {
            statistics2.addNumber(number);

            if (number % 2 == 0)
            {
                statisticsEvenNumbers.addNumber(number);
            }
            else
            {
                statisticsOddNumbers.addNumber(number);
            }

            number = Integer.valueOf(scanner.nextLine());
        }

        System.out.println("Sum: " + statistics2.sum());
        System.out.println("Sum of even numbers: " + statisticsEvenNumbers.sum());
        System.out.println("Sum of odd numbers: " + statisticsOddNumbers.sum());

        scanner.close();
    }
}
