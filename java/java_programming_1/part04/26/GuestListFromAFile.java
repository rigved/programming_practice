/*
 * GuestListFromAFile.java
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
import java.util.ArrayList;
import java.util.Scanner;

public class GuestListFromAFile
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();

        try {
            Scanner reader = new Scanner(Paths.get(file));

            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                list.add(line);
            }

            reader.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println();

        System.out.println("Enter names, an empty line quits.");
        while (true)
        {
            String name = scanner.nextLine();

            if (name.isEmpty())
            {
                break;
            }

            if (list.contains(name))
            {
                System.out.println("The name is on the list.");
            }
            else
            {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");

        scanner.close();
    }
}
