/*
 * 5_20_jump_break_statement.cpp
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
    std::string previous_word, current_word;
    bool is_repeated = false;

    std::cout << "Enter a word (type Ctrl+D to exit): ";

    while ((std::cin >> current_word) && !current_word.empty())
    {
        if (current_word == previous_word)
        {
            is_repeated = true;
            break;
        }
        else
        {
            previous_word = current_word;

            std::cout << "Enter a word (type Ctrl+D to exit): ";
        }
    }

    if (is_repeated)
    {
        std::cout << "\nThe same word '" << current_word << "' was entered twice!" << std::endl;
    }
    else
    {
        std::cout << "\n\nNo word was repeated!" << std::endl;
    }

    return 0;
}
