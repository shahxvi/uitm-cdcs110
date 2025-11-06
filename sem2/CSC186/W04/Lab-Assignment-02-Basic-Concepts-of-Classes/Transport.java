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

public class Transport {
        // Attributes
        private String registrationNumber;
        private String brand;
        private double price;
        private double discountRate;

        /* Constructors */
        public Transport() { // Default Constructor
                registrationNumber = "";
                brand = "";
                price = 0.00;
        }

        // Normal Constructor
        public Transport(String registrationNumber, String brand, double price) {
                this.registrationNumber = registrationNumber.toUpperCase();
                this.brand = brand;
                this.price = price;
        }

        // Copy Constructor
        public Transport(Transport otherTransport) {
                this.registrationNumber = otherTransport.registrationNumber;
                this.brand = otherTransport.brand;
                this.price = otherTransport.price;
        }
        /* Constructors */

        /* Setters */
        public void setRegistrationNumber(String registrationNumber) {
                this.registrationNumber = registrationNumber.toUpperCase();
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void setDiscountRate(double discountRate) {
                this.discountRate = discountRate;
        }
        /* Setters */

        /* Getters */
        public String getRegistrationNumber() {
                return registrationNumber;
        }

        public String getBrand() {
                return brand;
        }

        public double getPrice() {
                return price;
        }

        public double getDicountRate() {
                return discountRate;
        }
        /* Getters */

        /* Processors */
        public boolean transportSelangor() {
                if (registrationNumber.startsWith("B"))
                        return true;
                else
                        return false;
        }

        public double discountPrice(double discountRate) {
                this.discountRate = discountRate;
                return price * (1 - discountRate);
        }
        /* Processors */

        // Printer
        public String toString() {
                return "\nRegistration Number: " + registrationNumber +
                                "\nBrand: " + brand +
                                "\nOriginal Price: " + price +
                                "\nRegistered in Selangor: " + transportSelangor() +
                                "\nPrice After Disocunt: " + discountPrice(discountRate);
        }
}
