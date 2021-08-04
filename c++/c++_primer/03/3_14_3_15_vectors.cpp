/*
 * 3_14_3_15_vectors.cpp
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

using std::cin;
using std::cout;
using std::endl;
using std::string;
using std::vector;

int main()
{
    string word;
    vector<string> wordVector;

    cout << "Enter words. Enter \"quit\" to move on." << endl;

    while (cin >> word)
    {
        if (word != "quit")
        {
            wordVector.push_back(word);
        }
        else
        {
            break;
        }
    }

    cout << "You entered: ";

    for (string w : wordVector)
    {
        cout << w << " ";
    }

    cout << endl;

    cout << "Enter numbers. Enter Ctrl+D to exit." << endl;

    int number;
    vector<int> numberVector;

    while (cin >> number)
    {
        numberVector.push_back(number);
    }

    cout << "You entered: ";

    for (int n : numberVector)
    {
        cout << n << " ";
    }

    cout << endl;
}
