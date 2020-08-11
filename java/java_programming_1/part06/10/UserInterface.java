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
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner)
    {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start()
    {
        String command, task;
        int removeTaskID;

        while (true)
        {
            System.out.print("Command: ");
            command = scanner.nextLine();

            if (command.equals("stop"))
            {
                break;
            }
            else if (command.equals("add"))
            {
                System.out.print("To add: ");
                task = scanner.nextLine();

                this.todoList.add(task);
            }
            else if (command.equals("list"))
            {
                this.todoList.print();
            }
            else if (command.equals("remove"))
            {
                System.out.print("Which one is removed? ");
                removeTaskID = Integer.valueOf(scanner.nextLine());

                this.todoList.remove(removeTaskID);
            }
        }
    }
}
