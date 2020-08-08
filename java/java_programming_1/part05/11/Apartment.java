/*
 * Apartment.java
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


public class Apartment
{
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare)
    {
        this.rooms = rooms;
        this.squares = squares;
        this.pricePerSquare = pricePerSquare;
    }

    public int getRooms()
    {
        return rooms;
    }

    public int getSquares()
    {
        return squares;
    }

    public int getPricePerSquare()
    {
        return pricePerSquare;
    }

    public void setRooms(int rooms)
    {
        this.rooms = rooms;
    }

    public void setSquares(int squares)
    {
        this.squares = squares;
    }

    public void setPricePerSquare(int pricePerSquare)
    {
        this.pricePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared)
    {
        return (this.squares > compared.squares);
    }

    public int priceDifference(Apartment compared)
    {
        return (Math.abs((this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares)));
    }

    public boolean moreExpensiveThan(Apartment compared)
    {
        return (((this.pricePerSquare * this.squares) - (compared.pricePerSquare * compared.squares)) > 0);
    }
}
