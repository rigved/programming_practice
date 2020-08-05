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

    public PaymentCard(double openingBalance)
    {
        this.balance = openingBalance;
    }

    public String toString()
    {
        return ("The card has a balance of " + this.balance + " euros");
    }

    public void eatAffordably()
    {
        if (this.balance >= 2.60)
        {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily()
    {
        if (this.balance >= 4.60)
        {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount)
    {
        if (amount < 0)
        {
            return;
        }
        else if ((this.balance + amount) > 150.0)
        {
            this.balance = 150.0;
        }
        else
        {
            this.balance += amount;
        }
    }
}
