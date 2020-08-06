/*
 * SportStatistics.java
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


import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        ArrayList<Game> games = new ArrayList<>();

        System.out.println("File:");
        String fileName = scan.nextLine();

        try {
            Scanner fileScanner = new Scanner(Paths.get(fileName));
            String line;
            String[] lineArray;

            while (fileScanner.hasNextLine())
            {
                line = fileScanner.nextLine();

                if (line.isEmpty())
                {
                    continue;
                }

                lineArray = line.split(",");

                games.add(new Game(lineArray[0], lineArray[1], Integer.valueOf(lineArray[2]), Integer.valueOf(lineArray[3])));
            }

            fileScanner.close();
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Team:");
        String team = scan.nextLine();
        int gamesPlayedCount = 0, gamesWon = 0, gamesLost = 0;

        for (Game game: games)
        {
            if (game.getHomeTeam().equals(team) || game.getVisitingTeam().equals(team))
            {
                gamesPlayedCount++;

                if (game.getWinner().equals(team))
                {
                    gamesWon++;
                }
                else
                {
                    gamesLost++;
                }
            }
        }

        System.out.println("Games: " + gamesPlayedCount);
        System.out.println("Wins: " + gamesWon);
        System.out.println("Losses: " + gamesLost);

        scan.close();
    }
}
