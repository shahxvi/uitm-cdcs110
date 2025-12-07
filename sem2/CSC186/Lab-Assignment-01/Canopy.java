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

public class Canopy {
        public static final double STUDENT_CHARGE = 90.00;
        public static final double STAFF_CHARGE = 150.00;
        public static final double OUTSIDER_CHARGE = 200.00;

        public static void main(String[] args) {
                boolean isContinue = true;
                Scanner keyboard = new Scanner(System.in);
                do {
                        char participantCode = 'N';
                        int totalCanopies = 0;
                        int totalDays = 0;
                        boolean isSellingWetItem = false;
                        double totalCharge = 0;

                        // Table
                        System.out.printf("| Participant Type | Participant Code | Charges / Day |\n");
                        System.out.printf("| ---------------- | ---------------- | ------------- |\n");
                        System.out.printf("| Students         | T                | RM%.2f       |\n", STUDENT_CHARGE);
                        System.out.printf("| Staff            | S                | RM%.2f      |\n", STAFF_CHARGE);
                        System.out.printf("| Outsider         | O                | RM%.2f      |", OUTSIDER_CHARGE);

                        // Get Code
                        System.out.print("\nPlease enter your code: ");
                        participantCode = Character.toUpperCase(keyboard.next().charAt(0));

                        // Loop for invalid code
                        while (participantCode != 'T' && participantCode != 'S' && participantCode != 'O') {
                                System.out.println("Invalid Code");
                                System.out.print("\nPlease enter a valid code: ");
                                participantCode = Character.toUpperCase(keyboard.next().charAt(0));
                        }
                        keyboard.nextLine(); // Consume leftover \n

                        // Get number of canopies
                        System.out.print("\nPlease enter the number of canopies: ");
                        totalCanopies = keyboard.nextInt();
                        keyboard.nextLine(); // Consume leftover \n

                        while (totalCanopies <= 0) {
                                System.out.println("Invalid Number");
                                System.out.print("\nPlease enter a valid number of canopies: ");
                                totalCanopies = keyboard.nextInt();
                                keyboard.nextLine(); // Consume leftover \n
                        }

                        // Get day count
                        System.out.print("\nPlease enter the number of days to use: ");
                        totalDays = keyboard.nextInt();
                        keyboard.nextLine(); // Consume leftover \n
                        while (totalDays <= 0) {
                                System.out.println("Invalid Input");
                                System.out.print("\nPlease enter a valid number of days to use: ");
                                totalDays = keyboard.nextInt();
                                keyboard.nextLine(); // Consume leftover \n
                        }

                        // Get wet item
                        System.out.print("\nWill you be selling wet items? (y/n): ");
                        isSellingWetItem = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');

                        // Calculate total charge
                        totalCharge = canopyCharge(participantCode, totalCanopies, totalDays)
                                        + additionalCharge(isSellingWetItem);

                        // Summary
                        System.out.println("\nParticipant Code:\t" + participantCode);
                        System.out.println("Number of Canopies:\t" + totalCanopies);
                        System.out.println("Selling Wet Item:\t" + isSellingWetItem);
                        if (isSellingWetItem)
                                System.out.printf("Wet Item Charge:\tRM%,.2f\n", additionalCharge(isSellingWetItem));
                        System.out.printf("Total Charge:\t\tRM%,.2f", totalCharge);

                        // Continue?
                        System.out.print("\nDo you want to continue for another customer? (y/n): ");
                        isContinue = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');
                        System.out.println(); // separator
                } while (isContinue);
                keyboard.close();
        }

        public static double additionalCharge(boolean isSellingWetItem) {
                return (isSellingWetItem) ? 100 : 0;
        }

        public static double canopyCharge(char participantCode, int totalCanopies, int totalDays) {
                switch (participantCode) {
                        case 'T':
                                return (STUDENT_CHARGE * totalCanopies) * totalDays;
                        case 'S':
                                return (STAFF_CHARGE * totalCanopies) * totalDays;
                        default:
                                return (OUTSIDER_CHARGE * totalCanopies) * totalDays;
                }
        }
}
