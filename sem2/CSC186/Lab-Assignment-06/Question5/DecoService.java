public abstract class DecoService {
    protected String customerName;
    protected int contactNumber;
    protected boolean plan3D;

    public DecoService() {
        this.customerName = "";
        this.contactNumber = 0;
        this.plan3D = false;
    }

    public DecoService(String customerName, int contactNumber, boolean plan3D) {
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.plan3D = plan3D;
    }

    /* Setters */
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setContactNumber(int contactNumber) {
        this.contactNumber = contactNumber;
    }

    public void setPlan3D(boolean plan3D) {
        this.plan3D = plan3D;
    }
    /* Setters */

    /* Getters */
    public String getCustomerName() {
        return customerName;
    }

    public int getContactNumber() {
        return contactNumber;
    }

    public boolean getPlan3D() {
        return plan3D;
    }
    /* Getters */

    public abstract double calcDesignCost();

    public String toString() {
        return "Customer Name: " + customerName +
               "\nCustomer Contact Number: " + contactNumber +
               "\n3D Plan: " + plan3D;
    }
}
