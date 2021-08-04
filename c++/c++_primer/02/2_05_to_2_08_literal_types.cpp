/*
 * 2_05_to_2_08_literal_types.cpp
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
#include "decimal_to_octal.h"

int main()
{
    std::cout << "'a': " << 'a' << std::endl;
    std::cout << "L'a': " << L'a' << std::endl;
    std::cout << "\"a\": " << "a" << std::endl;
    std::cout << "L\"a\": " << L"a" << std::endl;
    std::cout << "10: " << 10 << std::endl;
    std::cout << "10u: " << 10u << std::endl;
    std::cout << "10L: " << 10L << std::endl;
    std::cout << "10uL: " << 10uL << std::endl;
    std::cout << "-10: " << -10 << std::endl;
    std::cout << "-10u: " << -10u << std::endl;
    std::cout << "-10L: " << -10L << std::endl;
    std::cout << "-10uL: " << -10uL << std::endl;
    std::cout << "012: " << 012 << std::endl;
    std::cout << "0xC: " << 0xC << std::endl;
    std::cout << "3.14: " << 3.14 << std::endl;
    std::cout << "3.14f: " << 3.14f << std::endl;
    std::cout << "3.14L: " << 3.14L << std::endl;
    std::cout << "10.: " << 10. << std::endl;
    std::cout << "10e-2: " << 10e-2 << std::endl;
    // std::cout << "09: " << 09 << std::endl; <== This line gives an error as digits in octal numbers can only be from 0-7
    std::cout << "07: " << 07 << std::endl;
    std::cout << "\"Who goes with F\\145rgus?\\012: \"" << "Who goes with F\145rgus?\012" << std::endl;
    std::cout << "3.14e1L: " << 3.14e1L << std::endl;
    // std::cout << "1024f: " << 1024f << std::endl; <== This line gives an error as int cannot be implicitly converted to a float
    std::cout << "3.14L: " << 3.14L << std::endl;
    std::cout << "M: " << decimal_to_octal('M') << " \\n: " <<  decimal_to_octal('\n') << std::endl;
    std::cout << "2M\\n: " << "2\115\012" << std::endl;
}
