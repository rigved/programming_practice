/*
 * 4_21_to_4_23_conditional_operator.cpp
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
#include <string>

using std::cin;
using std::cout;
using std::endl;
using std::vector;
using std::string;

int main()
{
    vector<int> vectorInt = {1, 2, 3, 4, 5};

    cout << "vectorInt:";

    for (auto item : vectorInt)
    {
        cout << " " << item;
    }

    cout << endl;

    for (size_t index = 0; index != vectorInt.size(); ++index)
    {
        vectorInt.at(index) = ((vectorInt.at(index) % 2) != 0) ? (vectorInt.at(index) * 2) : vectorInt.at(index);
    }

    cout << "Modified vectorInt:";

    for (auto item : vectorInt)
    {
        cout << " " << item;
    }

    cout << endl;

    unsigned grade;

    cout << "Enter grade (between 0 and 100 inclusive): ";
    cin >> grade;

    if ((grade >= 0) && (grade <= 100))
    {
        string finalGrade = (grade < 60) ? "fail" : ((grade <= 75) ? "low pass" : ((grade < 90) ? "pass"
                                                                                                : "high pass"));

        cout << "finalGrade (using conditional operator): " << finalGrade << endl;

        if (grade < 60)
        {
            finalGrade = "fail";
        }
        else if (grade <= 75)
        {
            finalGrade = "low pass";
        }
        else if (grade < 90)
        {
            finalGrade = "pass";
        }
        else
        {
            finalGrade = "high pass";
        }

        cout << "finalGrade (using if-else statements): " << finalGrade << endl;
    }
    else
    {
        cout << "Incorrect grade entered." << endl;
    }

    string s = "word";
    string pl = s + ((s[s.size() - 1] == 's') ? "" : "s");

    cout << "s: " << s << endl << "pl: " << pl << endl;

    return 0;
}
