/*
 * 1_20_sales_items_reading_writing.cpp
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
#include "Sales_item.h"

int main()
{
    Sales_item book;

    std::cout << "Enter book details as ISBN, number of copies sold, and sales price separated by space: ";
    std::cin >> book;

    std::cout << "ISBN, number of copies sold, total revenue, and average price: " << book << std::endl;

    return 0;
}
