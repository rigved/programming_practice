/*
 * UserInterface.java
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

public class UserInterface
{
    private GradeRegister register;
    private Scanner scanner;

    public UserInterface(GradeRegister register, Scanner scanner)
    {
        this.register = register;
        this.scanner = scanner;
    }

    public static void printsStars(int stars)
    {
        while (stars > 0)
        {
            System.out.print("*");
            stars--;
        }
    }

    public void start()
    {
        readPoints();

        System.out.println();

        printGradeDistribution();
    }

    public void readPoints()
    {
        int points;

        while (true)
        {
            System.out.print("Points: ");
            String input = scanner.nextLine();

            if (input.equals(""))
            {
                break;
            }

            points = Integer.valueOf(input);

            if (points < 0 || points > 100)
            {
                System.out.println("Impossible number.");
                continue;
            }

            this.register.addGradeBasedOnPoints(points);
        }
    }

    public void printGradeDistribution()
    {
        int grade = 5, stars;

        while (grade >= 0)
        {
            stars = register.numberOfGrades(grade);

            System.out.print(grade + ": ");
            printsStars(stars);

            System.out.println();

            grade = grade - 1;
        }

        System.out.println("The average of points: " + this.register.averageOfPoints());
        System.out.println("The average of grades: " + this.register.averageOfGrades());
    }
}
