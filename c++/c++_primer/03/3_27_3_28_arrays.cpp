/*
 * 3_27_3_28_arrays.cpp
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

string sa1[10];
int ia3[10];

int txt_size()
{
    return 10;
}

int main()
{
    unsigned buf_size = 1024;

    int ia1[buf_size];
    int ia2[4 * 7 - 14];
    int ia3[txt_size()];
    // char st[11] = "fundamental"; // Array initializer is too long and doesn't account for the null character: '\0'

    cout << "buf_size: " << buf_size << endl;
    cout << "type_name<decltype(ia1[buf_size])>(): ";

    for (auto item : ia1)
    {
        cout << type_name<decltype(item)>() << " ";
    }

    cout << endl;
    cout << "type_name<decltype(ia2[4 * 7 - 14])>(): ";

    for (auto item : ia2)
    {
        cout << type_name<decltype(item)>() << " ";
    }

    cout << endl;
    cout << "txt_size(): " << txt_size() << endl << "type_name<decltype(ia3[txt_size()])>(): ";

    for (auto item : ia3)
    {
        cout << type_name<decltype(item)>() << " ";
    }

    cout << endl;

    string sa2[10];
    int ia4[10];

    cout << "sa1[10]:";

    for (auto sa : sa1)
    {
        cout << " " << type_name<decltype(sa)>() << ":" << sa;
    }

    cout << endl;

    cout << "sa2[10]:";

    for (auto sa : sa2)
    {
        cout << " " << type_name<decltype(sa)>() << ":" << sa;
    }

    cout << endl;

    cout << "ia3[10]:";

    for (auto ia : ia3)
    {
        cout << " " << type_name<decltype(ia)>() << ":" << ia;
    }

    cout << endl;

    cout << "ia4[10]:";

    for (auto ia : ia4)
    {
        cout << " " << type_name<decltype(ia)>() << ":" << ia;
    }

    cout << endl;

    return 0;
}
