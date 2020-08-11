/*
 * TextUI.java
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

public class TextUI
{
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI(Scanner scanner, SimpleDictionary dictionary)
    {
        this.scanner = scanner;
        this.dictionary = dictionary;
    }

    public void start()
    {
        String command, word, translation;

        while (true)
        {
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equals("end"))
            {
                System.out.println("Bye bye!");
                break;
            }
            else if (command.equals("add"))
            {
                System.out.print("Word: ");
                word = scanner.nextLine();
                System.out.print("Translation: ");
                translation = scanner.nextLine();

                this.dictionary.add(word, translation);
            }
            else if (command.equals("search"))
            {
                System.out.print("To be translated: ");
                word = scanner.nextLine();

                translation = this.dictionary.translate(word);

                if (translation == null)
                {
                    System.out.println("Word " + word + " was not found");
                }
                else
                {
                    System.out.println("Translation: " + translation);
                }
            }
            else
            {
                System.out.println("Unknown command");
            }
        }
    }
}
