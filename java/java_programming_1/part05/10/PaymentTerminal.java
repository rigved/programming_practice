/*
 * PaymentTerminal.java
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


public class PaymentTerminal
{
    private double money;  // amount of cash in the register
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals


    public PaymentTerminal()
    {
        this.money = 1000.0;
        this.affordableMeals = 0;
        this.heartyMeals = 0;
    }

    public double eatAffordably(double payment)
    {
        double affordableMealCost = 2.5;

        if (payment < affordableMealCost)
        {
            return payment;
        }
        else
        {
            this.money += affordableMealCost;
            this.affordableMeals++;
            return (payment - affordableMealCost);
        }
    }

    public boolean eatAffordably(PaymentCard card)
    {
        double affordableMealCost = 2.5;

        if (card.takeMoney(affordableMealCost))
        {
            this.affordableMeals++;
            return true;
        }
        else
        {
            return false;
        }
    }

    public double eatHeartily(double payment)
    {
        double heartyMealCost = 4.3;

        if (payment < heartyMealCost)
        {
            return payment;
        }
        else
        {
            this.money += heartyMealCost;
            this.heartyMeals++;
            return (payment - heartyMealCost);
        }
    }

    public boolean eatHeartily(PaymentCard card)
    {
        double heartyMealCost = 4.3;

        if (card.takeMoney(heartyMealCost))
        {
            this.heartyMeals++;
            return true;
        }
        else
        {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum)
    {
        if (sum > 0)
        {
            this.money += sum;
            card.addMoney(sum);
        }
    }

    @Override
    public String toString()
    {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
