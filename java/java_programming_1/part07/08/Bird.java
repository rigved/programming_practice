/*
 * Bird.java
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


public class Bird
{
    private String nameOfBird, nameOfBirdInLatin;
    private int birdObservations;

    public Bird(String nameOfBird, String nameOfBirdInLatin)
    {
        this.nameOfBird = nameOfBird;
        this.nameOfBirdInLatin = nameOfBirdInLatin;
        this.birdObservations = 0;
    }

    public String getNameOfBird()
    {
        return this.nameOfBird;
    }

    public void addObservation()
    {
        this.birdObservations++;
    }

    @Override
    public String toString()
    {
        String birdDescription = this.nameOfBird +
                                 " (" + this.nameOfBirdInLatin + "): " +
                                 this.birdObservations;

        if (this.birdObservations == 1)
        {
            birdDescription += " observation";
        }
        else
        {
            birdDescription += " observations";
        }

        return birdDescription;
    }
}
