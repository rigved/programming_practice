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
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Item> items = new ArrayList<>();
        String identifier, name;

        while (true)
        {
            System.out.println("Identifier? (empty will stop)");
            identifier = scanner.nextLine();

            if (identifier.isEmpty())
            {
                break;
            }

            System.out.println("Name? (empty will stop)");
            name = scanner.nextLine();

            if (name.isEmpty())
            {
                break;
            }

            Item item = new Item(identifier, name);

            if (!items.contains(item))
            {
                items.add(item);
            }
        }

        System.out.println("==Items==");
        for (Item item: items)
        {
            System.out.println(item);
        }

        scanner.close();
    }
}
