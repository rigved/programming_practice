/*
 * 2_25_compound_type_declarations.cpp
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
    // int* ip1, &ir1 = ip1; // Invalid conversion from int* to int
    int* ip1, &ir1 = *ip1;

    std::cout << ip1 << " " << *ip1 << " " << ir1 << std::endl;

    int i2, *ip2 = 0;
    // The following line causes an exit code of 139 due to a SIGSEGV
    // as a null pointer does not point to any valid memory location.
    // std::cout << *ip2 << std::endl;

    std::cout << i2 << " " << ip2 << std::endl;

    int* ip3, ip4;

    std::cout << ip3 << " " << *ip3 << " " << ip4 << std::endl;

    int i = 42, *ip5, *&r5 = ip5, **ip6;

    // Again, the following line fails because a null pointer
    // does not point to any valid memory location
    // std::cout << *ip5 << std::endl;

    r5 = &i;
    *r5 = 0;

    // Same problem in the following line as **ip6 is a null pointer
    // std::cout << **ip6 << std::endl;

    ip6 = &ip5;

    std::cout << i << " " << ip5 << " " << *ip5 << " " << r5 << " " << *r5
              << " " << ip6 << " " << *ip6 << " " << **ip6 << std::endl;

    **ip6 = 42;

    std::cout << i << " " << ip5 << " " << *ip5 << " " << r5 << " " << *r5
              << " " << ip6 << " " << *ip6 << " " << **ip6 << std::endl;

    return 0;
}
