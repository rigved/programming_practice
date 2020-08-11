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
        Room room = new Room();

        System.out.println("Empty room? " + room.isEmpty());
        System.out.println("Shortest: " + room.shortest());

        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli" , 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));

        System.out.println("Empty room? " + room.isEmpty());

        System.out.println();

        for (Person person : room.getPersons())
        {
            System.out.println(person);
        }

        System.out.println();

        System.out.println("Shortest: " + room.shortest());

        System.out.println();

        for (Person person : room.getPersons())
        {
            System.out.println(person);
        }

        System.out.println();

        Person shortestPerson = room.take();
        System.out.println("Shortest: " + shortestPerson);

        System.out.println();

        for (Person person : room.getPersons())
        {
            System.out.println(person);
        }

        System.out.println();

        room.add(shortestPerson);

        while (!room.isEmpty())
        {
            System.out.println(room.take());
        }
    }
}
