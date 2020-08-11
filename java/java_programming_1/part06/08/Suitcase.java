/*
 * Suitcase.java
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

public class Suitcase
{
    private ArrayList<Item> items;
    private int maximumWeight;

    public Suitcase(int maximumWeight)
    {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int totalWeight()
    {
        int currentWeight = 0;

        for (Item item : this.items)
        {
            currentWeight += item.getWeight();
        }

        return currentWeight;
    }

    public void addItem(Item item)
    {
        if ((this.totalWeight() + item.getWeight()) <= this.maximumWeight)
        {
            this.items.add(item);
        }
    }

    @Override
    public String toString()
    {
        String message = null;

        if (this.items.size() == 0)
        {
            return ("no items (0 kg)");
        }
        else if (this.items.size() == 1)
        {
            message = "1 item (";
        }
        else
        {
            message = this.items.size() + " items (";
        }

        return (message + this.totalWeight() + " kg)");
    }

    public void printItems()
    {
        for (Item item : this.items)
        {
            System.out.println(item.getName() + " (" + item.getWeight() + " kg)");
        }
    }

    public Item heaviestItem()
    {
        if (this.items.isEmpty())
        {
            return null;
        }

        Item heaviestItem = this.items.get(0);

        for (Item item : this.items)
        {
            if (heaviestItem.getWeight() < item.getWeight())
            {
                heaviestItem = item;
            }
        }

        return heaviestItem;
    }
}
