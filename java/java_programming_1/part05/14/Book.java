/*
 * Book.java
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


public class Book
{
    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear)
    {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName()
    {
        return name;
    }

    public int getPublicationYear()
    {
        return publicationYear;
    }

    @Override
    public boolean equals(Object compared)
    {
        if (this == compared)
        {
            return true;
        }

        if (!(compared instanceof Book))
        {
            return false;
        }

        Book comparedBook = (Book) compared;

        if (this.name.equals(comparedBook.name) &&
                this.publicationYear == comparedBook.publicationYear)
        {
            return true;
        }

        return false;
    }
}
