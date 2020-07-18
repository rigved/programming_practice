/*
 * FromWhereToWhere.java
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

public class FromWhereToWhere
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Where to? ");
        int number = Integer.valueOf(scanner.nextLine());

        for (int i = 1; i <= number; i++)
        {
            System.out.println(i);
        }

        System.out.print("Where to? ");
        int endPoint = Integer.valueOf(scanner.nextLine());
        System.out.print("Where from? ");
        int startPoint = Integer.valueOf(scanner.nextLine());

        for (int i = startPoint; i <= endPoint; i++)
        {
            System.out.println(i);
        }

        scanner.close();
    }
}
