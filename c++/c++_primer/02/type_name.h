/*
 * type_name.h
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
 * Base code reference: https://stackoverflow.com/questions/81870/is-it-possible-to-print-a-variables-type-in-standard-c
 */


#ifndef C___PRIMER_TYPE_NAME_H
#define C___PRIMER_TYPE_NAME_H

#include <type_traits>
#include <typeinfo>
#ifndef _MSC_VER
#include <cxxabi.h>
#endif
#include <memory>
#include <string>
#include <cstdlib>

template <class T>
std::string
type_name()
{
    typedef typename std::remove_reference<T>::type TR;
    std::unique_ptr<char, void(*)(void*)> own
    (
#ifndef _MSC_VER
    abi::__cxa_demangle(typeid(TR).name(), nullptr, nullptr, nullptr),
#else
    nullptr,
#endif
    std::free
    );

    std::string r = own != nullptr ? own.get() : typeid(TR).name();

    if (std::is_const<TR>::value)
    {
        r = "const " + r;
    }
    if (std::is_volatile<TR>::value)
    {
        r = "volatile " + r;
    }
    if (std::is_lvalue_reference<T>::value)
    {
        r += "&";
    }
    else if (std::is_rvalue_reference<T>::value)
    {
        r += "&&";
    }

    return r;
}

#endif //C___PRIMER_TYPE_NAME_H
