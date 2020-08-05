/*
 * Statistics.java
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


public class Statistics
{
    private int count, sum;

    public Statistics()
    {
        this.count = this.sum = 0;
    }

    public void addNumber(int number)
    {
        this.count++;
        this.sum += number;
    }

    public int getCount()
    {
        return this.count;
    }

    public int sum()
    {
        return this.sum;
    }

    public double average()
    {
        if (this.count == 0)
        {
            return 0;
        }
        else
        {
            return ((this.sum * 1.0) / this.count);
        }
    }
}
