/*
 * 3_02_to_3_05_string_operations.cpp
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

using std::cin;
using std::cout;
using std::endl;
using std::string;

int main()
{
    string line1, line2;

    cout << "Enter two lines (type \"quit\" to move on to the next part):" << endl;

    // Read a line at a time. Type "quit" to exit this loop.
    // Compare the two lines lexicographically and length-wise.
    while (getline(cin, line1))
    {
        if (line1.empty())
        {
            cout << "Enter two lines (type \"quit\" to move on to the next part):" << endl;

            continue;
        }
        else if (line1 == "quit")
        {
            break;
        }
        else
        {
            getline(cin, line2);

            if (line2.empty())
            {
                cout << "Enter two lines (type \"quit\" to move on to the next part):" << endl;

                continue;
            }
            else if (line2 == "quit")
            {
                break;
            }
            else
            {
                if (line1 == line2)
                {
                    cout << "The two lines are equal." << endl;
                }
                else if (line1 < line2)
                {
                    cout << "The first line is lexicographically smaller than the second line." << endl;
                }
                else
                {
                    cout << "The first line is lexicographically larger than the second line." << endl;
                }

                if (line1.size() == line2.size())
                {
                    cout << "The two lines are of equal length." << endl;
                }
                else if (line1.size() < line2.size())
                {
                    cout << "The first line is shorter than the second line." << endl;
                }
                else
                {
                    cout << "The first line is longer than the second line." << endl;
                }

                cout << "Enter two lines (type \"quit\" to move on to the next part):" << endl;
            }
        }
    }

    string word1, word2;

    cout << "Enter two words (type \"quit\" to exit):" << endl;

    // Read a word at a time. Type "quit" to exit this loop.
    // Concatenate the two words.
    while (cin >> word1)
    {
        if (word1.empty())
        {
            cout << "Enter two words (type \"quit\" to exit):" << endl;

            continue;
        }
        else if (word1 == "quit")
        {
            break;
        }
        else
        {
            cin >> word2;

            if (word2.empty())
            {
                cout << "Enter two words (type \"quit\" to exit):" << endl;

                continue;
            }
            else if (word2 == "quit")
            {
                break;
            }
            else
            {
                cout << (word1 + word2) << endl;
                cout << (word1 + " " + word2) << endl;

                cout << "Enter two words (type \"quit\" to exit):" << endl;
            }
        }
    }
}
