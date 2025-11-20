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
                price = 60.00;
                break;
            case 'T':
                price = 120.00;
                break;
            case 'B':
                price = 80.00;
                break;
        }

        if (duration > 5) {
            return price * (1 - 0.05);
        }

        return price;
    }
}
