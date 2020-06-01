/*
 * 2_33_to_2_35_auto_type_specifier.cpp
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
    int i = 0, &r = i;
    auto a = r;
    const int ci = i, &cr = ci;
    auto b = ci;
    auto c = cr;
    auto d = &i;
    auto e = &ci;
    auto &g = ci;

    std::cout << a << " " << b << " " << c << " " << d << " " << *d << " " << e << " " << *e << " " << g << std::endl;

    a = 42;

    std::cout << a << " " << b << " " << c << " " << d << " " << *d << " " << e << " " << *e << " " << g << std::endl;

    b = 42;

    std::cout << a << " " << b << " " << c << " " << d << " " << *d << " " << e << " " << *e << " " << g << std::endl;

    c = 42;

    std::cout << a << " " << b << " " << c << " " << d << " " << *d << " " << e << " " << *e << " " << g << std::endl;

    // d = 42; // d is a pointer to int ("int*") so cannot be assigned an "int" value
    *d = 42;

    std::cout << a << " " << b << " " << c << " " << d << " " << *d << " " << e << " " << *e << " " << g << std::endl;

    // e = 42; // e is a const pointer to an int ("const int*") so cannot point to anything else

    // g = 42; // g is a const l-value reference to an int ("const int&") so cannot refer to anything else

    const int i2 = 42;
    auto j = i2;
    const auto &k = i2;
    auto *p = &i2;
    const auto j2 = i2, &k2 = i2;

    std::cout << i2 << " " << j << " " << k << " " << p << " " << *p << " " << j2 << " " << k2 << std::endl;

    j = 0;

    std::cout << i2 << " " << j << " " << k << " " << p << " " << *p << " " << j2 << " " << k2 << std::endl;

    // k = 0; // k is a const int& variable and so cannot be assigned a new value

    // *p = 0; // p is a pointer to a const int ("const int*") variable and so cannot be assigned a new value
    p = &j;

    std::cout << i2 << " " << j << " " << k << " " << p << " " << *p << " " << j2 << " " << k2 << std::endl;

    // j2 = 42; // j is a const int variable and so cannot be assigned a new value

    // k2 = &j2; // k2 is also a const int& variable and so cannot be assigned a new value

    return 0;
}
