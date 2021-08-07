/*
 * 4_20_member_access_operators.cpp
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

using std::cout;
using std::endl;
using std::vector;
using std::string;

int main()
{
    vector<string> vectorStrings = {"Hello", "World", "!", ""};

    auto iteratorVectorString = vectorStrings.begin();

    cout << "*iteratorVectorString++: " << *iteratorVectorString++ << endl;

    cout << "*(iteratorVectorString++): " << *(iteratorVectorString++) << endl;

    cout << "(*iteratorVectorString).empty(): " << (*iteratorVectorString).empty() << endl;

    cout << "iteratorVectorString->empty(): " << iteratorVectorString->empty() << endl;

    cout << "*(++iteratorVectorString): " << *(++iteratorVectorString) << endl;

    cout << "iteratorVectorString++->empty(): " << iteratorVectorString++->empty() << endl;

    return 0;
}
