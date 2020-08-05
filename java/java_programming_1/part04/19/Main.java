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


import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        int duration;

        while (true)
        {
            System.out.print("Name: ");
            name = scanner.nextLine();

            if (name.isEmpty())
            {
                break;
            }

            System.out.print("Duration: ");
            duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(name, duration));
        }

        System.out.println();

        System.out.print("Program's maximum duration? ");
        int maximumDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram televisionProgram: programs)
        {
            if (televisionProgram.getDuration() <= maximumDuration)
            {
                System.out.println(televisionProgram);
            }
        }

        scanner.close();
    }
}
