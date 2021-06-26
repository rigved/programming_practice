/*
 * 2_36_2_37_decltype_type_specifier.cpp
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
 */


#include <iostream>
#include "type_name.h"

int main()
{
    int a = 3, b = 4;
    decltype(a) c = a;
    decltype(b) d = a;

    std::cout << type_name<decltype(a)>() << " a = " << a << "\n" << type_name<decltype(b)>() << " b = " << b << "\n"
              << type_name<decltype(c)>() << " c = " << c << "\n" << type_name<decltype(d)>() << " d = " << d << std::endl;

    ++c;
    ++d;

    std::cout << "a = " << a << "\n" << "b = " << b << "\n" << "++c = " << c << "\n" << "++d = " << d << std::endl;

    int a2 = 3, b2 = 4;
    decltype(a) c2 = a2;
    decltype(a2 = b2) d2 = a2;

    std::cout << type_name<decltype(a2)>() << " a2 = " << a2 << "\n" << type_name<decltype(b2)>() << " b2 = " << b2
              << "\n" << type_name<decltype(c2)>() << " c2 = " << c2 << "\n" << type_name<decltype(d2)>() << " d2 = "
              << d2 << std::endl;

    int i = 42;
    const int j = 42;

    auto x1 = i;
    decltype(i) y1 = i;

    auto x2 = j;
    decltype(j) y2 = j;

    std::cout << type_name<decltype(x1)>() << " x1 = " << x1 << "\n" << type_name<decltype(x2)>() << " x2 = " << x2
              << "\n" << type_name<decltype(y1)>() << " y1 = " << y1 << "\n" << type_name<decltype(y2)>() << " y2 = "
              << y2 << std::endl;

    return 0;
}
