/*
 * DivisibleByThree.java
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


public class DivisibleByThree
{
    public static void main(String[] args)
    {
        divisibleByThreeInRange(3, 6);
        divisibleByThreeInRange(2, 10);
    }

    public static void divisibleByThreeInRange(int beginning, int end)
    {
        for (int i = beginning; i <= end; i++)
        {
            if (i % 3 == 0)
            {
                System.out.println(i);
            }
        }
    }
}
