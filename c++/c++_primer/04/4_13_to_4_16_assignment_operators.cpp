/*
 * 4_13_to_4_16_assignment_operators.cpp
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

int* getPtr()
{
    int i = 42;

    return (&i);
}

int main()
{
    int i;
    double d;

    d = i = 3.5;

    cout << "i: " << i << endl << "d: " << d << endl;

    i = d = 3.5;

    cout << "i: " << i << endl << "d: " << d << endl;

    if (i = 42)
    {
        cout << "i set to " << i << endl;
    }

    double dVal;
    int iVal;
    int *pInt;

    pInt = &iVal;
    dVal = iVal = 0;

    cout << "iVal: " << iVal << endl << "dVal: " << dVal << endl << "pInt: " << pInt << endl << "*pInt: " << *pInt << endl;

    if ((pInt = getPtr()) != 0)
    {
        cout << "New pInt: " << pInt << endl << "New *pInt: " << *pInt << endl;
    }
    else
    {
        cout << "Value pointed to by pInt is no longer addressable. pInt: " << pInt << endl;
    }

    if (i == 1024)
    {
        cout << "i is 1024." << endl;
    }
    else
    {
        cout << "i is not 1024." << endl;
    }

    return 0;
}
