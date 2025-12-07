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

public class TransportApp {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                Transport transport = new Transport();

                // Get registration number
                System.out.print("Please enter your registration number: ");
                transport.setRegistrationNumber(keyboard.nextLine());

                // Get brand
                System.out.print("Please enter your brand: ");
                transport.setBrand(keyboard.nextLine());

                // Get transport's price
                System.out.print("Please your transport's original price: ");
                transport.setPrice(keyboard.nextDouble());
                keyboard.nextLine();

                if (transport.transportSelangor())
                        transport.setDiscountRate(0.10);

                System.out.println(transport);
                keyboard.close();
        }
}
