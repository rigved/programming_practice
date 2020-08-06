/*
 * Program.java
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


public class Program
{
    public static void main(String[] args)
    {
        Cube cube1 = new Cube(4);

        System.out.println(cube1.volume());
        System.out.println(cube1);

        System.out.println();

        Cube cube2 = new Cube(2);

        System.out.println(cube2.volume());
        System.out.println(cube2);
    }
}
