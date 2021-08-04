/*
 * 3_30_to_3_32_array_access.cpp
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
#include <vector>

using std::cin;
using std::cout;
using std::endl;
using std::vector;

int main()
{
    constexpr size_t array_size = 10;
    int ia[array_size];

    for (size_t ix = 0; ix < array_size; ++ix)
    {
        ia[ix] = ix;
    }

    cout << "ia[array_size]:";

    for (auto item : ia)
    {
        cout << " " << item;
    }

    cout << endl;

    int ia_copy[array_size];

    for (size_t ix = 0; ix < array_size; ++ix)
    {
        ia_copy[ix] = ia[ix];
    }

    cout << "ia_copy[10]:";

    for (auto item : ia_copy)
    {
        cout << " " << item;
    }

    cout << endl;

    vector<int> va;

    for (size_t ix = 0; ix < array_size; ++ix)
    {
        va.push_back(ix);
    }

    cout << "va:";

    for (auto item : va)
    {
        cout << " " << item;
    }

    cout << endl;

    return 0;
}
