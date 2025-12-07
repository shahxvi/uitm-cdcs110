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

public class Cinema {
        // Attributes
        private String cinemaCode;
        private String movieTitle;
        private double price;
        private String payment;
        private boolean membership;

        // Constructors
        public Cinema() {
                cinemaCode = "";
                movieTitle = "";
                price = 0.00;
                payment = "";
                membership = false;
        }

        public Cinema(String cinemaCode, String movieTitle, double price, String payment, boolean membership) {
                this.cinemaCode = cinemaCode;
                this.movieTitle = movieTitle;
                this.price = price;
                this.payment = payment;
                this.membership = membership;
        }

        public Cinema(Cinema otherCinema) {
                this.cinemaCode = otherCinema.cinemaCode;
                this.movieTitle = otherCinema.movieTitle;
                this.price = otherCinema.price;
                this.payment = otherCinema.payment;
                this.membership = otherCinema.membership;
        }

        // Setter
        public void setCinemaCode(String cinemaCode) {
                this.cinemaCode = cinemaCode;
        }

        public void setMovieTitle(String movieTitle) {
                this.movieTitle = movieTitle;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public void setPayment(String payment) {
                this.payment = payment;
        }

        public void setMembership(boolean membership) {
                this.membership = membership;
        }

        // Getter
        public String getCinemaCode() {
                return cinemaCode;
        }

        public String getMovieTitle() {
                return movieTitle;
        }

        public double getPrice() {
                return price;
        }

        public String getPayment() {
                return payment;
        }

        public boolean getMembership() {
                return membership;
        }

        // Processor
        public double discount() {
                if (payment == "Credit Card" && membership)
                        return 0.05;
                else if (payment == "Credit Card") // Not a member
                        return 0.03;
                else if (payment == "Cash" && membership)
                        return 0.10;
                else // Cash payment and not a member
                        return 0.00;
        }

        public String toString() {
                return "\nCinema Code\t:\t" + cinemaCode +
                                "\nMovie Title\t:\t" + movieTitle +
                                "\nPrice\t\t:\tRM" + (price * (1 - discount())) +
                                "\nPayment Method\t:\t" + payment +
                                "\nMembership\t:\t" + membership;
        }
}
