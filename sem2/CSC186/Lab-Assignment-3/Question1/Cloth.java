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

public class Cloth {
    private String name;
    private double price;
    private double length;

    /* Constructors */
    public Cloth() {
        name = "";
        price = 0.00;
        length = 0.00;
    }

    public Cloth(String name, double price, double length) {
        this.name = name;
        this.price = price;
        this.length = length;
    }

    public Cloth(Cloth otherCloth) {
        otherCloth.name = name;
        otherCloth.price = price;
        otherCloth.length = length;
    }
    /* Constructors */

    /* Setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }
    /* Setters */

    /* Getters */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }
    /* Getters */

    /* Processor */
    public double calcPayment() {
        double tax = 0.06;
        return (price * length) * (1 - tax);
    }

    /* Printer */
    public String toString() {
        return String.format("\nName: %s\nCloth Price: RM%,.2f\nLength: %,.2f\nPayment: RM%,.2f\n", name, price, length,
                calcPayment());
    }
}
