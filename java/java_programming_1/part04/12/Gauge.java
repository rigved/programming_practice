/*
 * Gauge.java
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


public class Gauge
{
    private int value;

    public Gauge()
    {
        this.value = 0;
    }

    public void increase()
    {
        if (this.value < 5)
        {
            this.value++;
        }
    }

    public void decrease()
    {
        if (this.value > 0)
        {
            this.value--;
        }
    }

    public int value()
    {
        return this.value;
    }

    public boolean full()
    {
        return (this.value == 5);
    }
}
