/*
 * SimpleDate.java
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


public class SimpleDate
{
    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString()
    {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared)
    {
        if (this.year < compared.year)
        {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month)
        {
            return true;
        }

        if (this.year == compared.year &&
                this.month == compared.month &&
                this.day < compared.day)
        {
            return true;
        }

        return false;
    }

    public void advance()
    {
        this.day++;

        if (this.day > 30)
        {
            this.day = 1;
            this.month++;

            if (this.month > 12)
            {
                this.month = 1;
                this.year++;
            }
        }
    }

    public void advance(int howManyDays)
    {
        for (int i = 0; i < howManyDays; i++)
        {
            this.advance();
        }
    }

    public SimpleDate afterNumberOfDays(int days)
    {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);

        newDate.advance(days);

        return newDate;
    }
}
