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

public class ClothApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfCustomers = 2;
        Cloth[] cloth = new Cloth[numberOfCustomers];

        double totalPayment = 0;
        int customersWithMoreThan10Meters = 0;

        for (int i = 0; i < cloth.length; i++) {
            cloth[i] = new Cloth();

            System.out.print("\nEnter your name: ");
            cloth[i].setName(keyboard.nextLine());

            System.out.print("Enter cloth price: ");
            cloth[i].setPrice(keyboard.nextDouble());
            keyboard.nextLine();

            System.out.print("Enter cloth length: ");
            cloth[i].setLength(keyboard.nextDouble());
            keyboard.nextLine();
        }

        System.out.println("\nList of Customers: ");
        for (Cloth c : cloth)
            System.out.println(c);

        keyboard.close();

        for (Cloth c : cloth) {
            totalPayment += c.calcPayment();
        }
        System.out.printf("\nTotal payment from all customers: RM%,.2f", totalPayment);

        for (Cloth c : cloth) {
            if (c.getLength() > 10.00) {
                customersWithMoreThan10Meters++;
            }
        }
        System.out.println("\nNumber of customers with more than 10 meters of cloth: " + customersWithMoreThan10Meters);

        double highestPayment = -9999999.99;
        int index = 0;
        for (Cloth c : cloth) {
            if (c.calcPayment() > highestPayment) {
                highestPayment = c.calcPayment();
            } else {
                index++;
            }
        }
        System.out.println("\nCustomer with the highest payment:" + cloth[index]);
    }
}
