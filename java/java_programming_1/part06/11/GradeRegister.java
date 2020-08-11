/*
 * GradeRegister.java
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

public class GradeRegister
{
    private ArrayList<Integer> grades, points;

    public GradeRegister()
    {
        this.grades = new ArrayList<>();
        this.points = new ArrayList<>();
    }

    public static int pointsToGrade(int points)
    {
        int grade = 0;

        if (points < 50)
        {
            grade = 0;
        }
        else if (points < 60)
        {
            grade = 1;
        }
        else if (points < 70)
        {
            grade = 2;
        }
        else if (points < 80)
        {
            grade = 3;
        }
        else if (points < 90)
        {
            grade = 4;
        }
        else
        {
            grade = 5;
        }

        return grade;
    }

    public void addGradeBasedOnPoints(int points)
    {
        this.grades.add(pointsToGrade(points));
        this.points.add(points);
    }

    public int numberOfGrades(int grade)
    {
        int count = 0;

        for (int received : this.grades)
        {
            if (received == grade)
            {
                count++;
            }
        }

        return count;
    }

    public double averageOfGrades()
    {
        if (this.grades.size() == 0)
        {
            return -1.0;
        }

        double sum = 0.0;

        for (int grade : this.grades)
        {
            sum += grade;
        }

        return (sum / this.grades.size());
    }

    public double averageOfPoints()
    {
        if (this.points.size() == 0)
        {
            return -1.0;
        }

        double sum = 0.0;

        for (int points : this.points)
        {
            sum += points;
        }

        return (sum / this.points.size());
    }
}
