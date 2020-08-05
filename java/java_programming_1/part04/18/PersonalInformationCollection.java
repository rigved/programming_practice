/*
 * PersonalInformationCollection.java
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

public class PersonalInformationCollection
{
    public static void main(String[] args)
    {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String firstName, lastName, identificationNumber;

        while (true)
        {
            System.out.print("First name: ");
            firstName = scanner.nextLine();

            if (firstName.isEmpty())
            {
                break;
            }

            System.out.print("Last name: ");
            lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            identificationNumber = scanner.nextLine();

            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber));
        }

        System.out.println();

        for (PersonalInformation personalInformation: infoCollection)
        {
            System.out.println(personalInformation.getFirstName() + " " + personalInformation.getLastName());
        }

        scanner.close();
    }
}
