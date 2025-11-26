package W06.Question5;

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

    public double clacServiceCharge() {
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
