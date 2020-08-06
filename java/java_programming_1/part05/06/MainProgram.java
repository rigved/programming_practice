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
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Counter1: " + counter1.value() + ", Counter2: " + counter2.value());
        counter1.decrease();
        counter2.increase();
        System.out.println("Counter1: " + counter1.value() + ", Counter2: " + counter2.value());

        for (int i = 1; i <= 10; i++)
        {
            counter1.decrease(i);
            counter2.increase(i);
            System.out.println("Counter1: " + counter1.value() + ", Counter2: " + counter2.value());
        }
    }
}
