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

public class Land {
        // Attributes
        private String id;
        private String ownerName;
        private char houseType;
        private double area;

        // Contructors
        public Land() {
                this.id = "";
                this.ownerName = "";
                this.houseType = '\0';
                this.area = 0.00;
        }

        public Land(String id, String ownerName, char houseType, double area) {
                this.id = id;
                this.ownerName = ownerName;
                this.houseType = Character.toUpperCase(houseType);
                this.area = area;
        }

        public Land(Land otherLand) {
                this.id = otherLand.id;
                this.ownerName = otherLand.ownerName;
                this.houseType = otherLand.houseType;
                this.area = otherLand.area;
        }

        // Setters
        public void setId(String id) {
                this.id = id;
        }

        public void setOwnerName(String ownerName) {
                this.ownerName = ownerName;
        }

        public void setHouseType(char houseType) {
                this.houseType = Character.toUpperCase(houseType);
        }

        public void setArea(double area) {
                this.area = area;
        }

        // Getters
        public String getId() {
                return id;
        }

        public String getOwnerName() {
                return ownerName;
        }

        public char getHousetype() {
                return houseType;
        }

        public double getArea() {
                return area;
        }

        // Processors
        public double calculateTaxRate() {
                switch (Character.toUpperCase(houseType)) {
                        case 'T':
                                return area * 10;
                        case 'S':
                                return area * 15;
                        case 'B':
                                return area * 20;
                        case 'C':
                                return area * 30;
                        default:
                                return 0;
                }
        }

        // Printer
        public String toString() {
                return "\nID\t\t:\t" + id +
                                "\nOwner Name\t:\t" + ownerName +
                                "\nHouse Type\t:\t" + houseType +
                                "\nArea\t\t:\t" + area + "m^3" +
                                "\nTax Price\t:\tRM" + calculateTaxRate();
        }
}
