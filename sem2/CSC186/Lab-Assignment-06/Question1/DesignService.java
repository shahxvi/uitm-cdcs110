public abstract class DesignService {
    protected String custName;
    protected double deposit;
    protected boolean urgentOrder;

    public DesignService(String custName, double deposit, boolean urgentOrder) {
        this.custName = custName;
        this.deposit = deposit;
        this.urgentOrder = urgentOrder;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public void setUrgentOrder(boolean urgentOrder) {
        this.urgentOrder = urgentOrder;
    }

    public String getCustName() {
        return custName;
    }

    public double getDeposit() {
        return deposit;
    }

    public boolean getUrgentOrder() {
        return urgentOrder;
    }

    public String toString() {
        return "Customer Name: " + custName +
               "\nDeposit: RM" + deposit +
               "\nUrgent Order: " + urgentOrder;
    }

    public abstract double calcPayment();
}
