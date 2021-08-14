/*
 * 5_04_statement_scope.cpp
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

int main()
{
    std::string str = "Hello World!";

    std::string::iterator iter = str.begin();

    std::cout << "String:";

    while (iter != str.end())
    {
        std::cout << " " << *iter;

        ++iter;
    }

    std::cout << std::endl;

    bool status = false;

    while (!status)
    {
        std::cout << "Enter a string. Enter the number \"42\" anywhere in the string to stop: ";

        std::getline(std::cin, str);

        status = (str.find("42") != std::string::npos);
    }

    std::cout << "Entered string contains the number 42." << std::endl;

    return 0;
}
