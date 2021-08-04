/*
 * 3_43_to_3_45_multidimensional_arrays.cpp
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

using std::cout;
using std::endl;
using std::cbegin;
using std::cend;

int main()
{
    int ia1[3][4] = {{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}};

    cout << "ia1[3][4] (using Range for loop):" << endl;

    for (int (&i)[4] : ia1)
    {
        for (int j : i)
        {
            cout << " " << j;
        }

        cout << endl;
    }

    cout << "ia1[3][4] (using sub-scripts):" << endl;

    for (size_t i = 0; i != 3; ++i)
    {
        for (size_t j = 0; j != 4; ++j)
        {
            cout << " " << ia1[i][j];
        }

        cout << endl;
    }

    cout << "ia1[3][4] (using pointers):" << endl;

    for (const int (*i)[4] = cbegin(ia1); i != cend(ia1); ++i)
    {
        for (const int *j = cbegin(*i); j != cend(*i); ++j)
        {
            cout << " " << *j;
        }

        cout << endl;
    }

    using array_4_ints = int[4];

    cout << "ia1[3][4] (using Range for loop and type alias):" << endl;

    for (array_4_ints &i : ia1)
    {
        for (int j : i)
        {
            cout << " " << j;
        }

        cout << endl;
    }

    using unsized_int = size_t;

    cout << "ia1[3][4] (using sub-scripts and type alias):" << endl;

    for (unsized_int i = 0; i != 3; ++i)
    {
        for (unsized_int j = 0; j != 4; ++j)
        {
            cout << " " << ia1[i][j];
        }

        cout << endl;
    }

    cout << "ia1[3][4] (using pointers and type alias):" << endl;

    for (const array_4_ints *i = cbegin(ia1); i != cend(ia1); ++i)
    {
        for (const int *j = cbegin(*i); j != cend(*i); ++j)
        {
            cout << " " << *j;
        }

        cout << endl;
    }

    cout << "ia1[3][4] (using Range for loop and auto):" << endl;

    for (auto &i : ia1)
    {
        for (int j : i)
        {
            cout << " " << j;
        }

        cout << endl;
    }

    cout << "ia1[3][4] (using sub-scripts and auto):" << endl;

    for (auto i = 0; i != 3; ++i)
    {
        for (auto j = 0; j != 4; ++j)
        {
            cout << " " << ia1[i][j];
        }

        cout << endl;
    }

    cout << "ia1[3][4] (using pointers and auto):" << endl;

    for (auto i = cbegin(ia1); i != cend(ia1); ++i)
    {
        for (auto j = cbegin(*i); j != cend(*i); ++j)
        {
            cout << " " << *j;
        }

        cout << endl;
    }

    return 0;
}
