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
    private String author, name;
    private int pages;

    public Book(String author, String name, int pages)
    {
        this.author = author;
        this.name = name;
        this.pages = pages;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public String getName()
    {
        return this.name;
    }

    public int getPages()
    {
        return this.pages;
    }

    @Override
    public String toString()
    {
        return (this.author + ", " + this.name + ", " + this.pages + " pages");
    }
}
