/* MIT License
 * Copyright (c) <2025> <Shah> <2025171523@student.uitm.edu.my>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in shall
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE. */

import java.util.Scanner;

public class LandApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int size = 2;
        Land[] land = new Land[size];

        // Get ID
        for (int i = 0; i < land.length; i++) {
            land[i] = new Land();

            System.out.print("\nPlease enter your ID: ");
            land[i].setId(keyboard.nextLine());

            // Get Owner Name
            System.out.print("Please enter your name: ");
            land[i].setOwnerName(keyboard.nextLine());

            // Table & Get House Type
            System.out.println("\n| House Type | Description   | Tax Rate (RM/m^3) |");
            System.out.println("| ---------- | ------------- | ----------------- |");
            System.out.println("| T          | Terrace       | 10                |");
            System.out.println("| S          | Semi-Detached | 15                |");
            System.out.println("| B          | Bungalow      | 20                |");
            System.out.println("| C          | Condominium   | 30                |");
            System.out.print("Please enter your house type: ");
            land[i].setHouseType(keyboard.next().charAt(0));

            while (land[i].getHousetype() != 'T' && land[i].getHousetype() != 'S' && land[i].getHousetype() != 'B'
                    && land[i].getHousetype() != 'C') {
                System.out.println("Incorrect House Type");
                System.out.print("\nPlease enter a valid house type: ");
                land[i].setHouseType(keyboard.next().charAt(0));
            }

            System.out.print("Please enter your house area (m³): ");
            land[i].setArea(keyboard.nextDouble());
            keyboard.nextLine(); // consume leftover \n
        }
        keyboard.close();

        // Display information for every house
        System.out.println("Houses:");
        for (Land l : land)
            System.out.println(l + "\n");

        // Display information for every condominium house
        System.out.println("\nDetails on every Condominium:");
        for (Land l : land) {
            if (l.getHousetype() == 'C') {
                System.out.println(l);
            }
        }

        // Calculate and display average tax rate for Semi-Detached houses
        double semiDetactedAverageTaxRate = 0;
        for (Land l : land) {
            if (l.getHousetype() == 'S')
                semiDetactedAverageTaxRate += l.calculateTaxRate();
        }
        System.out.printf("\nAverage Tax Rate for Semi-Detached House: RM%,.2f", semiDetactedAverageTaxRate);

        // Calculate and display highest tax rate for a bungalow house
        double bungalowHighestTaxRate = 0;
        for (Land l : land) {
            if (l.getHousetype() == 'B' && l.calculateTaxRate() > bungalowHighestTaxRate)
                bungalowHighestTaxRate = l.calculateTaxRate();
        }
        System.out.printf("\nHighest Tax Rate for Bungalow House: RM%,.2f\n", bungalowHighestTaxRate);
    }
}
