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


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();
        String title, numberOfPages, publicationYear;

        while (true)
        {
            System.out.print("Title: ");
            title = reader.nextLine();

            if (title.isEmpty())
            {
                break;
            }

            System.out.print("Pages: ");
            numberOfPages = reader.nextLine();

            System.out.print("Publication year: ");
            publicationYear = reader.nextLine();

            books.add(new Book(title, numberOfPages, publicationYear));
        }

        System.out.println();

        System.out.print("What information will be printed? ");
        String informationQuery = reader.nextLine();

        if (informationQuery.equals("everything"))
        {
            for (Book book: books)
            {
                System.out.println(book);
            }
        }
        else if (informationQuery.equals("name"))
        {
            for (Book book: books)
            {
                System.out.println(book.getTitle());
            }
        }

        reader.close();
    }
}
