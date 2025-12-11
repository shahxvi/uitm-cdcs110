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

public class CustomerServices {
    private String custName;
    private String phoneNo;
    private String address;
    private String serviceType;
    private double serviceArea;
    private double toiletArea;
    private Worker wrk;

    public CustomerServices() {
        custName = "";
        phoneNo = "";
        address = "";
        serviceType = "";
        serviceArea = 0.00;
        toiletArea = 0.00;
        wrk = null;
    }

    public void setCustomerServices(String custName, String phoneNo, String address, String serviceType,
            double serviceArea, double toiletArea, Worker wrk) {
        this.custName = custName;
        this.phoneNo = phoneNo;
        this.address = address;
        this.serviceType = serviceType;
        this.serviceArea = serviceArea;
        this.toiletArea = toiletArea;
        this.wrk = wrk;
    }

    public String getCustName() {
        return custName;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public String getServiceType() {
        return serviceType;
    }

    public double getServiceArea() {
        return serviceArea;
    }

    public double getToiletArea() {
        return toiletArea;
    }

    public Worker getWorker() {
        return wrk;
    }

    public double calcServiceCharge() {
        double price = 0;
        double discount = 0.03;

        if (serviceType.equalsIgnoreCase("Grass"))
            price = 0.85 * serviceArea;
        else if (serviceType.equalsIgnoreCase("Room"))
            price = 2.00 * serviceArea;
        else if (serviceType.equalsIgnoreCase("Toilet"))
            price = 5.00 * toiletArea;
        else
            price = 0;

        if (price > 150.00)
            return price * (1 - discount);
        return price;
    }
}
