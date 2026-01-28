public class DigitalDesign extends DesignService {
    private int digitalType; // 1 = Website, 2 = Advertisement

    public DigitalDesign(String custName, double deposit, boolean urgentOrder, int digitalType) {
        super(custName, deposit, urgentOrder);
        this.digitalType = digitalType;
    }

    public void setDigitalType(int digitalType) {
        this.digitalType = digitalType;
    }

    public int getDigitalType() {
        return digitalType;
    }

    public String toString() {
        String digitalTypeStr = null;

        switch (digitalType) {
            case 1:
                digitalTypeStr = "Website"; break;
            case 2:
                digitalTypeStr = "Advertisement"; break;
        }

        return super.toString() +
               "\nPhysical Type: " + digitalTypeStr;
    }

    public double calcPayment() {
        double payment = 0.00;

        switch (digitalType) {
            case 1:
                payment += 100.00; break;
            case 2:
                payment += 150.00; break;
        }

        if (urgentOrder) {
            payment += 50;
        }

        payment -= deposit;

        return payment;
    }
}
