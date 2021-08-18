/*
 * 5_09_to_5_13_switch_statement.cpp
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

char next_text()
{
    return 'a';
}

unsigned some_value()
{
    return 42;
}

int get_value()
{
    return 0;
}

int get_num()
{
    return 48;
}

unsigned get_bufCnt()
{
    return 1024;
}

int main()
{
    unsigned counts[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; // {'a', 'e', 'i', 'o', 'u', 'total vowels',
                                                                // 'total consonants', ' ', '\t', '\n', 'ff', 'fl', 'fi'}
    char character;
    bool found_f = false;

    std::cout << "Enter a string of characters. Type Ctrl+D to stop:" << std::endl;

    while (std::cin.get(character))
    {
        character = tolower(character);

        if (character == 'a')
        {
            ++counts[0];
            ++counts[5];
        }
        else if (character == 'e')
        {
            ++counts[1];
            ++counts[5];
        }
        else if (character == 'i')
        {
            ++counts[2];
            ++counts[5];

            if (found_f)
            {
                ++counts[12];

                found_f = false;
            }
        }
        else if (character == 'o')
        {
            ++counts[3];
            ++counts[5];
        }
        else if (character == 'u')
        {
            ++counts[4];
            ++counts[5];
        }
        else if (character == ' ')
        {
            ++counts[7];
        }
        else if (character == '\t')
        {
            ++counts[8];
        }
        else if (character == '\n')
        {
            ++counts[9];
        }
        else
        {
            ++counts[6];

            if (character == 'f')
            {
                if (!found_f)
                {
                    found_f = true;
                }
                else
                {
                    ++counts[10];

                    found_f = false;
                }
            }
            else if (character == 'l')
            {
                if (found_f)
                {
                    ++counts[11];

                    found_f = false;
                }
            }
            else
            {
                found_f = false;
            }
        }
    }

    std::cout << "Number of vowel a: " << counts[0] << std::endl;
    std::cout << "Number of vowel e: " << counts[1] << std::endl;
    std::cout << "Number of vowel i: " << counts[2] << std::endl;
    std::cout << "Number of vowel o: " << counts[3] << std::endl;
    std::cout << "Number of vowel u: " << counts[4] << std::endl;

    std::cout << "Total number of vowels: " << counts[5] << std::endl;
    std::cout << "Total number of consonants: " << counts[6] << std::endl;

    std::cout << "Total number of blank spaces: " << counts[7] << std::endl;
    std::cout << "Total number of tabs: " << counts[8] << std::endl;
    std::cout << "Total number of newlines: " << counts[9] << std::endl;

    std::cout << "Total number of character sequence \"ff\": " << counts[10] << std::endl;
    std::cout << "Total number of character sequence \"fl\": " << counts[11] << std::endl;
    std::cout << "Total number of character sequence \"fi\": " << counts[12] << std::endl;

    unsigned aCnt = 0, eCnt = 0, iouCnt = 0;

    char ch = next_text();

    switch (ch)
    {
        case 'a':
            ++aCnt;

            break;
        case 'e':
            ++eCnt;

            break;
        default:
            ++iouCnt;
    }

    std::cout << "aCnt: " << aCnt << std::endl;
    std::cout << "eCnt: " << eCnt << std::endl;
    std::cout << "iouCnt: " << iouCnt << std::endl;

    unsigned index = some_value();
    int ix;
    std::vector<int> ivec = {0};

    switch (index)
    {
        case 1:
            ix = get_value();
            ivec[ix] = index;
            break;
        default:
            ix = ivec.size() - 1;
            ivec[ix] = index;
    }

    std::cout << "index: " << index << std::endl;
    std::cout << "ix: " << ix << std::endl;
    std::cout << "ivec[ix]: " << ivec[ix] << std::endl;

    unsigned evenCnt = 0, oddCnt = 0;
    int digit = get_num() % 10;

    switch (digit)
    {
        case 1:
        case 3:
        case 5:
        case 7:
        case 9:
            ++oddCnt;

            break;
        case 0:
        case 2:
        case 4:
        case 6:
        case 8:
            ++evenCnt;

            break;
    }

    std::cout << "evenCnt: " << evenCnt << std::endl;
    std::cout << "oddCnt: " << oddCnt << std::endl;

    constexpr unsigned ival = 512, jval = 1024, kval = 4096;
    unsigned bufsize;
    unsigned swt = get_bufCnt();

    switch (swt)
    {
        case ival:
            bufsize = ival * sizeof(int);

            break;
        case jval:
            bufsize = jval * sizeof(int);

            break;
        case kval:
            bufsize = kval * sizeof(int);

            break;
    }

    std::cout << "ival: " << ival << std::endl;
    std::cout << "jval: " << jval << std::endl;
    std::cout << "kval: " << kval << std::endl;
    std::cout << "swt: " << swt << std::endl;
    std::cout << "bufsize: " << bufsize << std::endl;

    return 0;
}
