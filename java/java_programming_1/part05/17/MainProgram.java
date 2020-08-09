/*
 * MainProgram.java
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


public class MainProgram
{
    public static void main(String[] args)
    {
        Money a = new Money(10, 0);
        Money b = new Money(5, 0);

        Money c = a.plus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = a.plus(c);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        a = new Money(10, 0);
        b = new Money(3, 0);
        c = new Money(5, 0);

        System.out.println(a.lessThan(b));
        System.out.println(b.lessThan(c));

        a = new Money(10, 0);
        b = new Money(3, 50);

        c = a.minus(b);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        c = c.minus(a);

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
