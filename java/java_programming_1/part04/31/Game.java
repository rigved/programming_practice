/*
 * Game.java
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


public class Game
{
    private String homeTeam, visitingTeam;
    private int homeTeamPoints, visitingTeamPoints;

    public Game(String homeTeam, String visitingTeam, int homeTeamPoints, int visitingTeamPoints)
    {
        this.homeTeam = homeTeam;
        this.visitingTeam = visitingTeam;
        this.homeTeamPoints = homeTeamPoints;
        this.visitingTeamPoints = visitingTeamPoints;
    }

    public String getHomeTeam()
    {
        return this.homeTeam;
    }

    public String getVisitingTeam()
    {
        return this.visitingTeam;
    }

    public int getHomeTeamPoints()
    {
        return this.homeTeamPoints;
    }

    public int getVisitingTeamPoints()
    {
        return this.visitingTeamPoints;
    }

    @Override
    public String toString()
    {
        String message = "Home Team: " + this.homeTeam;
        message += ", Home Team Points: " + this.homeTeamPoints;
        message += ", Visiting Team: " + this.visitingTeam;
        message += ", Visiting Team Points: " + this.visitingTeamPoints;

        return (message);
    }

    public String getWinner()
    {
        if (this.homeTeamPoints > this.visitingTeamPoints)
        {
            return this.homeTeam;
        }
        else
        {
            return this.visitingTeam;
        }
    }
}
