/*
 * Point.java
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

public class Point
{
    private ArrayList<Integer> pointsArrayList;
    private int gradePointsSum, passingGradePointsSum, passingGradePointsCount;
    private double gradePointAverage, passingGradePointAverage;

    public Point()
    {
        this.pointsArrayList = new ArrayList<>();
        this.gradePointsSum = this.passingGradePointsSum = this.passingGradePointsCount = 0;
        this.gradePointAverage = this.passingGradePointAverage = 0.0;
    }

    public double getGradePointAverage()
    {
        return this.gradePointAverage;
    }

    public int getPassingGradePointsCount()
    {
        return this.passingGradePointsCount;
    }

    public double getPassingGradePointAverage()
    {
        return this.passingGradePointAverage;
    }

    public double getPassPercentage()
    {
        return ((100.0 * this.passingGradePointsCount) / this.pointsArrayList.size());
    }

    public void addPoints(int currentPoints)
    {
        if ((currentPoints >= 0) && (currentPoints <= 100))
        {
            this.pointsArrayList.add(currentPoints);

            this.gradePointsSum += currentPoints;
            this.gradePointAverage = (1.0 * this.gradePointsSum) / this.pointsArrayList.size();

            if (currentPoints >= 50)
            {
                this.passingGradePointsSum += currentPoints;
                this.passingGradePointAverage = ((1.0 * this.passingGradePointsSum) / ++this.passingGradePointsCount);
            }
        }
    }

    public void printGradeDistribution()
    {
        int[] gradeDistribution = new int[6];

        for (int points : this.pointsArrayList)
        {
            if (points < 50)
            {
                gradeDistribution[0]++;
            }
            else if (points < 60)
            {
                gradeDistribution[1]++;
            }
            else if (points < 70)
            {
                gradeDistribution[2]++;
            }
            else if (points < 80)
            {
                gradeDistribution[3]++;
            }
            else if (points < 90)
            {
                gradeDistribution[4]++;
            }
            else
            {
                gradeDistribution[5]++;
            }
        }

        for (int index = (gradeDistribution.length - 1); index >= 0; index--)
        {
            System.out.print(index + ": ");

            for (int index2 = 0; index2 < gradeDistribution[index]; index2++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
