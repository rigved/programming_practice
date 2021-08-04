/*
 * 3_34_to_3_36_arrays_and_pointers_extended.cpp
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
using std::begin;
using std::end;
using std::vector;

int main()
{
    int arr1[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int *pInt1 = arr1;
    int *pInt2 = arr1 + 4;

    cout << "arr1[]:";

    for (auto item : arr1)
    {
        cout << " " << item;
    }

    cout << endl;

    cout << "*pInt1: " << *pInt1 << endl;
    cout << "*pInt2: " << *pInt2 << endl;

    pInt1 += (pInt2 - pInt1);

    cout << "*pInt1 (after \"pInt1 += (pInt2 - pInt1)\"): " << *pInt1 << endl;

    for (auto pInt = begin(arr1); pInt != end(arr1); ++pInt)
    {
        *pInt = 0;
    }

    cout << "Modified arr1[]:";

    for (auto item : arr1)
    {
        cout << " " << item;
    }

    cout << endl;

    int arr2[] = {0, 0, 0, 0, 0, 0, 0, 0, 10, 0};

    cout << "Comparing arr1[] and arr2[]: ";
    bool equal = true;

    for (auto ixArr1 = begin(arr1), ixArr2 = begin(arr2); (ixArr1 != end(arr1)) && (ixArr2 != end(arr2)); ++ixArr1, ++ixArr2)
    {
        if (*ixArr1 != *ixArr2)
        {
            equal = false;
            break;
        }
    }

    if (equal)
    {
        cout << "equal" << endl;
    }
    else
    {
        cout << "not equal" << endl;
    }

    vector<int> vec1{0, 0, 0, 0, 0, 0, 0, 10, 0, 0};
    vector<int> vec2(10, 0);
    equal = true;

    cout << "Comparing vec1 and vec2: ";

    for (auto ixVec1 = vec1.cbegin(), ixVec2 = vec2.cbegin();
         (ixVec1 != vec1.cend()) && (ixVec2 != vec2.cend()); ++ixVec1, ++ixVec2)
    {
        if (*ixVec1 != *ixVec2)
        {
            equal = false;
            break;
        }
    }

    if (equal)
    {
        cout << "equal" << endl;
    }
    else
    {
        cout << "not equal" << endl;
    }

    return 0;
}
