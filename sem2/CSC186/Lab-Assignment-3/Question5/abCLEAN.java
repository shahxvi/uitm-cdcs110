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

public class abCLEAN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CustomerServices[] customerServices = new CustomerServices[2];
        double serviceCharge = 0.00;
        boolean choseToilet = false;

        for (int i = 0; i < customerServices.length; i++) {
            customerServices[i] = new CustomerServices();

            System.out.print("\nPlease enter assigned Worker Name: ");
            String wkrName = keyboard.nextLine();
            System.out.print("Please enter " + wkrName + "'s ID: ");
            String wkrId = keyboard.nextLine();
            System.out.print("Please enter " + wkrName + "'s contact: ");
            String wkrContact = keyboard.nextLine();
            customerServices[i].getWorker().setWorker(wkrName, wkrId, wkrContact);

            System.out.print("\nPlease enter customer's name: ");
            String custName = keyboard.nextLine();
            System.out.print("Please enter " + custName + "'s phone number: ");
            String phoneNo = keyboard.nextLine();
            System.out.print("Please enter " + custName + "'s address: ");
            String address = keyboard.nextLine();

            System.out.println("\n| Service Type | Price per feet^2 (RM) |");
            System.out.println("| ------------ | --------------------- |");
            System.out.println("| Grass        | 0.85                  |");
            System.out.println("| Room         | 2.00                  |");
            System.out.println("| Toilet       | 5.00                  |");
            System.out.println("If you'd like Toilet Service you have to pick Room Service first");

            System.out.print("\nPlease enter service type (Grass / Room): ");
            String serviceType = keyboard.nextLine();

            while (!serviceType.equalsIgnoreCase("Grass") && !serviceType.equalsIgnoreCase("Room")) {
                System.out.println("Please input the correct service type (Grass / Room): ");
                serviceType = keyboard.nextLine();
            }

            double serviceArea = 0.00;
            double toiletArea = 0.00;
            if (serviceType.equalsIgnoreCase("Grass")) {
                System.out.print("Please enter your grass area (feet^2): ");
                serviceArea = keyboard.nextDouble();
                keyboard.nextLine();
            }
            if (serviceType.equalsIgnoreCase("Room")) {
                System.out.print("Please enter your room area (feet^2): ");
                serviceArea = keyboard.nextDouble();
                keyboard.nextLine();

                System.out.print("Would you the additional toilet service? (Y / N): ");
                char ch = Character.toUpperCase(keyboard.next().charAt(0));
                if (ch == 'Y') {
                    System.out.print("Please enter the tiolet area (feet^2): ");
                    toiletArea = keyboard.nextDouble();
                    keyboard.nextLine();
                }
            }
            customerServices[i].setCustomerServices(custName, phoneNo, address, serviceType, serviceArea, toiletArea,
                    new Worker(wkrName, wkrId, wkrContact));
        }
        keyboard.close();

        // Calculate and display the total service charge collected for each type of
        // service
        for (int i = 0; i < customerServices.length; i++) {
            System.out.println("\nCustomer Name: " + customerServices[i].getCustName());
            System.out.println("Customer Phone Number: " + customerServices[i].getPhoneNo());
            System.out.println("Customer Address: " + customerServices[i].getAddress());
            System.out.println("Customer Service Type: " + customerServices[i].getServiceType());
            if (customerServices[i].getToiletArea() != 0.00)
                System.out.println("Additional Service Type: Toilet");
            if (customerServices[i].getServiceType().equalsIgnoreCase("Grass"))
                System.out.println(
                        "The worker resposible for grass cutting: " + customerServices[i].getWorker().getWorkerId());
            System.out.printf("Total Service Charge: RM%,.2f\n", customerServices[i].clacServiceCharge());
        }

        double averageService = 0.00;
        for (CustomerServices c : customerServices)
            averageService += c.clacServiceCharge();
        averageService /= customerServices.length;
        System.out.printf("\nThe average service charge is: RM%,.2f", averageService);
    }
}
