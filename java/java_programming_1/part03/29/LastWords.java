/*
 * LastWords.java
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

public class LastWords
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        while (!inputString.equals(""))
        {
            String[] inputStringArray = inputString.split(" ");
            String lastWord = inputStringArray[inputStringArray.length - 1];

            System.out.println(lastWord);

            inputString = scanner.nextLine();
        }

        scanner.close();
    }
}
