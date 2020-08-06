/*
 * Product.java
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


public class Product
{
    private String name;
    private String location;
    private int weight;

    public Product(String name, String location, int weight)
    {
        this.name = name;
        this.location = location;
        this.weight = weight;
    }

    public Product(String name)
    {
        this(name, "shelf", 1);
    }

    public Product(String name, String location)
    {
        this(name, location, 1);
    }

    public Product(String name, int weight)
    {
        this(name, "shelf", weight);
    }

    public String getName()
    {
        return name;
    }

    public int getWeight()
    {
        return weight;
    }

    public String getLocation()
    {
        return location;
    }

    @Override
    public String toString()
    {
        return this.name + " (" + this.weight + " kg) can be found from the " + this.location;
    }
}
