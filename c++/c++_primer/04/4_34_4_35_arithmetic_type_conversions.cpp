/*
 * 4_34_4_35_arithmetic_type_conversions.cpp
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
#include "type_name.h"

using std::cout;
using std::endl;

int main()
{
    char cval = 'a';
    int ival = 3;
    unsigned int uival = 4;
    float fval = 7.0;
    double dval = 8.0;

    cout << "cval: (" << type_name<decltype(cval)>() << ") " << cval << endl;
    cout << "ival: (" << type_name<decltype(ival)>() << ") " << ival << endl;
    cout << "uival: (" << type_name<decltype(uival)>() << ") " << uival << endl;
    cout << "fval: (" << type_name<decltype(fval)>() << ") " << fval << endl;
    cout << "dval: (" << type_name<decltype(dval)>() << ") " << dval << endl;

    if (fval)
    {
        cout << "fval (7.0) is converted to a bool (1)" << endl;
    }

    dval = fval + ival;

    cout << "fval + ival: (" << type_name<decltype(fval + ival)>() << ") " << (fval + ival) << endl;
    cout << "dval = fval + ival: (" << type_name<decltype(dval)>() << ") " << dval << endl;

    cout << "ival * cval: (" << type_name<decltype(ival * cval)>() << ") " << (ival * cval) << endl;
    cout << "dval + ival * cval: (" << type_name<decltype(dval + ival * cval)>() << ") " << (dval + ival * cval) << endl;

    cval = 'a' + 3;

    cout << "'a' + 3: (" << type_name<decltype('a' + 3)>() << ") " << ('a' + 3) << endl;
    cout << "cval = 'a' + 3: (" << type_name<decltype(cval)>() << ") " << cval << endl;

    fval = uival - ival * 1.0;

    cout << "ival * 1.0: (" << type_name<decltype(ival * 1.0)>() << ") " << (ival * 1.0) << endl;
    cout << "uival - ival * 1.0: (" << type_name<decltype(uival)>() << ") " << (uival - ival * 1.0) << endl;
    cout << "fval = uival - ival * 1.0: (" << type_name<decltype(fval)>() << ") " << fval << endl;

    dval = uival * fval;

    cout << "uival * fval: (" << type_name<decltype(uival * fval)>() << ") " << (uival * fval) << endl;
    cout << "dval = uival * fval: (" << type_name<decltype(dval)>() << ") " << dval << endl;

    cval = ival + fval + dval;

    cout << "ival + fval: (" << type_name<decltype(ival + fval)>() << ") " << (ival + fval) << endl;
    cout << "ival + fval + dval: (" << type_name<decltype(ival + fval + dval)>() << ") " << (ival + fval + dval) << endl;
    cout << "cval = ival + fval + dval: (" << type_name<decltype(cval)>() << ") " << cval << endl;

    return 0;
}
