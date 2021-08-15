/*
 * 5_05_to_5_07_conditional_statements.cpp
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
#include <vector>

int get_value()
{
    return 42;
}

int main()
{
    int grade;
    std::vector<std::string> letter_grades = {"F", "D", "C", "B", "A"};
    std::string letter_grade;

    std::cout << "Enter grade: ";
    std::cin >> grade;

    std::cout << "Algorithm using if-else statements..." << std::endl;

    if (grade < 60)
    {
        letter_grade = "F";
    }
    else
    {
        if (grade == 100)
        {
            letter_grade = "A++";
        }
        else
        {
            letter_grade = letter_grades[((grade - 50) / 10)];

            if ((grade % 10) < 3)
            {
                letter_grade += "-";
            }
            else if ((grade % 10) > 6)
            {
                letter_grade += "+";
            }
        }
    }

    std::cout << "Letter grade: " << letter_grade << std::endl;

    std::cout << "Algorithm using the conditional operator..." << std::endl;

    letter_grade = (grade < 60) ? "F" :
                        ((grade == 100) ? "A++" :
                            (((grade % 10) < 3) ? letter_grades[((grade - 50) / 10)] + "-" :
                                (((grade % 10) > 6) ? letter_grades[((grade - 50) / 10)] + "+" :
                                    letter_grades[((grade - 50) / 10)])));

    std::cout << "Letter grade: " << letter_grade << std::endl;

    int i_val1 = 1, i_val2 = 2;

    if (i_val1 != i_val2)
        i_val1 = i_val2;            // Missing semi-colon
    else i_val1 = i_val2 = 0;

    int min_val = 4, occurs = 0;

    if (i_val1 < min_val)
    {
        min_val = i_val1;
        occurs = 1;
    }                               // Missing braces for the if-block

    int i_val = 0;                  // Variable must be declared outside the if-block's scope in order to access it later.

    if (i_val == get_value())
        std::cout << "i_val = " << i_val << std::endl;

    if (!i_val)
        std::cout << "i_val = 0\n";

    if (i_val == 0)                 // "==" must be used to test equality instead of "=" which is used for assignment
        i_val = get_value();

    std::cout << "i_val = " << i_val << std::endl;

    return 0;
}
