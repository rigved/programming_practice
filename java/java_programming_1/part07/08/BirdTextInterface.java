/*
 * BirdTextInterface.java
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

public class BirdTextInterface
{
    private ArrayList<Bird> birdArrayList;
    private Scanner inputScanner;

    public BirdTextInterface()
    {
        this.birdArrayList = new ArrayList<>();
        this.inputScanner = new Scanner(System.in);
    }

    private void addNewBird(String birdName, String birdNameInLatin)
    {
        this.birdArrayList.add(new Bird(birdName, birdNameInLatin));
    }

    private boolean addBirdObservation(String birdName)
    {
        for (Bird bird : this.birdArrayList)
        {
            if (bird.getNameOfBird().equals(birdName))
            {
                bird.addObservation();

                return true;
            }
        }

        return false;
    }

    private void printAllBirds()
    {
        for (Bird bird : this.birdArrayList)
        {
            System.out.println(bird);
        }
    }

    private void printOneBird(int index)
    {
        if (index >= this.birdArrayList.size())
        {
            return;
        }

        System.out.println(this.birdArrayList.get(index));
    }

    public void start()
    {
        String command, birdName, birdNameInLatin;
        boolean continueStatus = true;
        int index = 0;

        while (continueStatus)
        {
            System.out.print("? ");
            command = this.inputScanner.nextLine();

            switch (command)
            {
                case "Add":
                    System.out.print("Name: ");
                    birdName = this.inputScanner.nextLine();

                    System.out.print("Name in Latin: ");
                    birdNameInLatin = this.inputScanner.nextLine();

                    this.addNewBird(birdName, birdNameInLatin);

                    break;
                case "Observation":
                    System.out.print("Bird? ");
                    birdName = this.inputScanner.nextLine();

                    if (!this.addBirdObservation(birdName))
                    {
                        System.out.println("Not a bird!");
                    }

                    break;
                case "All":
                    this.printAllBirds();

                    break;
                case "One":
                    this.printOneBird(index);

                    if (++index >= this.birdArrayList.size())
                    {
                        index = 0;
                    }

                    break;
                case "Quit":
                    continueStatus = false;
            }
        }
    }
}
