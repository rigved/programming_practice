/*
 * 5_23_5_25_exception_handling.cpp
 * Copyright (C) 2022  Rigved Rakshit
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
 *
 */

#include <iostream>
#include <stdexcept>

int main()
{
    int num1 = 0, num2 = 0;

    std::cout << "Enter two numbers ('quit' to exit): ";

    while (std::cin >> num1 >> num2)
    {
        try
        {
            if (num2 == 0)
            {
                throw std::domain_error("Dividing by zero is undefined!");
            }

            std::cout << num1 << " / " << num2 << " = " << (num1 / num2) << std::endl;
        }
        catch (std::domain_error &divide_by_zero_err)
        {
            std::cout << divide_by_zero_err.what() << std::endl;
        }

        std::cout << "Enter two numbers ('quit' to exit): ";
    }

    return 0;
}
