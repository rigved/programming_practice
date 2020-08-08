/*
 * Item.java
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


public class Item
{
    String identifier, name;

    public Item(String identifier, String name)
    {
        this.identifier = identifier;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return (identifier + ": " + name);
    }

    @Override
    public boolean equals(Object compared)
    {
        if (this == compared)
        {
            return true;
        }

        if (!(compared instanceof Item))
        {
            return false;
        }

        Item comparedItem = (Item) compared;

        return (Objects.equals(identifier, comparedItem.identifier));
    }
}
