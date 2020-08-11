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
        Item book = new Item("The Lord of the Rings", 2);
        Item phone = new Item("Nokia 3210", 1);
        Item brick = new Item("Brick", 4);

        System.out.println("Book's name: " + book.getName());
        System.out.println("Book's weight: " + book.getWeight());

        System.out.println("Book: " + book);
        System.out.println("Phone: " + phone);
        System.out.println("Brick: " + brick);

        Suitcase suitcase = new Suitcase(5);

        System.out.println(suitcase);

        suitcase.addItem(book);
        System.out.println(suitcase);

        suitcase.addItem(phone);
        System.out.println(suitcase);

        suitcase.addItem(brick);
        System.out.println(suitcase);

        suitcase = new Suitcase(10);

        suitcase.addItem(book);
        suitcase.addItem(phone);
        suitcase.addItem(brick);

        System.out.println("The suitcase contains the following items:");
        suitcase.printItems();
        System.out.println("Total weight: " + suitcase.totalWeight() + " kg");

        Item heaviestItem = suitcase.heaviestItem();
        System.out.println("Heaviest item: " + heaviestItem);

        Suitcase adasSuitcase = new Suitcase(10);

        adasSuitcase.addItem(book);
        adasSuitcase.addItem(phone);

        Suitcase pekkasSuitcase = new Suitcase(10);

        pekkasSuitcase.addItem(brick);

        Hold hold = new Hold(1000);

        hold.addSuitcase(suitcase);
        hold.addSuitcase(adasSuitcase);
        hold.addSuitcase(pekkasSuitcase);

        System.out.println(hold);

        System.out.println("The suitcases in the hold contain the following items:");
        hold.printItems();
    }
}
