/*
 * Money.java
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


public class Money
{
    private final int euros;
    private final int cents;

    public Money(int euros, int cents)
    {
        if (cents > 99)
        {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros()
    {
        return this.euros;
    }

    public int cents()
    {
        return this.cents;
    }

    public String toString()
    {
        String zero = "";
        if (this.cents < 10)
        {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition)
    {
        return (new Money((this.euros + addition.euros), (this.cents + addition.cents)));
    }

    public boolean lessThan(Money compared)
    {
        if (this.euros < compared.euros)
        {
            return true;
        }
        else if (this.euros == compared.euros && this.cents < compared.cents)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Money minus(Money decreaser)
    {
        int eurosValue = this.euros;
        int centsValue = this.cents - decreaser.cents;

        if (centsValue < 0)
        {
            centsValue = 100 + centsValue;
            eurosValue--;
        }

        eurosValue -= decreaser.euros;

        if (eurosValue < 0)
        {
            eurosValue = centsValue = 0;
        }

        return (new Money(eurosValue, centsValue));
    }
}
