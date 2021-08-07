/*
 * 4_18_4_19_increment_and_decrement_operators.cpp
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
using std::vector;

int main()
{
    vector<int> vInt = {5, 4, 3, 2, 1, 0, -1, -2, -3, -4, -5};

    auto pBegin = vInt.cbegin();

    cout << "vInt:";

    for (auto item : vInt)
    {
        cout << " " << item;
    }

    cout << endl;

    cout << "Non-negative values in vInt:";

    while ((pBegin != vInt.cend()) && (*pBegin >= 0))
    {
        cout << " " << *++pBegin;
    }

    cout << endl;

    int iVal = 0;
    int *ptr = &iVal;
    auto vec = vInt;

    cout << "(ptr != 0) && (*ptr)++: " << ((ptr != 0) && (*ptr)++) << endl;
    cout << "Value at *ptr after the previous postfix increment operation: " << *ptr << endl;

    cout << "iVal++ && iVal: " << (iVal++ && iVal) << endl;
    cout << "iVal after the previous postfix increment operation: " << iVal << endl;

    cout << "vec[iVal++] <= vec[iVal]: " << (vec[iVal++] <= vec[iVal]) << endl;

    return 0;
}
