/*
 * 2_26_const.cpp
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

extern const int buf = 512;

int main()
{
    // const int buf2; // Const variables cannot be assigned new values so they must be initialized
    int count = 0;
    const int size = count;

    ++count;
    // ++size; // Changing the value of a read-only variable is not allowed

    std::cout << buf << " " << count << " " << size << " " << std::endl;

    return 0;
}
