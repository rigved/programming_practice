/*
 * 1_16_sum_unknown_number_of_numbers.cpp
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
    int sum = 0, value = 0;
    char keep_reading = 'y';

    std::cout << "Enter numbers for addition: " << std::endl;

    while (true)
    {
        std::cin >> value;

        sum += value;

        std::cout << "Would you like to enter another number? (y/n) ";

        std::cin >> keep_reading;

        if (keep_reading == 'n')
        {
            break;
        }
    }

    std::cout << std::endl << "The sum of the numbers is " << sum << std::endl;

    return 0;
}
