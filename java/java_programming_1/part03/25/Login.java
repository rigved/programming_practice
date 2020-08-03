/*
 * Login.java
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

public class Login
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        boolean loginStatus = false;

        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (username.equals("alex") && password.equals("sunshine"))
        {
            loginStatus = true;
        }
        else if (username.equals("emma") && password.equals("haskell"))
        {
            loginStatus = true;
        }

        if (loginStatus)
        {
            System.out.println("You have successfully logged in!");
        }
        else
        {
            System.out.println("Incorrect username or password!");
        }

        scanner.close();
    }
}
