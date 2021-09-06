/*
 * 5_15_to_5_17_for_statement.cpp
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
#include <vector>

int main()
{
    int array[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    int sz = (sizeof(array)) / (sizeof(int));

    std::cout << "array[]:";

    int ix = 0;

    for (; ix != sz; ++ix)
    {
        std::cout << " " << array[ix];
    }

    std::cout << std::endl;

    if (ix != sz)
    {
        std::cout << "Something went wrong..." << std::endl;
    }

    std::vector<int> vector_int;
    int input;

    std::cout << "Enter numbers: ";

    while (std::cin >> input)
    {
        vector_int.push_back(input);
    }

    std::cout << "vector_int:";

    for (size_t index = 0; index != vector_int.size(); ++index)
    {
        std::cout << " " << vector_int[index];
    }

    std::cout << std::endl;

    vector_int.clear();
    std::cin.clear();
    std::cin.ignore(10000, '\n');

    std::cout << "Enter numbers: ";

    for (int input2; std::cin >> input2;)
    {
        vector_int.push_back(input2);
    }

    size_t index2 = 0;

    std::cout << "New vector_int:";

    while (index2 != vector_int.size())
    {
        std::cout << " " << vector_int[index2];

        ++index2;
    }

    std::cout << std::endl;

    vector_int.clear();
    std::cin.clear();
    std::cin.ignore(10000, '\n');

    std::cout << "Enter numbers: ";

    while (std::cin >> input)
    {
        vector_int.push_back(input);
    }

    std::cout << "vector_int:";

    for (size_t index = 0; index != vector_int.size(); ++index)
    {
        std::cout << " " << vector_int[index];
    }

    std::cout << std::endl;

    std::vector<int> vector_int2;

    std::cin.clear();
    std::cin.ignore(10000, '\n');

    std::cout << "Enter numbers: ";

    while (std::cin >> input)
    {
        vector_int2.push_back(input);
    }

    std::cout << "vector_int2:";

    for (size_t index = 0; index != vector_int.size(); ++index)
    {
        std::cout << " " << vector_int2[index];
    }

    std::cout << std::endl;

    size_t smaller_size = (vector_int.size() <= vector_int2.size()) ? vector_int.size() : vector_int2.size();

    bool is_prefix = true;

    for (size_t index = 0; index < smaller_size; ++index)
    {
        if (vector_int[index] != vector_int2[index])
        {
            is_prefix = false;

            break;
        }
    }

    std::cout << "Is one of the entered vectors a prefix of the other? ";

    if (is_prefix)
    {
        std::cout << "true" << std::endl;
    }
    else
    {
        std::cout << "false" << std::endl;
    }

    return 0;
}
