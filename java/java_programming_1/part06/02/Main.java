/*
 * Main.java
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


public class Main
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        stack.add("Value");

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        String taken = stack.take();

        System.out.println(stack.isEmpty());
        System.out.println(stack.values());
        System.out.println(taken);

        stack.add("1");
        stack.add("2");
        stack.add("3");
        stack.add("4");
        stack.add("5");

        while (!stack.isEmpty())
        {
            System.out.println(stack.take());
        }
    }
}
