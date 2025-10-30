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
                Land land = new Land();

                // Get ID
                System.out.print("Please enter your ID: ");
                land.setId(keyboard.nextLine());

                // Get Owner Name
                System.out.print("\nPlease enter your name: ");
                land.setOwnerName(keyboard.nextLine());

                // Table & Get House Type
                System.out.println("\n| House Type | Description   | Tax Rate (RM/m^3) |");
                System.out.println("| ---------- | ------------- | ----------------- |");
                System.out.println("| T          | Terrace       | 10                |");
                System.out.println("| S          | Semi-Detached | 15                |");
                System.out.println("| B          | Bungalow      | 20                |");
                System.out.println("| C          | Condominium   | 30                |");
                System.out.print("\nPlease enter your house type: ");
                land.setHouseType(keyboard.next().charAt(0));

                while (land.getHousetype() != 'T' && land.getHousetype() != 'S' && land.getHousetype() != 'B'
                                && land.getHousetype() != 'C') {
                        System.out.println("Incorrect House Type");
                        System.out.print("\nPlease enter a valid house type: ");
                        land.setHouseType(keyboard.next().charAt(0));
                }

                System.out.print("\nPlease enter your house area (m^3): ");
                land.setArea(keyboard.nextDouble());
                keyboard.nextLine(); // consume leftover \n

                System.out.println(land);

                keyboard.close();
        }
}
