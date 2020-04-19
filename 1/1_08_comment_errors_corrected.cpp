/*
 * 1_08_comment_errors_corrected.cpp
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

/*
 * Comment pairs / *  * / cannot nest.
 * "cannot nest" is considered source code,
 * as is the rest of the program
 */

int main()
{
    std::cout << "/*" << std::endl;
    std::cout << " *" << std::endl;
    std::cout << " */" << std::endl;
    std::cout << /* " */ " /* " /*" */ << std::endl;
    return 0;
}
