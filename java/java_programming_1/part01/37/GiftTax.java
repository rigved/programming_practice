/*
 * GiftTax.java
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


import java.util.Scanner;

public class GiftTax
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        double giftTax;

        if (giftValue >= 1000000)
        {
            giftTax = 142100 + ((giftValue - 1000000) * 0.17);
        }
        else if (giftValue >= 200000)
        {
            giftTax = 22100 + ((giftValue - 200000) * 0.15);
        }
        else if (giftValue >= 55000)
        {
            giftTax = 4700 + ((giftValue - 55000) * 0.12);
        }
        else if (giftValue >= 25000)
        {
            giftTax = 1700 + ((giftValue - 25000) * 0.10);
        }
        else if (giftValue >= 5000)
        {
            giftTax = 100 + ((giftValue - 5000) * 0.08);
        }
        else
        {
            giftTax = 0;
        }

        if (giftTax == 0)
        {
            System.out.println("No tax!");
        }
        else
        {
            System.out.println("Tax: " + giftTax);
        }

        scan.close();
    }
}
