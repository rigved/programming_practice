/*
 * Main.java
 * Copyright (C) 2020  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


public class Main
{
    public static void main(String[] args)
    {
        SimpleCollection xMenCharacters = new SimpleCollection("X-Men characters");

        System.out.println(xMenCharacters);

        System.out.println();

        xMenCharacters.add("magneto");
        System.out.println(xMenCharacters);

        System.out.println();

        xMenCharacters.add("mystique");
        System.out.println(xMenCharacters);

        System.out.println();

        xMenCharacters.add("phoenix");
        System.out.println(xMenCharacters);

        System.out.println();

        SimpleCollection alphabets = new SimpleCollection("alphabets");

        System.out.println(alphabets);

        System.out.println();

        alphabets.add("a");
        System.out.println(alphabets);

        System.out.println();

        alphabets.add("b");
        System.out.println(alphabets);

        System.out.println();

        alphabets.add("c");
        System.out.println(alphabets);

        System.out.println();

        SimpleCollection starTrekCharacters = new SimpleCollection("Star Trek characters");

        System.out.println(starTrekCharacters);

        System.out.println();

        starTrekCharacters.add("kirk");
        System.out.println(starTrekCharacters);

        System.out.println();

        starTrekCharacters.add("spock");
        System.out.println(starTrekCharacters);

        System.out.println();

        starTrekCharacters.add("picard");
        System.out.println(starTrekCharacters);

        System.out.println();

        starTrekCharacters.add("sisko");
        System.out.println(starTrekCharacters);

        System.out.println();

        starTrekCharacters.add("janeway");
        System.out.println(starTrekCharacters);

        System.out.println();

        starTrekCharacters.add("archer");
        System.out.println(starTrekCharacters);
    }
}
