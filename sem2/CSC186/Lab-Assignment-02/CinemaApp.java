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

public class CinemaApp {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                Cinema cinema = new Cinema();

                // Get cinema code
                System.out.print("Please enter cinema code: ");
                cinema.setCinemaCode(keyboard.nextLine());

                // Get movie title
                System.out.print("\nPlease enter movie title: ");
                cinema.setMovieTitle(keyboard.nextLine());

                // Get price
                System.out.print("\nPlease enter price: RM");
                cinema.setPrice(keyboard.nextDouble());
                keyboard.nextLine();

                // Get payment mode
                System.out.println("\nPayment Methods:");
                System.out.println("1 - Credit Card");
                System.out.println("2 - Cash");
                System.out.print("Please choose your payment method (1/2): ");
                String strInput = keyboard.nextLine();
                if (strInput.equalsIgnoreCase("1"))
                        cinema.setPayment("Credit Card");
                else if (strInput.equalsIgnoreCase("2"))
                        cinema.setPayment("Cash");

                // Get membership
                System.out.print("\nDo you have membership? (y/n): ");
                cinema.setMembership(Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');

                System.out.println(cinema);

                keyboard.close();
        }
}
