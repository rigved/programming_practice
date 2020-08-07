/*
 * PaymentCard.java
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


public class PaymentCard
{
    private double balance;

    public PaymentCard(double balance)
    {
        this.balance = balance;
    }

    public double balance()
    {
        return this.balance;
    }

    public void addMoney(double increase)
    {
        if (increase > 0)
        {
            this.balance += increase;
        }
    }

    public boolean takeMoney(double amount)
    {
        if (this.balance >= amount)
        {
            this.balance -= amount;
            return true;
        }

        return false;
    }
}
