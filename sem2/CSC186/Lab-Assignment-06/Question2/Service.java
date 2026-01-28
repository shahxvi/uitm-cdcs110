public abstract class Service {
    protected String customerName;
    protected String customerLocation;
    protected String paymentType; // Cash or eWallet
    protected double totalAmount;
    protected String orderTime; // Breakfast, Lunch, Hi-Tea, or Dinner for Food Delivery
                                // Day or Night for Ride
    public Service() {
        customerName = null;
        customerLocation = null;
        paymentType = null;
        totalAmount = 0;
        orderTime = null;
    }

    public Service(String customerName, String customerLocation, String paymentType, int totalAmount, String orderTime) {
        this.customerName = customerName;
        this.customerLocation = customerLocation;
        this.paymentType = paymentType;
        this.totalAmount = totalAmount;
        this.orderTime = orderTime;
    }

    /* Setters */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setCustomerLocation(String customerLocation) {
        this.customerLocation = customerLocation;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime = orderTime;
    }
    /* Setters */

    /* Getters */
    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerLocation() {
        return customerLocation;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public String getOrderTime() {
        return orderTime;
    }
    /* Getters */

    public abstract double calculateProfit();

    public String toString() {
        return "Customer Name: " + customerName +
               "\nCustomer Location: " + customerLocation +
               "\nPayment Type: " + paymentType +
               "\nTotal Amount: RM" + totalAmount +
               "\nOrder Time: " + orderTime;
    }
}
