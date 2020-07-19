/*
 * Greatest.java
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


public class Greatest
{
    public static int greatest(int number1, int number2, int number3)
    {
        if (number1 > number2)
        {
            if (number1 > number3)
            {
                return number1;
            }
            else
            {
                return number3;
            }
        }
        else if (number2 > number3)
        {
            return number2;
        }
        else
        {
            return number3;
        }
    }

    public static void main(String[] args)
    {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
