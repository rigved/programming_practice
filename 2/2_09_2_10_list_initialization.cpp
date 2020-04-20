/*
 * 2_09_2_10_list_initialization.cpp
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

std::string global_str;
int global_int;

int main()
{
    long double ld = 3.1415926536;
    // int a{ld}, b = {ld}; <== This line gives an error as implicit narrowing conversion in list intialization is not allowed
    int c(ld), d = ld;

    std::cout << c << " " << d << std::endl;

    std::string local_str;
    int local_int;

    std::cout << global_str << " " << global_int << " " << local_str << local_int << std::endl;

    int input_value;

    std::cin >> input_value;

    int i(3.14);
    double j = 3.14;

    std::cout << i << " " << j << " " << std::endl;

    double salary = 9999.99, wage = salary;

    std::cout << salary << " " << wage << std::endl;
}
