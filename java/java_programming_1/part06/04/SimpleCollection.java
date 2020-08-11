/*
 * SimpleCollection.java
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

public class SimpleCollection
{
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name)
    {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element)
    {
        this.elements.add(element);
    }

    public ArrayList<String> getElements()
    {
        return this.elements;
    }

    @Override
    public String toString()
    {
        String message = "The collection " + this.name + " ";

        if (this.elements.isEmpty())
        {
            return (message + "is empty.");
        } else if (this.elements.size() == 1)
        {
            message += "has 1 element:";
        }
        else
        {
            message += "has " + this.elements.size() + " elements:";
        }

        for (String element : elements)
        {
            message +=  ("\n" + element);
        }

        return message;
    }
}
