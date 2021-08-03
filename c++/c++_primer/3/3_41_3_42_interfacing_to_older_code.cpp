/*
 * 3_41_3_42_interfacing_to_older_code.cpp
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

using std::cout;
using std::endl;
using std::begin;
using std::end;
using std::vector;

int main()
{
    int intArray1[] = {0, 1, 2, 3, 4, 5};
    vector<int> intVector(begin(intArray1), end(intArray1));

    cout << "intArray1[]:";

    for (auto item : intArray1)
    {
        cout << " " << item;
    }

    cout << endl;

    cout << "intVector:";

    for (auto item : intVector)
    {
        cout << " " << item;
    }

    cout << endl;

    for (auto index = intVector.begin(); index < intVector.end(); ++index)
    {
        *index += 10;
    }

    cout << "Modified intVector:";

    for (auto item : intVector)
    {
        cout << " " << item;
    }

    cout << endl;

    int intArray2[intVector.size()];
    int *pIntArray2 = intArray2;

    for (auto item : intVector)
    {
        *pIntArray2 = item;

        ++pIntArray2;
    }

    cout << "intArray2[]:";

    for (auto item : intArray2)
    {
        cout << " " << item;
    }

    cout << endl;

    return 0;
}
