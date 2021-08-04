/*
 * 3_06_to_3_11_characters_in_string.cpp
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
#include "type_name.h"

using std::cin;
using std::cout;
using std::endl;
using std::string;

int main()
{
    string string1 = "Hello, world!";

    cout << "Original string: " << string1 << endl;

    for (auto &char1 : string1)
    {
        if (isalnum(char1))
        {
            char1 = 'X';
        }
    }

    cout << "Changed string using range-based for loop: " << string1 << endl;

    string string2 = "Hello, world!";
    string::size_type stringCounter2 = 0;

    cout << "Original string: " << string2 << endl;

    while (stringCounter2 < string2.size())
    {
        if (isalnum(string2[stringCounter2]))
        {
            string2[stringCounter2] = 'X';
        }

        stringCounter2++;
    }

    cout << "Changed string using while loop: " << string2 << endl;

    string string3 = "Hello, world!";

    cout << "Original string: " << string3 << endl;

    for (string::size_type stringCounter3 = 0; stringCounter3 < string3.size(); ++stringCounter3)
    {
        if (isalnum(string3[stringCounter3]))
        {
            string3[stringCounter3] = 'X';
        }
    }

    cout << "Changed string using traditional for loop: " << string3 << endl;

    cout << endl;

    string string4;

    cout << "Enter a string of characters, including punctuation: ";
    getline(cin, string4);

    cout << "The entered string, with the punctuation removed: ";

    for (auto char4 : string4)
    {
        if (!ispunct(char4))
        {
            cout << char4;
        }
    }

    cout << endl;

    const string string5 = "Keep out!";

    for (auto &char5 : string5)
    {
        cout << "\"" << char5 << "\" is of type: " << type_name<decltype(char5)>() << endl;
    }

    return 0;
}
