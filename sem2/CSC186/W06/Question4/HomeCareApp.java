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

public class HomeCareApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        HomeCare[] assist = new HomeCare[30];
        Staff[] stf = new Staff[30];
        double totalChargeForPhysiotherapy = 0;

        for (int i = 0; i < assist.length; i++) {
            // Get the info of the staff that's incharge
            System.out.println("\nPlease fill in your staff details:- ");
            System.out.print("Please enter your name: ");
            String staffName = keyboard.nextLine();

            System.out.print("Please enter your ID: ");
            String staffID = keyboard.nextLine();

            System.out.print("Please enter your contact number: ");
            String staffContact = keyboard.nextLine();

            stf[i] = new Staff(staffName, staffID, staffContact);

            // Get customer details
            System.out.print("\nPlease enter the customer's name: ");
            String custName = keyboard.nextLine();

            System.out.print("Please enter " + custName + "'s phone number: ");
            String phoneNo = keyboard.nextLine();

            System.out.print("Please " + custName + "'s location: ");
            String location = keyboard.nextLine();

            System.out.println("| Service Type | Service Type Description | Price/hour (RM) |");
            System.out.println("| ------------ | ------------------------ | --------------- |");
            System.out.println("| P            | Basic Personal Care      | 60.00           |");
            System.out.println("| T            | Physiotherapy            | 120.00          |");
            System.out.println("| B            | Baby Care                | 80.00           |");
            System.out.print("Please enter " + custName + "'s service type: ");
            char serviceType = Character.toUpperCase(keyboard.next().charAt(0));

            while (serviceType != 'P' && serviceType != 'T' && serviceType != 'B') {
                System.out.print("Please enter a valid service type (P/T/B): ");
                serviceType = Character.toUpperCase(keyboard.next().charAt(0));
            }

            System.out.print("Please enter the duration of service (in hours): ");
            int duration = keyboard.nextInt();
            keyboard.nextLine();

            assist[i] = new HomeCare(custName, phoneNo, location, serviceType, duration, stf[i]);
        }
        keyboard.close();

        // Output
        for (int i = 0; i < assist.length; i++) {
            // System.out.println(assist[i].getStf());
            System.out.println("\nStaff incharge: " + stf[i].getStaffName());
            System.out.println("ID: " + stf[i].getStaffID());
            System.out.println("Contact : " + stf[i].getStaffContact());
            System.out.println("Customer Name: " + assist[i].getCustName());
            System.out.println("Customer Phone Number: " + assist[i].getPhoneNo());
            System.out.println("Customer Location : " + assist[i].getPhoneNo());
            System.out.println("Customer Location : " + assist[i].getPhoneNo());
            System.out.println("Service Type: " + assist[i].getServiceType());
            System.out.println("Duration (hours): " + assist[i].getDuration());
            System.out.println("Total Charges: RM" + assist[i].calcServiceCharge());
        }

        // Total charge for physiotherapy
        for (HomeCare a : assist) {
            if (a.getServiceType() == 'T')
                totalChargeForPhysiotherapy += a.calcServiceCharge();
        }
        System.out.println("\nTotal Charges for Physiotherapy: RM" + totalChargeForPhysiotherapy);
    }
}
