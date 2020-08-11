/*
 * Room.java
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

public class Room
{
    private ArrayList<Person> persons;

    public Room()
    {
        this.persons = new ArrayList<>();
    }

    public void add(Person person)
    {
        this.persons.add(person);
    }

    public boolean isEmpty()
    {
        return this.persons.isEmpty();
    }

    public ArrayList<Person> getPersons()
    {
        return this.persons;
    }

    public Person shortest()
    {
        if (this.isEmpty())
        {
            return null;
        }

        Person shortestPerson = this.persons.get(0);

        for (Person person : this.getPersons())
        {
            if (person.getHeight() < shortestPerson.getHeight())
            {
                shortestPerson = person;
            }
        }

        return shortestPerson;
    }

    public Person take()
    {
        Person takeShortestPerson = this.shortest();

        this.persons.remove(takeShortestPerson);

        return takeShortestPerson;
    }
}
