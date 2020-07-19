/*
 * Averaging.java
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


public class Averaging
{
    public static int sum(int number1, int number2, int number3, int number4)
    {
        return (number1 + number2 + number3 + number4);
    }

    public static double average(int number1, int number2, int number3, int number4)
    {
        return (sum(number1, number2, number3, number4) / 4.0);
    }

    public static void main(String[] args)
    {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }
}
