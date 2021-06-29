/*
 * 3_1_Sales_namespace.cpp
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
 * Sample input:
 *
 * 0-201-70352-X 3 20.00
 * 0-201-70353-X 3 20.00
 * 0-201-70353-X 5 15.00
 * 0-201-70353-X 1 50.00
 * 0-201-70353-X 6 21.00
 * 0-201-70355-X 8 18.00
 * 0-201-70355-X 2 23.00
 * 0-201-70354-X 9 16.00
 * 0-201-70354-X 4 18.00
 * 0-201-70354-X 7 17.00
*/

#include <iostream>
#include <string>

using std::string;
using std::cin;
using std::cout;
using std::cerr;
using std::endl;

struct Sales_data
{
    string bookNumber;
    unsigned unitsSold = 0;
    double revenue = 0.0;
};

int main()
{
    Sales_data data, total;
    double price;

    cout << "Enter book details as ISBN, number of copies sold, and sales price separated by space:\n";

    if (cin >> data.bookNumber >> data.unitsSold >> price)
    {
        data.revenue = (data.unitsSold * price);

        total = data;

        cout << "Enter book details as ISBN, number of copies sold, and sales price separated by space:\n";

        while (cin >> data.bookNumber >> data.unitsSold >> price)
        {
            if (data.bookNumber == total.bookNumber)
            {
                total.unitsSold += data.unitsSold;
                total.revenue += (data.unitsSold * price);
            }
            else
            {
                cout << "ISBN, total number of copies sold, total revenue, and average sales price of each copy: "
                          << total.bookNumber << " " << total.unitsSold << " " << total.revenue;

                if (total.unitsSold != 0)
                {
                    cout << " " << (total.revenue / total.unitsSold);
                }

                cout << endl;

                total = data;
                total.revenue = (data.unitsSold * price);
            }

            cout << "Enter book details as ISBN, number of copies sold, and sales price separated by space:\n";
        }

        cout << "ISBN, number of copies sold, total revenue, and average sales price of each copy: "
                  << total.bookNumber << " " << total.unitsSold << " " << total.revenue;

        if (total.unitsSold != 0)
        {
            cout << " " << (total.revenue / total.unitsSold) << endl;
        }

        return 0;
    }
    else
    {
        cerr << "No data!" << endl;

        return -1;
    }
}
