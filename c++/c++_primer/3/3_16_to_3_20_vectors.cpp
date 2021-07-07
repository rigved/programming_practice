/*
 * 3_16_to_3_20_vectors.cpp
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
#include <vector>
#include <string>

using std::cin;
using std::cout;
using std::endl;
using std::vector;
using std::string;

int main()
{
    vector<int> v1;
    vector<int> v2(10);
    vector<int> v3(10, 42);
    vector<int> v4{10};
    vector<int> v5{10, 42};
    vector<string> v6{10};
    vector<string> v7{10, "Hi"};

    if (!v1.empty())
    {
        cout << "v1 size: " << v1.size() << endl << "v1 elements:";

        for (auto item : v1)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v1 is empty" << endl;
    }

    if (!v2.empty())
    {
        cout << "v2 size: " << v2.size() << endl << "v2 elements:";

        for (auto item : v2)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v2 is empty" << endl;
    }

    if (!v3.empty())
    {
        cout << "v3 size: " << v3.size() << endl << "v3 elements:";

        for (auto item : v3)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v3 is empty" << endl;
    }

    if (!v4.empty())
    {
        cout << "v4 size: " << v4.size() << endl << "v4 elements:";

        for (auto item : v4)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v4 is empty" << endl;
    }

    if (!v5.empty())
    {
        cout << "v5 size: " << v5.size() << endl << "v5 elements:";

        for (auto item : v5)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v5 is empty" << endl;
    }

    if (!v6.empty())
    {
        cout << "v6 size: " << v6.size() << endl << "v6 elements:";

        for (auto item : v6)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v6 is empty" << endl;
    }

    if (!v7.empty())
    {
        cout << "v7 size: " << v7.size() << endl << "v7 elements:";

        for (auto item : v7)
        {
            cout << " " << item;
        }

        cout << endl;
    }
    else
    {
        cout << "v7 is empty" << endl;
    }

    string word;
    vector<string> text;

    cout << "Enter words. Enter the word \"quit\" to stop." << endl;

    while (cin >> word)
    {
        if (word != "quit")
        {
            text.push_back(word);
        }
        else
        {
            break;
        }
    }

    for (auto &item : text)
    {
        for (auto &c : item)
        {
            c = std::toupper(c);
        }
    }

    int i = 0;

    cout << "Entered text converted to uppercase:" << endl;

    for (const auto &item : text)
    {
        if (i < 8)
        {
            cout << item << " ";
            i++;
        }
        else
        {
            cout << endl << item << " ";
            i = 0;
        }
    }

    cout << endl;

    vector<int> ivec;

    cout << "Adding elements to a vector requires using the push_back method: ";

    ivec.push_back(42);

    cout << ivec[0] << endl;

    vector<int> integerVector1(10, 42);
    vector<int> integerVector2{42, 42, 42, 42, 42, 42, 42, 42, 42, 42};
    vector<int> integerVector3;

    for (decltype(integerVector3.size()) j = 0; j < 10; ++j)
    {
        integerVector3.push_back(42);
    }

    cout << "vector<int> integerVector1(10, 42):";

    for (auto item : integerVector1)
    {
        cout << " " << item;
    }

    cout << endl;

    cout << "vector<int> integerVector2{42, 42, 42, 42, 42, 42, 42, 42, 42, 42}:";

    for (auto item : integerVector2)
    {
        cout << " " << item;
    }

    cout << endl;

    cout << "vector<int> integerVector3.push_back:";

    for (auto item : integerVector3)
    {
        cout << " " << item;
    }

    cout << endl;

    int number;
    vector<int> numberVector;

    cout << "Enter numbers. Press Ctrl+D to exit." << endl;

    while (cin >> number)
    {
        numberVector.push_back(number);
    }

    cout << "Sum of adjacent numbers: ";

    for (decltype(numberVector.size()) j = 0; j < (numberVector.size() - 1); j++)
    {
        cout << (numberVector[j] + numberVector[(j + 1)]) << " ";
    }

    cout << endl;

    cout << "Sum of first and last number, second and second-to-last number, and so on: ";

    for (decltype(numberVector.size()) j = 0, k = (numberVector.size() - 1); j < numberVector.size(); j++, k--)
    {
        cout << (numberVector[j] + numberVector[k]) << " ";
    }

    cout << endl;
}
