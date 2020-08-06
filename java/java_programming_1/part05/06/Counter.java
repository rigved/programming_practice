/*
 * Counter.java
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


public class Counter
{
    private int counter;

    public Counter(int startValue)
    {
        this.counter = startValue;
    }

    public Counter()
    {
        this(0);
    }

    public int value()
    {
        return this.counter;
    }

    public void increase(int increaseBy)
    {
        if (increaseBy >= 0)
        {
            this.counter += increaseBy;
        }
    }

    public void decrease(int decreaseBy)
    {
        if (decreaseBy >= 0)
        {
            this.counter -= decreaseBy;
        }
    }

    public void increase()
    {
        this.increase(1);
    }

    public void decrease()
    {
        this.decrease(1);
    }
}
