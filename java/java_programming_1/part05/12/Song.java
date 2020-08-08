/*
 * Song.java
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


public class Song
{
    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds)
    {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString()
    {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }

    public boolean equals(Object compared)
    {
        if (this == compared)
        {
            return true;
        }

        if (!(compared instanceof Song))
        {
            return false;
        }

        Song comparedSong = (Song) compared;

        if (this.artist.equals(comparedSong.artist) &&
                this.name.equals(comparedSong.name) &&
                this.durationInSeconds == comparedSong.durationInSeconds)
        {
            return true;
        }

        return false;
    }
}
