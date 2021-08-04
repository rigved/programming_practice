/*
 * 3_12_3_13_vectors.cpp
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
#include "type_name.h"

using std::cin;
using std::cout;
using std::endl;
using std::string;
using std::vector;

int main()
{
    vector<vector<int>> integerVector1;
    vector<string> stringVector1(10, "null");

    for (const auto &stringVariable : stringVector1)
    {
        cout << stringVariable << endl;
    }

    vector<int> integerVector2(10);

    for (const auto &integerVariable: integerVector2)
    {
        cout << type_name<decltype(integerVariable)>() << " " << integerVariable << endl;
    }

    vector<int> integerVector3(10, 42);

    for (const auto &integerVariable: integerVector3)
    {
        cout << type_name<decltype(integerVariable)>() << " " << integerVariable << endl;
    }

    vector<int> integerVector4{10};

    for (const auto &integerVariable: integerVector4)
    {
        cout << type_name<decltype(integerVariable)>() << " " << integerVariable << endl;
    }

    vector<int> integerVector5{10, 42};

    for (const auto &integerVariable: integerVector5)
    {
        cout << type_name<decltype(integerVariable)>() << " " << integerVariable << endl;
    }

    vector<string> stringVector2{10};

    for (const auto &stringVariable: stringVector2)
    {
        cout << type_name<decltype(stringVariable)>() << " " << stringVariable << endl;
    }

    vector<string> stringVector3{10, "hi"};

    for (const auto &stringVariable: stringVector3)
    {
        cout << type_name<decltype(stringVariable)>() << " " << stringVariable << endl;
    }
}
