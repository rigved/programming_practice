/*
 * GradesAndPoints.java
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

public class GradesAndPoints
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give points [0-100]:");
        int points = Integer.valueOf(scan.nextLine());

        if (points > 100)
        {
            System.out.println("Grade: incredible!");
        }
        else if (points >= 90)
        {
            System.out.println("Grade: 5");
        }
        else if (points >= 80)
        {
            System.out.println("Grade: 4");
        }
        else if (points >= 70)
        {
            System.out.println("Grade: 3");
        }
        else if (points >= 60)
        {
            System.out.println("Grade: 2");
        }
        else if (points >= 50)
        {
            System.out.println("Grade: 1");
        }
        else if (points >= 0)
        {
            System.out.println("Grade: failed");
        }
        else
        {
            System.out.println("Grade: impossible!");
        }

        scan.close();
    }
}
