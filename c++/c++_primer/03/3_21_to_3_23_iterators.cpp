/*
 * 3_21_to_3_23_iterators.cpp
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
#include <string>
#include <vector>
#include <random>

using std::cin;
using std::cout;
using std::endl;
using std::string;
using std::vector;
using std::toupper;
using std::default_random_engine;
using std::uniform_int_distribution;

int main()
{
    vector<int> v1;
    vector<int> v2(10);
    vector<int> v3(10, 42);
    vector<int> v4{10};
    vector<int> v5{10, 42};
    vector<string> v6{10};
    vector<string> v7{10, "hi"};

    if (v1.empty())
    {
        cout << "v1 is empty" << endl;
    }
    else
    {
        cout << "v1 - " << v1.size() << " elements:" << endl;

        for (auto iterator = v1.cbegin(); iterator != v1.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    if (v2.empty())
    {
        cout << "v2 is empty" << endl;
    }
    else
    {
        cout << "v2 - " << v2.size() << " elements:" << endl;

        for (auto iterator = v2.cbegin(); iterator != v2.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    if (v3.empty())
    {
        cout << "v3 is empty" << endl;
    }
    else
    {
        cout << "v3 - " << v3.size() << " elements:" << endl;

        for (auto iterator = v3.cbegin(); iterator != v3.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    if (v4.empty())
    {
        cout << "v4 is empty" << endl;
    }
    else
    {
        cout << "v4 - " << v4.size() << " elements:" << endl;

        for (auto iterator = v4.cbegin(); iterator != v4.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    if (v5.empty())
    {
        cout << "v5 is empty" << endl;
    }
    else
    {
        cout << "v5 - " << v5.size() << " elements:" << endl;

        for (auto iterator = v5.cbegin(); iterator != v5.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    if (v6.empty())
    {
        cout << "v6 is empty" << endl;
    }
    else
    {
        cout << "v6 - " << v6.size() << " elements:" << endl;

        for (auto iterator = v6.cbegin(); iterator != v6.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    if (v7.empty())
    {
        cout << "v7 is empty" << endl;
    }
    else
    {
        cout << "v7 - " << v7.size() << " elements:" << endl;

        for (auto iterator = v7.cbegin(); iterator != v7.cend(); iterator++)
        {
            cout << *iterator << endl;
        }
    }

    vector<string> text = {"Hello,", " ", "World!", " ", "How", " ", "are", " ", "you", " ", "doing?", "", "I'm", " ",
                           "doing", " ", "well.", " ", "Thank", " ", "you", " ", "for", " ", "asking!", ""};

    cout << "Original string:" << endl;

    for (auto iterator = text.cbegin(); iterator != text.cend(); ++iterator)
    {
        if (!iterator->empty())
        {
            cout << *iterator;
        }
        else
        {
            cout << endl;
        }
    }

    for (auto iterator1 = text.begin(); ((iterator1 != text.end()) && !iterator1->empty()); ++iterator1)
    {
        for (auto iterator2 = iterator1->begin(); iterator2 != iterator1->end(); iterator2++)
        {
            *iterator2 = toupper(*iterator2);
        }
    }

    cout << "Modified string:" << endl;

    for (auto iterator = text.cbegin(); iterator != text.cend(); ++iterator)
    {
        if (!iterator->empty())
        {
            cout << *iterator;
        }
        else
        {
            cout << endl;
        }
    }

    int seed;

    cout << "Enter a seed for the pseudo-random number generator: ";
    cin >> seed;

    default_random_engine generator(seed);
    uniform_int_distribution<int> distribution(1, 100);
    vector<int> integerVector(10);

    for (auto iterator = integerVector.begin(); iterator != integerVector.end(); ++iterator)
    {
        *iterator = distribution(generator);
    }

    cout << "Original sequence:" << endl;

    for (auto iterator = integerVector.cbegin(); iterator != integerVector.cend(); ++iterator)
    {
        cout << *iterator << " ";
    }

    cout << endl;

    for (auto iterator = integerVector.begin(); iterator != integerVector.end(); ++iterator)
    {
        *iterator *= 2;
    }

    cout << "Modified sequence:" << endl;

    for (auto iterator = integerVector.cbegin(); iterator != integerVector.cend(); ++iterator)
    {
        cout << *iterator << " ";
    }

    cout << endl;

    return 0;
}
