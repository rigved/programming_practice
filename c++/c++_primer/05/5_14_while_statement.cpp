/*
 * 5_14_while_statement.cpp
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
#include <string>

int main()
{
    std::string input_string, duplicated_word, max_duplicated_word;
    size_t duplicate_word_count = 0, max_duplicate_word_count = 0;

    std::cout << "Enter a string of words. Type Ctrl+D to stop." << std::endl;

    while (std::cin >> input_string)
    {
        if (duplicate_word_count == 0)
        {
            duplicated_word = input_string;
            max_duplicated_word = input_string;

            ++duplicate_word_count;
            ++max_duplicate_word_count;
        }
        else if (input_string == duplicated_word)
        {
            ++duplicate_word_count;

            if (duplicate_word_count > max_duplicate_word_count)
            {
                max_duplicate_word_count = duplicate_word_count;

                max_duplicated_word = input_string;
            }
        }
        else
        {
            duplicate_word_count = 1;

            duplicated_word = input_string;
        }
    }

    if (max_duplicate_word_count > 1)
    {
        std::cout << "The word \"" << max_duplicated_word << "\" was repeated \"" << max_duplicate_word_count
                    << "\" times." << std::endl;
    }
    else
    {
        std::cout << "No word was repeated." << std::endl;
    }

    return 0;
}
