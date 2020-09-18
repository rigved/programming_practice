/*
 * Searching.java
 * Copyright (C) 2020  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.ArrayList;
import java.util.Scanner;

public class Searching
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());

        for (int i = 0; i < numberOfBooks; i++)
        {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");

        long start = System.currentTimeMillis();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");

        if (linearSearchId < 0)
        {
            System.out.println("Book not found");
        }
        else
        {
            System.out.println("Found it! " + books.get(linearSearchId));
        }

        System.out.println("");

        System.out.println("");

        System.out.println("Seaching with binary search:");
        start = System.currentTimeMillis();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.currentTimeMillis() - start) + " milliseconds.");

        if (binarySearchId < 0)
        {
            System.out.println("Book not found");
        }
        else
        {
            System.out.println("Found it! " + books.get(binarySearchId));
        }
    }

    public static int linearSearch(ArrayList<Book> books, int searchedId)
    {
        for (int index = 0; index < books.size(); index++)
        {
            if (books.get(index).getId() == searchedId)
            {
                return index;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, long searchedId)
    {
        int beginId = 0, endId = (books.size() - 1);

        while (beginId <= endId)
        {
            int middleId = (beginId + endId) / 2;

            if (books.get(middleId).getId() == searchedId)
            {
                return middleId;
            }
            else if (books.get(middleId).getId() < searchedId)
            {
                beginId = middleId + 1;
            }
            else
            {
                endId = middleId - 1;
            }
        }

        return -1;
    }
}
