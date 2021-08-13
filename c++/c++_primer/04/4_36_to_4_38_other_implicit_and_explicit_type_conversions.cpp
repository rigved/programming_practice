/*
 * 4_36_to_4_38_other_implicit_and_explicit_type_conversions.cpp
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
#include "type_name.h"

using std::cout;
using std::endl;
using std::string;

int main()
{
    int integer1 = 100;
    double double_value = 5.5;

    cout << "integer1: " << integer1 << endl;
    cout << "double_value: " << double_value << endl;

    integer1 *= static_cast<int>(double_value);

    cout << "Modified integer1 (using static_cast): " << integer1 << endl;

    integer1 = 100;
    integer1 *= double_value;

    cout << "Modified integer1 (without using static_cast): " << integer1 << endl;

    string string1 = "Hello World!";
    const string *p_string1 = &string1;
    char character = 'r';
    char *p_character = &character;
    void *p_void;

    cout << "p_string1: " << type_name<decltype(p_string1)>() << " - " <<  *p_string1 << endl;
    cout << "p_character: " << type_name<decltype(p_character)>() << " - " <<  *p_character << endl;
    cout << "p_void: " << type_name<decltype(p_void)>() << endl;

    integer1 = static_cast<int>(*p_character);
    p_void = reinterpret_cast<void*>(&double_value);
    p_character = reinterpret_cast<char*>(p_void);

    cout << "p_void = (void*) p_string1: const_cast = " << type_name<decltype(const_cast<string*>(p_string1))>() << " -> reinterpret_cast = " << type_name<decltype(reinterpret_cast<void*>(const_cast<string*>(p_string1)))>() << endl;
    cout << "i = int (*p_character): static_cast = " << type_name<decltype(static_cast<int>(*p_character))>() << endl;
    cout << "p_void = &double_value: reinterpret_cast = " << type_name<decltype(reinterpret_cast<void*>(&double_value))>() << endl;
    cout << "p_character = (char*) p_void: reinterpret_cast = " << type_name<decltype(reinterpret_cast<char*>(p_void))>() << endl;

    integer1 = 3;
    int integer2 = 7;

    cout << "integer1: " << integer1 << endl;
    cout << "integer2: " << integer2 << endl;

    double slope = static_cast<double>(integer2 / integer1);

    cout << "double slope = static_cast<double>(integer2 / integer1): result of integer division -> double = [" << type_name<
            decltype(slope)>() << "] " << slope << endl;

    return 0;
}
