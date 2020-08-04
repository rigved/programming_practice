/*
 * PersonalDetails.java
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

public class PersonalDetails
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        String longestName = "";
        int longestNameLength = 0, sum = 0, count = 0;
        String inputString = scanner.nextLine();

        while (!inputString.equals(""))
        {
            String[] inputStringArray = inputString.split(",");

            if (inputStringArray[0].length() > longestNameLength)
            {
                longestNameLength = inputStringArray[0].length();
                longestName = inputStringArray[0];
            }

            sum += Integer.valueOf(inputStringArray[1]);
            count++;

            inputString = scanner.nextLine();
        }

        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + ((sum * 1.0) / count));

        scanner.close();
    }
}
