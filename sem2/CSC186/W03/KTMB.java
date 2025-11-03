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

public class KTMB {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                boolean isRepeat;
                do {
                        String passengerID;
                        char packageCode;
                        int adultQuantity = 0;
                        int childQuantity = 0;

                        double ticketPrice;
                        final double ADULT_GOLD_PRICE = 59.00;
                        final double CHILD_GOLD_PRICE = 34.00;
                        final double ADULT_PLATINUM_PRICE = 79.00;
                        final double CHILD_PLATINUM_PRICE = 44.00;
                        double total;

                        boolean addOn;
                        final double MEAL_COMBO_PRICE = 7.00;
                        int mealComboQuantity = 0;
                        double mealComboCharge = 0.00;

                        // Get Pessenger ID
                        System.out.print("\nPlease enter Passenger ID: ");
                        passengerID = keyboard.nextLine();

                        // Table of Prices
                        System.out.println("\n| Type of Package  | Ticket Category | Ticket Price (RM) |");
                        System.out.println("| ---------------- | --------------- | ----------------- |");
                        System.out.printf("| ETS Gold (G)     | Adult           | %.2f             |\n",
                                        ADULT_GOLD_PRICE);
                        System.out.printf("| ETS Gold (G)     | Child           | %.2f             |\n",
                                        CHILD_GOLD_PRICE);
                        System.out.printf("| ETS Platinum (P) | Adult           | %.2f             |\n",
                                        ADULT_PLATINUM_PRICE);
                        System.out.printf("| ETS Platinum (P) | Child           | %.2f             |\n",
                                        CHILD_PLATINUM_PRICE);

                        // Get Package Code
                        System.out.print("Please enter package code (G/P): ");
                        packageCode = Character.toUpperCase(keyboard.next().charAt(0));

                        // For invalid Package Code
                        while (!(packageCode == 'G' || packageCode == 'P')) {
                                System.out.println("Invalid Package Code");
                                System.out.print("Please enter package code (G/P): ");
                                packageCode = Character.toUpperCase(keyboard.next().charAt(0));
                        }

                        System.out.print("\nPlease enter quantity of adults: ");
                        adultQuantity = keyboard.nextInt();

                        System.out.print("\nPlease enter quantity of children: ");
                        childQuantity = keyboard.nextInt();

                        // Calculation for ticket price
                        if (packageCode == 'G') {
                                ticketPrice = (adultQuantity * ADULT_GOLD_PRICE) + (childQuantity * CHILD_GOLD_PRICE);
                        } else {
                                ticketPrice = (adultQuantity * ADULT_PLATINUM_PRICE)
                                                + (childQuantity * CHILD_PLATINUM_PRICE);
                        }

                        // Confirmation for meal combo
                        System.out.print("\nDo you want add on meal combo? (y/n): ");
                        addOn = keyboard.next().equalsIgnoreCase("Y");

                        // Get quantity and calculate charge
                        if (addOn) {
                                System.out.print("\nEnter quantity of meal combo: ");
                                mealComboQuantity = keyboard.nextInt();

                                mealComboCharge = mealComboQuantity * MEAL_COMBO_PRICE;
                        }

                        // Calculate final @ total charge
                        total = ticketPrice + mealComboCharge;

                        // Order Summary
                        System.out.println("\nETS TICKET INFORMATION - Butterworth to Kuala Lumpur");
                        System.out.printf("PASSENGER ID:\t\t%s\n", passengerID);
                        System.out.printf("Number of Adults:\t%d\n", adultQuantity);
                        System.out.printf("Number of Childrens:\t%d\n", childQuantity);
                        System.out.printf("Ticket Price:\t\tRM%,.2f\n", ticketPrice);
                        System.out.printf("Meal Combo Price:\tRM%,.2f\n", mealComboCharge);
                        System.out.printf("Net Ticket Price:\tRM%,.2f\n", total);

                        System.out.print("\nRepeat for a different Customer? (y/n): ");
                        isRepeat = Character.toUpperCase(keyboard.next().charAt(0)) == 'Y';
                        keyboard.nextLine();
                } while (isRepeat);
                keyboard.close();
        }
}
