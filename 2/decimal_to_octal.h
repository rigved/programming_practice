/*
 * decimal_to_octal.h
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


#ifndef C___PRIMER_DECIMAL_TO_OCTAL_H
#define C___PRIMER_DECIMAL_TO_OCTAL_H

int decimal_to_octal(int decimal_number)
{
    int octal_number = 0, current_place = 1;

    while (decimal_number != 0)
    {
        octal_number += (decimal_number % 8) * current_place;
        decimal_number /= 8;
        current_place *= 10;
    }

    return octal_number;
}

#endif //C___PRIMER_DECIMAL_TO_OCTAL_H
