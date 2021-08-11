/*
 * 4_31_to_4_33_comma_operator
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

using std::cout;
using std::endl;
using std::vector;

int main()
{
    vector<int> vector_int(10, 0);

    cout << "Initial vector_int:";

    for (auto item : vector_int)
    {
        cout << " " << item;
    }

    cout << endl;

    for (vector<int>::size_type index = 0, count = vector_int.size(); index != vector_int.size();)
    {
        vector_int[index++] = count--;
    }

    cout << "Updated vector_int:";

    for (auto item : vector_int)
    {
        cout << " " << item;
    }

    cout << endl;

    constexpr int size = 5;
    int array_int[size] = {1, 2, 3, 4, 5};

    cout << "size: " << size << endl;
    cout << "array_int[size]:" << endl;

    for (int *pointer_int = array_int, index = 0; ((index != size) &&
                                                   (pointer_int != (array_int + 5))); ++index, ++pointer_int)
    {
        cout << "Item at index " << index << ": " << *pointer_int << endl;
    }

    bool some_value = true;
    int x = 1, y = 2;

    cout << "some_value: " << some_value << endl << "x: " << x << endl << "y: " << y << endl;

    some_value ? ++x, ++y : --x, --y;

    cout << "After running \"some_value ? ++x, ++y : --x, --y\"" << endl;
    cout << "some_value: " << some_value << endl << "x: " << x << endl << "y: " << y << endl;

    some_value = false;

    some_value ? ++x, ++y : --x, --y;

    cout << "After setting some_value = \"false\" and running \"some_value ? ++x, ++y : --x, --y\"" << endl;
    cout << "some_value: " << some_value << endl << "x: " << x << endl << "y: " << y << endl;

    return 0;
}
