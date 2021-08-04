/*
 * 2_11_variable_declaration_and_definition.cpp
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

extern int ix_global = 1024; // Initializing an extern declaration is a warning outside a function
int iy_global;
extern int iz_global;

int main()
{
    // extern int ix_local = 1024; // Initializing an extern declaration is an error inside a function
    int iy_local;
    extern int iz_local;

    // int iy_local; // Defining a variable twice is an error

    std::cout << ix_global << std::endl;
    // std::cout << ix_local << std::endl;
    std::cout << iy_global << std::endl;
    std::cout << iy_local << std::endl;
    // std::cout << iz_global << std::endl; // Using a variable that has not been defined is an error
    // std::cout << iz_local << std::endl; // Using a variable that has not been defined is an error

    return 0;
}
