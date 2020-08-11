/*
 * Main.java
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


public class Main
{
    public static void main(String[] args)
    {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name: " + book.getName());
        System.out.println("Gift's weight: " + book.getWeight());

        System.out.println("Gift: " + book);

        Package gifts = new Package();

        gifts.addGift(book);

        System.out.println(gifts.totalWeight());

        Gift book2 = new Gift("Harry Potter and the Chamber of Secrets", 2);

        gifts.addGift(book2);

        Gift book3 = new Gift("Harry Potter and the Prisoner of Askaban", 2);

        gifts.addGift(book3);

        Gift book4 = new Gift("Harry Potter and the Goblet of Fire", 2);

        gifts.addGift(book4);

        Gift book5 = new Gift("Harry Potter and the Order of the Phoenix", 3);

        gifts.addGift(book5);

        Gift book6 = new Gift("Harry Potter and the Half-Blood Prince", 3);

        gifts.addGift(book6);

        Gift book7 = new Gift("Harry Potter and the Deathly Hallows", 6);

        gifts.addGift(book7);

        System.out.println(gifts.totalWeight());
    }
}
