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

public class HomeCare {
    private String custName;
    private String phoneNo;
    private String location;
    private char serviceType;
    private int duration;
    private Staff stf;

    HomeCare(String custName, String phoneNo, String location, char serviceType, int duration, Staff stf) {
        this.custName = custName;
        this.phoneNo = phoneNo;
        this.location = location;
        this.serviceType = Character.toUpperCase(serviceType);
        this.duration = duration;
        this.stf = stf;
    }

    public void setHomeCare(String custName, String phoneNo, String location, char serviceType, int duration,
            Staff stf) {
        this.custName = custName;
        this.phoneNo = phoneNo;
        this.location = location;
        this.serviceType = Character.toUpperCase(serviceType);
        this.duration = duration;
        this.stf = stf;
    }

    public String getCustName() {
        return custName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getLocation() {
        return location;
    }

    public char getServiceType() {
        return serviceType;
    }

    public int getDuration() {
        return duration;
    }

    public Staff getStf() {
        return stf;
    }

    public double calcServiceCharge() {
        double price = 0.00;

        switch (serviceType) {
            case 'P':
                price = 60.00 * duration;
                break;
            case 'T':
                price = 120.00 * duration;
                break;
            case 'B':
                price = 80.00 * duration;
                break;
        }

        if (duration > 5) {
            return (price * duration) * (1 - 0.05);
        }

        return price;
    }
}
