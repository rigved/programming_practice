/*
 * IsItInTheFile.java
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


import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            boolean searchStatus = false;

            while (fileScanner.hasNextLine())
            {
                String line = fileScanner.nextLine();

                if (searchedFor.equals(line))
                {
                    searchStatus = true;
                    break;
                }
            }

            if (searchStatus)
            {
                System.out.println("Found!");
            }
            else
            {
                System.out.println("Not found.");
            }

            fileScanner.close();
        }
        catch (Exception e)
        {
            System.out.println("Reading the file " + file + " failed.");
        }

        scanner.close();
    }
}
