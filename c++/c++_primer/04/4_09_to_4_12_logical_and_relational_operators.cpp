/*
 * 4_09_to_4_12_logical_and_relational_operators.cpp
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

using std::cin;
using std::cout;
using std::endl;

int main()
{
    const char *cp1 = "Hello World";

    if (cp1 && *cp1)
    {
        cout << "Condition 1: " << cp1 << " - " << *cp1 << endl;
    }

    const char *cp2 = "";

    if (cp2)
    {
        cout << "Condition 2: " << cp2 << " - " << *cp2 << endl;
    }

    if (*cp2)
    {
        cout << "Condition 3: " << cp2 << " - " << *cp2 << endl;
    }

    int input;

    cout << "Enter integers (enter '42' to stop):" << endl;

    while ((cin >> input) && (input != 42)) {}

    cout << "Enter 4 integers: ";

    int a, b, c, d;

    cin >> a >> b >> c >> d;

    if ((a > b) && (b > c) && (c > d))
    {
        cout << "a > b > c > d" << endl;
    }

    int i = 1, j = 2, k = 3;

    cout << "i: " << i << endl << "j: " << j << endl << "k: " << k << endl;

    cout << "i != j < k: " << (i != j < k) << endl;
    cout << "i == j < k: " << (i == j < k) << endl;

    return 0;
}
