/*
 * Hold.java
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

public class Hold
{
    private ArrayList<Suitcase> suitcases;
    private int maximumWeight;

    public Hold(int maximumWeight)
    {
        this.suitcases = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public int getCurrentWeight()
    {
        int currentWeight = 0;

        for (Suitcase suitcase : this.suitcases)
        {
            currentWeight += suitcase.totalWeight();
        }

        return currentWeight;
    }

    public void addSuitcase(Suitcase suitcase)
    {
        if ((this.getCurrentWeight() + suitcase.totalWeight()) <= this.maximumWeight)
        {
            this.suitcases.add(suitcase);
        }
    }

    @Override
    public String toString()
    {
        String message = null;

        if (this.suitcases.isEmpty())
        {
            return ("no suitcases (0 kg)");
        }
        else if (this.suitcases.size() == 1)
        {
            message = "1 suitcase (";
        }
        else
        {
            message = this.suitcases.size() + " suitcases (";
        }

        return (message + this.getCurrentWeight() + " kg)");
    }

    public void printItems()
    {
        for (Suitcase suitcase : this.suitcases)
        {
            suitcase.printItems();
        }
    }
}
