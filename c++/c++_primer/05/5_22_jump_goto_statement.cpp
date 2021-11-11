/*
 * 5_03_simple_statements.cpp
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
 *
 */

#include <iostream>
#include <random>

std::random_device random_device;

unsigned get_size()
{
    return random_device();
}

int main()
{
    std::cout << "Random device entropy: " << random_device.entropy() << std::endl;

    unsigned sz = get_size();

    while (sz <= 4000000000)
    {
        std::cout << "Random number generated: " << sz << std::endl;

        std::cout << "Random number generated is lesser than or equal to 4,000,000,000" << std::endl;

        sz = get_size();
    }

    std::cout << "Random number generated: " << sz << std::endl;

    std::cout << "Random number generated is greater than 4,000,000,000. Exiting..." << std::endl;

    return 0;
}
