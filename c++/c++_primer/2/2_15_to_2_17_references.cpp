/*
 * 2_15_to_2_17_references.cpp
 * Copyright (C) 2020  Rigved Rakshit
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
 */


#include <iostream>

int main()
{
    int ival = 1.01;
    // int &rval1 = 1.01; // Non-const lvalue reference of type int& cannot bind to a constant
    int &rval2 = ival;
    // int &rval3; // lvalue reference must be initialized as they cannot be rebound later

    std::cout << rval2 << std::endl;

    int i = 0, &r1 = i;
    double d = 0, &r2 = d;

    std::cout << r1 << " " << r2 << std::endl;

    r2 = 3.14159;

    std::cout << d << std::endl;

    r2 = r1;

    std::cout << d << std::endl;

    i = r1;

    std::cout << i << " " << r1 << std::endl;

    r1 = d;

    std::cout << i << " " << d << std::endl;

    int j, &rj = j;

    j = 5;
    rj = 10;

    std::cout << j << " " << rj << std::endl;

    return 0;
}
