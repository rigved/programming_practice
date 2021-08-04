/*
 * 1_13_print_range_for.cpp
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


#include "iostream"

int main()
{
    int val1 = 0, val2 = 0;

    std::cout << "Enter two numbers for the range boundaries: ";
    std::cin >> val1 >> val2;

    for (; val1 <= val2; ++val1)
    {
        std::cout << val1 << " ";
    }

    std::cout << std::endl;

    return 0;
}
