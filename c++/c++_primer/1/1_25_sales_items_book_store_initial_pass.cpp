/*
 * 1_25_sales_items_book_store_initial_pass.cpp
 *
 * This file contains code from "C++ Primer, Fifth Edition", by Stanley B.
 * Lippman, Josee Lajoie, and Barbara E. Moo, and is covered under the
 * copyright and warranty notices given in that book:
 *
 * Copyright (c) 2013 by Objectwrite, Inc., Josee Lajoie, and Barbara E. Moo.
 *
 * Modifications Copyright (C) 2020  Rigved Rakshit
 */


#include <iostream>
#include "Sales_item.h"

int main()
{
    Sales_item total;

    std::cout << "Enter book details as ISBN, number of copies sold, and sales price separated by space in the following lines." << std::endl;

    if (std::cin >> total)
    {
        Sales_item transaction;

        while (std::cin >> transaction)
        {
            if (total.isbn() == transaction.isbn())
            {
                total += transaction;
            }
            else
            {
                std::cout << "ISBN, total number of copies sold, total revenue, and average price: " << total << std::endl;

                total = transaction;
            }
        }

        std::cout << "ISBN, total number of copies sold, total revenue, and average price: " << total << std::endl;
    }
    else
    {
        std::cerr << "No data?" << std::endl;
        return -1;
    }

    return 0;
}
