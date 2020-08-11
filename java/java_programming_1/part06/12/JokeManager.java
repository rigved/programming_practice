/*
 * JokeManager.java
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
import java.util.Random;

public class JokeManager
{
    private ArrayList<String> jokes;

    public JokeManager()
    {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke)
    {
        this.jokes.add(joke);
    }

    public String drawJoke()
    {
        if (this.isEmpty())
        {
            return ("Jokes are in short supply.");
        }

        return (this.jokes.get((new Random()).nextInt(this.jokes.size())));
    }

    public void printJokes()
    {
        for (String joke : this.jokes)
        {
            System.out.println(joke);
        }
    }

    public boolean isEmpty()
    {
        return this.jokes.isEmpty();
    }
}
