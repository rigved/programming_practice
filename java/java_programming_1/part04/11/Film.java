/*
 * Film.java
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


public class Film
{
    private String name;
    private int ageRating;

    public Film(String filmName, int filmAgeRating)
    {
        this.name = filmName;
        this.ageRating = filmAgeRating;
    }

    public String name()
    {
        return this.name;
    }

    public int ageRating()
    {
        return this.ageRating;
    }
}
