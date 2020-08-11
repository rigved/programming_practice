/*
 * UserInterface.java
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


import java.util.Scanner;

public class UserInterface
{
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner)
    {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start()
    {
        String command, joke;

        while (true)
        {
            System.out.println("Commands:");
            System.out.println("1 - add joke");
            System.out.println("2 - draw joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            command = scanner.nextLine();

            if (command.equals("X"))
            {
                break;
            }
            else if (command.equals("1"))
            {
                System.out.println("Write the joke to be added:");
                joke = scanner.nextLine();

                this.jokeManager.addJoke(joke);
            }
            else if (command.equals("2"))
            {
                System.out.println(this.jokeManager.drawJoke());
            }
            else if (command.equals("3"))
            {
                this.jokeManager.printJokes();
            }
        }
    }
}
