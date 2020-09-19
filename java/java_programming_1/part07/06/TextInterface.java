/*
 * TextInterface.java
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

public class TextInterface
{
    private Scanner inputScanner;

    public TextInterface()
    {
        this.inputScanner = new Scanner(System.in);
    }

    public void pointAverageTextInterface(Point point)
    {
        int currentPoints;

        System.out.println("Enter point totals, -1 stops:");

        while (true)
        {
            currentPoints = this.inputScanner.nextInt();

            if (currentPoints == -1)
            {
                break;
            }
            else
            {
                point.addPoints(currentPoints);
            }
        }

        System.out.println("Point average (all): " + point.getGradePointAverage());
        System.out.print("Point average (passing): ");

        if (point.getPassingGradePointsCount() > 0)
        {
            System.out.println(point.getPassingGradePointAverage());
        }
        else
        {
            System.out.println("-");
        }

        System.out.println("Pass percentage: " + point.getPassPercentage());

        System.out.println("Grade distribution:");
        point.printGradeDistribution();
    }
}
