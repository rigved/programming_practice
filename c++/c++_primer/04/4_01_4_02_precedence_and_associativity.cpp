/*
 * 4_01_4_02_precedence_and_associativity.cpp
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
    cout << "Using parenthesis: " << (5 + ((10 * 20) / 2)) << endl;
    cout << "Without using parenthesis: " << 5 + 10 * 20 / 2 << endl;

    vector<int> vec{0, 1, 2, 3, 4, 5};

    cout << "Using parenthesis: " << *(vec.begin()) << endl;
    cout << "Without using parenthesis: " << *vec.begin() << endl;

    cout << "Using parenthesis: " << ((*(vec.begin())) + 1) << endl;
    cout << "Without using parenthesis: " << *vec.begin() + 1 << endl;

    return 0;
}
