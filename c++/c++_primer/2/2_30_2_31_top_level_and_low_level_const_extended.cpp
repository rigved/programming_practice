/*
 * 2_30_2_31_top_level_and_low_level_const_extended.cpp
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
    const int v2 = 0;
    int v1 = v2, i = 42;
    int *p1 = &v1, &r1 = v1;
    const int *p2 = &v2, *const p3 = &i, &r2 = v2;

    std::cout << v2 << " " << v1 << " " << i << " " << p1 << " " << *p1 << " " << r1 << " " << p2 << " " << *p2
                << " " << p3 << " " << *p3 << " " << r2 << std::endl;

    r1 = v2;

    std::cout << v2 << " " << v1 << " " << i << " " << p1 << " " << *p1 << " " << r1 << " " << p2 << " " << *p2
              << " " << p3 << " " << *p3 << " " << r2 << std::endl;

    // p1 = p2; // Invalid conversion from "const int*" to "int*"
    p2 = p1;

    std::cout << v2 << " " << v1 << " " << i << " " << p1 << " " << *p1 << " " << r1 << " " << p2 << " " << *p2
              << " " << p3 << " " << *p3 << " " << r2 << std::endl;

    // p1 = p3; // Invalid conversion from "const int*" to "int*"
    p2 = p3;

    std::cout << v2 << " " << v1 << " " << i << " " << p1 << " " << *p1 << " " << r1 << " " << p2 << " " << *p2
              << " " << p3 << " " << *p3 << " " << r2 << std::endl;

    return 0;
}
