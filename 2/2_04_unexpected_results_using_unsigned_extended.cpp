/*
 * 2_04_unexpected_results_using_unsigned_extended.cpp
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
    unsigned int u1 = 10, u2 = 42;

    std::cout << u2 - u1 << std::endl;
    std::cout << u1 - u2 << std::endl;

    int i1 = 10, i2 = 42;

    std::cout << i2 - i1 << std::endl;
    std::cout << i1 - i2 << std::endl;
    std::cout << i1 - u1 << std::endl;
    std::cout << u1 - i1 << std::endl;

    return 0;
}
