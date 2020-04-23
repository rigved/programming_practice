/*
 * 2_18_to_2_24_pointers.cpp
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

int main()
{
    int i1 = 1, i2 = 2, i3 = 3, i4 = 4;
    int *pi1 = &i1, *pi2 = &i2;

    std::cout << *pi1 << " " << *pi2 << std::endl;

    pi1 = &i3;
    *pi2 = i4;

    std::cout << *pi1 << " " << *pi2 << std::endl;

    int i = 42, *p1 = &i;

    *p1 = *p1 * *p1;

    std::cout << *p1 << std::endl;

    i = 0;

    // double* dp = &i; // Cannot convert int* to double*
    // int *ip = i; // Invalid conversion of int* to int
    int *p = &i;

    std::cout << *p << std::endl;

    if (p)
    {
        std::cout << "p is valid pointer - p is not a null pointer." << std::endl;
    }
    else
    {
        std::cout << "p is most likely a null pointer." << std::endl;
    }

    if (*p)
    {
        std::cout << "p is pointing to a variable with a non-zero value." << std::endl;
    }
    else
    {
        std::cout << "p is pointing to a variable with a value of zero." << std::endl;
    }

    i = 42;
    void *vp = &i;

    // The following operation is invalid.
    // We cannot convert int* to long* because all the pointer operations are determined from the pointer type
    // and long* operations cannot be applied to int* pointers. For example, a long* pointer might consider
    // the size of the variable in memory as 64 bits whereas an int* pointer might consider the size of the
    // variable in memory as 32 bits.
    // long *lp = &i;

    return 0;
}
