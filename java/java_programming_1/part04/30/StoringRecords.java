/*
 * StoringRecords.java
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

public class StoringRecords
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records)
        {
            System.out.println(person);

        }

        scan.close();
    }

    public static ArrayList<Person> readRecordsFromFile(String file)
    {
        ArrayList<Person> persons = new ArrayList<>();

        try {
            Scanner fileScanner = new Scanner(Paths.get(file));
            String line;
            String[] lineArray;

            while (fileScanner.hasNextLine())
            {
                line = fileScanner.nextLine();

                if (line.isEmpty())
                {
                    continue;
                }

                lineArray = line.split(",");

                persons.add(new Person(lineArray[0], Integer.valueOf(lineArray[1])));
            }

            fileScanner.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        return persons;
    }
}
