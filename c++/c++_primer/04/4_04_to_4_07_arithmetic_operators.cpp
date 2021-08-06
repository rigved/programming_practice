/*
 * 4_04_to_4_07_arithmetic_operators.cpp
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

int main()
{
    cout << "((((12 / 3) * 4) + (5 * 15)) + ((24 % 4) / 2)): " << ((((12 / 3) * 4) + (5 * 15)) + ((24 % 4) / 2)) << endl;
    cout << "12 / 3 * 4 + 5 * 15 + 24 % 4 / 2: " << 12 / 3 * 4 + 5 * 15 + 24 % 4 / 2 << endl;

    cout << "-30 * 3 + 21 / 5: " << -30 * 3 + 21 / 5 << endl;
    cout << "-30 + 3 * 21 / 5: " << -30 + 3 * 21 / 5 << endl;
    cout << "30 / 3 * 21 % 5: " << 30 / 3 * 21 % 5 << endl;
    cout << "-30 / 3 * 21 % 4: " << -30 / 3 * 21 % 4 << endl;

    int val1 = 1, val2 = 2;

    cout << "val1: " << val1 << endl << "val2: " << val2 << endl;

    if ((val1 % 2) == 0)
    {
        cout << "va1 is an even number." << endl;
    }
    else
    {
        cout << "val1 is an odd number." << endl;
    }

    if ((val2 % 2) == 0)
    {
        cout << "val2 is an even number." << endl;
    }
    else
    {
        cout << "val2 is an odd number." << endl;
    }

    short short_value = 32767;

    cout << "short_value: " << short_value << endl;

    short_value++;

    cout << "short_value++: " << short_value << endl;

    unsigned unsigned_value = 4294967295;

    cout << "unsigned_value: " << unsigned_value << endl;

    unsigned_value++;

    cout << "unsigned_value++: " << unsigned_value << endl;

    int intArray[2] = {0, 1};
    int *pIntArray = intArray;

    cout << "intArray[2]:";

    for (size_t index = 0; index != 2; ++index)
    {
        cout << " " << intArray[index];
    }

    cout << endl;

    cout << "*pIntArray: " << *pIntArray << endl;
    cout << "*(pIntArray + 1): " << *(pIntArray + 1) << endl;
    cout << "*(pIntArray + 2): " << *(pIntArray + 2) << endl;

    return 0;
}
