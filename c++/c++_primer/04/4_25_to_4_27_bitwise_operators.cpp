/*
 * 4_25_to_4_27_bitwise_operators.cpp
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
#include <bitset>

int main()
{
    std::bitset<32> bitsetInt = (~'q' << 6);

    std::cout << "~'q' << 6: " << bitsetInt << std::endl;

    unsigned int quiz1 = 0;
    std::bitset<16> bitset_quiz1 = quiz1;

    std::cout << "quiz1: " << bitset_quiz1 << std::endl;

    quiz1 |= (1U << 27);
    bitset_quiz1 = quiz1;

    std::cout << "quiz1 (after student number 27 passes the test): " << bitset_quiz1 << std::endl;

    unsigned long ul1 = 3, ul2 = 7;

    std::cout << "(ul1 & ul2): " << (ul1 & ul2) << std::endl;
    std::cout << "(ul1 | ul2): " << (ul1 | ul2) << std::endl;
    std::cout << "(ul1 && ul2): " << (ul1 && ul2) << std::endl;
    std::cout << "(ul1 || ul2): " << (ul1 || ul2) << std::endl;

    return 0;
}
