/*
 * 4_28_to_4_30_sizeof_operator.cpp
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
#include "Sales_data.h"

using std::cout;
using std::endl;

int f()
{
    return 42;
}

int main()
{
    cout << "sizeof(bool): " << sizeof(bool) << endl;
    cout << "sizeof(char): " << sizeof(char) << endl;
    cout << "sizeof(wchar_t): " << sizeof(wchar_t ) << endl;
    cout << "sizeof(char16_t): " << sizeof(char16_t) << endl;
    cout << "sizeof(char32_t): " << sizeof(char32_t) << endl;
    cout << "sizeof(short): " << sizeof(short) << endl;
    cout << "sizeof(int): " << sizeof(int) << endl;
    cout << "sizeof(long): " << sizeof(long) << endl;
    cout << "sizeof(long long): " << sizeof(long long) << endl;
    cout << "sizeof(float): " << sizeof(float) << endl;
    cout << "sizeof(double): " << sizeof(double) << endl;
    cout << "sizeof(long double): " << sizeof(long double) << endl;

    int array[10];
    int *p_int = array;

    cout << "sizeof(array): " << sizeof(array) << endl;
    cout << "sizeof(*array): " << sizeof(*array) << endl;
    cout << "(sizeof(array) / sizeof(*array)): " << (sizeof(array) / sizeof(*array)) << endl;
    cout << "sizeof(p_int): " << sizeof(p_int) << endl;
    cout << "sizeof(*p_int): " << sizeof(*p_int) << endl;
    cout << "(sizeof(p_int) / sizeof(*p_int)): " << (sizeof(p_int) / sizeof(*p_int)) << endl;

    int x, y, i, a, b;
    x = a = 1;
    y = i = b = 2;

    Sales_data *p = new Sales_data();
    p->book_number = "0-441-56956-0";

    cout << "sizeof x + y: " << (sizeof x + y) << endl;
    cout << "(sizeof x) + y: " << ((sizeof x) + y) << endl;
    cout << "sizeof p->book_number[i]: " << (sizeof p->book_number[i]) << endl;
    cout << "sizeof ((p->book_number)[i]): " << (sizeof ((p->book_number)[i])) << endl;
    cout << "sizeof a < b: " << (sizeof a < b) << endl;
    cout << "(sizeof a) < b: " << ((sizeof a) < b) << endl;
    cout << "sizeof f(): " << (sizeof f()) << endl;
    cout << "sizeof (f()): " << (sizeof (f())) << endl;

    return 0;
}
