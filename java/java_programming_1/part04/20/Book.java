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
    private String title, numberOfPages, publicationYear;

    public Book(String title, String numberOfPages, String publicationYear)
    {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.publicationYear = publicationYear;
    }

    public String getTitle()
    {
        return this.title;
    }

    public String getNumberOfPages()
    {
        return this.numberOfPages;
    }

    public String getPublicationYear()
    {
        return this.publicationYear;
    }

    @Override
    public String toString()
    {
        return (this.title + ", " + this.numberOfPages + " pages, " + this.publicationYear);
    }
}
