/*
 * 2_13_2_14_nested_scopes.cpp
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

int i = 42;
int k = 100, sum = 0;

int main()
{
    int i = 100;
    int j = i;

    std::cout << j << std::endl;

    for (int k = 0; k != 10; ++k)
    {
        sum += k;
    }

    std::cout << k << " " << sum << std::endl;

    return 0;
}
