/*
 * 3_37_to_3_40_c_style_strings.cpp
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
#include <cstring>

using std::cout;
using std::endl;
using std::string;

int main()
{
    const char ca[] = {'h', 'e', 'l', 'l', 'o'};
    const char *cp = ca;

    while (*cp)
    {
        cout << *cp << endl;

        ++cp;
    }

    string string1 = "Hello, world!";
    string string2 = "How are you doing today?";

    cout << "string1: " << string1 << endl;
    cout << "string2: " << string2 << endl;

    if (string1 < string2)
    {
        cout << "string1 is lesser than string2." << endl;
    }
    else if (string1 > string2)
    {
        cout << "string1 is greater than string2." << endl;
    }
    else
    {
        cout << "string1 and string2 are equal." << endl;
    }

    const char charArray1[] = {'O', 'n', 'e', '\0'};
    const char charArray2[] = {'T', 'w', 'o', '\0'};

    cout << "charArray1[]: ";

    for (auto ca : charArray1)
    {
        cout << ca;
    }

    cout << endl;

    cout << "charArray2[]: ";

    for (auto ca : charArray2)
    {
        cout << ca;
    }

    cout << endl;

    if (strcmp(charArray1, charArray2) < 0)
    {
        cout << "charArray1 is lesser than charArray2." << endl;
    }
    else if (strcmp(charArray1, charArray2) > 0)
    {
        cout << "charArray1 is greater than charArray1." << endl;
    }
    else
    {
        cout << "charArray1 and charArray2 are equal." << endl;
    }

    char charArray3[] = "First array.";
    char charArray4[] = "Second array.";

    // A space and a null character are added to the C-style concatenated string.
    size_t charArraySize = strlen(charArray3) + strlen(charArray4) + 2;

    char charArray5[charArraySize];

    strcpy(charArray5, charArray3);
    strcat(charArray5, " ");
    strcat(charArray5, charArray4);

    cout << "charArray5[]: ";

    for (auto ca : charArray5)
    {
        cout << ca;
    }

    cout << endl;

    return 0;
}
