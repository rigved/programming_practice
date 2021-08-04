/*
 * 2_27_to_2_29_references_and_pointers_to_const.cpp
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
    int i = -1;
    // int &r = 0; // Cannot bind non-const lvalue reference of type "int&" to an rvalue of type "int"
    int *const p2 = &i;
    const int j = -2;
    const int *const p3 = &j;
    const int *p1 = &j;
    // const int &const r2; // "const" qualifiers cannot be applied to "const int&"
    const int i2 = i, &r = i;

    std::cout << i << " " << p2 << " " << *p2 << " " << j << " " << p3 << " " << *p3
                << p1 << " " << *p1 << " " << i2 << " " << r << std::endl;

    int k;
    // int *const cp; // Since the address held by a "const pointer" cannot be changed, it must be initialized
    int *p4;
    // const int ic, &r2 = ic; // Since the value of a "const int" cannot be changed, it must be initialized
    const int *p;

    std::cout << k << " " << p4 << " " << *p4 << " " << p << " " << *p << std::endl;

    p1 = p3;

    std::cout << p1 << " " << *p1 << " " << p3 << " " << *p3 << std::endl;

    // p2 = p1; // The address held by a "const pointer" cannot be changed

    return 0;
}
