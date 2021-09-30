/*
 * 5_18_5_19_do_while_statement.cpp
 * Copyright (C) 2021  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 */

#include <iostream>
#include <string>

bool get_response()
{
    return false;
}

int get_response(int i)
{
    if (i < 10)
    {
        return 42;
    }
    else
    {
        return -1;
    }
}

int main()
{
    do
    {
        int v1, v2;

        std::cout << "Please enter two numbers to sum: ";
        if (std::cin >> v1 >> v2)
        {
            std::cout << "Sum is: " << (v1 + v2) << std::endl;
        }
    }
    while (std::cin);

    int i = 0, ival = 42;

    do
    {
        std::cout << ival << " " << i++ << std::endl;
    }
    while (ival == get_response(i));

    bool ival2;

    do
    {
        ival2 = get_response();

        std::cout << ival2 << std::endl;
    }
    while (ival2);

    std::cin.clear();
    std::cin.ignore(10000, '\n');

    do
    {
        std::string string1, string2;

        std::cout << "Enter two strings (enter quit to stop): ";
        std::cin >> string1 >> string2;

        if ((string1 == "quit") || (string2 == "quit"))
        {
            break;
        }
        else
        {
            if (string1 < string2)
            {
                std::cout << string1 << " is less than " << string2 << std::endl;
            }
            else
            {
                std::cout << string2 << " is less than " << string1 << std::endl;
            }
        }
    }
    while (true);

    return 0;
}
