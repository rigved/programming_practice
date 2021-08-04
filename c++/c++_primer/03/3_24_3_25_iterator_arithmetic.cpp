/*
 * 3_24_3_25_iterator_arithmetic.cpp
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
    int number;
    vector<int> integerVector;

    cout << "Enter positive numbers. Enter a negative number to stop." << endl;

    while (cin >> number)
    {
        if (number < 0)
        {
            break;
        }
        else
        {
            integerVector.push_back(number);
        }
    }

    cout << endl;

    cout << "Sum of adjacent elements:" << endl;

    for (auto iterator = integerVector.cbegin(); iterator != (integerVector.cend() - 1); ++iterator)
    {
        cout << (*iterator + *(iterator + 1)) << " ";
    }

    cout << endl;

    cout << "Sum of first and last, second and second-to-last, and so on..." << endl;

    for (auto iterator1 = integerVector.cbegin(), iterator2 = (integerVector.cend() - 1); iterator1 != integerVector.cend(); ++iterator1, --iterator2)
    {
        cout << (*iterator1 + *iterator2) << " ";
    }

    cout << endl;

    int grade;
    vector<int> gradeClusters(11, 0);
    auto iterator = gradeClusters.begin();

    cout << "Enter grades as positive numbers. Enter a negative number to stop." << endl;

    while (cin >> grade)
    {
        if (grade < 0)
        {
            break;
        }
        else if (grade <= 100)
        {
            ++(*(iterator + (grade / 10)));
        }
    }

    cout << "Grade clusters: ";

    for (auto iterator1 = gradeClusters.cbegin(); iterator1 != gradeClusters.cend(); ++iterator1)
    {
        cout << *iterator1 << " ";
    }

    cout << endl;

    return 0;
}
