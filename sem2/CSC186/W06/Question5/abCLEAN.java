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
        Worker[] worker = new Worker[2]; // TODO: Change array size from 2 to 50
        CustomerServices[] customerServices = new CustomerServices[2]; // TODO: Change array size from 2 to 50
        double serviceCharge;

        for (int i = 0; i < customerServices.length; i++) {
            System.out.print("\nPlease enter assigned Worker Name: ");
            String wkrName = keyboard.nextLine();

            System.out.print("Please enter " + wkrName + "'s ID: ");
            String wkrId = keyboard.nextLine();

            System.out.print("Please enter " + wkrName + "'s ID: ");
            String wkrContact = keyboard.nextLine();
            worker[i] = new Worker(wkrName, wkrId, wkrContact);

            customerServices[i] = new CustomerServices();
            System.out.print("Please enter customer's name: ");
            String custName = keyboard.nextLine();

            System.out.print("Please enter " + custName + "'s phone number: ");
            String phoneNo = keyboard.nextLine();

            System.out.print("Please enter " + custName + "'s address: ");
            String address = keyboard.nextLine();

            System.out.println("| Service Type | Price per feet^2 (RM) |");
            System.out.println("| ------------ | --------------------- |");
            System.out.println("| Grass        | 0.85                  |");
            System.out.println("| Rooom        | 2.00                  |");
            System.out.println("| Toilet       | 5.00                  |");

            String serviceType;
            do {
                System.out.print("Please enter service type: ");
                serviceType = keyboard.nextLine();

                serviceCharge = customerServices[i].clacServiceCharge();

            } while (serviceType.equalsIgnoreCase("Grass"));

            while (true) {
                System.out.print("Enter addition service type (enter q to quit): ");
                String str = keyboard.next().toUpperCase();

                if (str.equalsIgnoreCase("Q"))
                    continue;
                else
                    serviceType = str;

                System.out.println("| Service Type | Price per feet^2 (RM) |");
                System.out.println("| ------------ | --------------------- |");
                System.out.println("| Grass        | 0.85                  |");
                System.out.println("| Rooom        | 2.00                  |");
                System.out.println("| Toilet       | 5.00                  |");
                System.out.print("Enter addition service type (enter q to quit): ");
                serviceType = keyboard.nextLine();

                serviceCharge = customerServices[i].clacServiceCharge();

            }

            customerServices[i].setCustomerServices(custName, phoneNo, address, serviceType, serviceArea, toiletArea,
                    worker);
        }
    }
}
