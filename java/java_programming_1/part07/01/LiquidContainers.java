/*
 * LiquidContainers.java
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

public class LiquidContainers
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input, command;
        int first = 0, second = 0;

        while (true)
        {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            input = scan.nextLine();

            if (input.equals("quit"))
            {
                break;
            }

            String[] partsOfInput = input.split(" ");

            command = partsOfInput[0];
            int amount = Integer.valueOf(partsOfInput[1]);

            if (command.equals("add"))
            {
                if (amount >= 0)
                {
                    first += amount;
                }

                if (first > 100)
                {
                    first = 100;
                }
            }
            else if (command.equals("move"))
            {
                if (amount >= 0)
                {
                    int moveAmount = amount;

                    if (first < moveAmount)
                    {
                        moveAmount = first;
                    }

                    first -= moveAmount;
                    second += moveAmount;

                    if (second > 100)
                    {
                        second = 100;
                    }
                }
            }
            else if (command.equals("remove"))
            {
                if (amount >= 0)
                {
                    second -= amount;

                    if (second < 0)
                    {
                        second = 0;
                    }
                }
            }

            System.out.println();
        }

        scan.close();
    }
}
