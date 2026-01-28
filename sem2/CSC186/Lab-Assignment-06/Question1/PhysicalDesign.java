public class PhysicalDesign extends DesignService {
    private int physicalType; // 1 = Banner, 2 = Brochure, 3 = Poster, 4 = Business Card
    private boolean printing;
    private int numCopy;

    public PhysicalDesign(String custName, double deposit, boolean urgentOrder, int physicalType, boolean printing, int numCopy) {
        super(custName, deposit, urgentOrder);
        this.physicalType = physicalType;
        this.printing = printing;
        this.numCopy = numCopy;
    }

    public void setPhysicalType(int physicalType) {
        this.physicalType = physicalType;
    }

    public void setPrinting(boolean printing) {
        this.printing = printing;
    }

    public void setNumCopy(int numCopy) {
        this.numCopy = numCopy;
    }

    public int getPhysicalType() {
        return physicalType;
    }

    public boolean getPrinting() {
        return printing;
    }

    public int getNumCopy() {
        return numCopy;
    }

    public String toString() {
        String physicalTypeStr = null;

        switch (physicalType) {
            case 1:
                physicalTypeStr = "Banner"; break;
            case 2:
                physicalTypeStr = "Brochure"; break;
            case 3:
                physicalTypeStr = "Poster"; break;
            case 4:
                physicalTypeStr = "Business Card"; break;
        }

        return super.toString() +
               "\nPhysical Type: " + physicalTypeStr +
               "\nPrinting: " + printing +
               "\nNumber of Copy: " + numCopy;
    }

    public double calcPayment() {
        double payment = 0.00;

        switch (physicalType) {
            case 1:
            case 2:
                payment += 250.00; break;
            case 3:
                payment += 150.00; break;
            case 4:
                payment += 100.00; break;
        }

        if (printing) {
            switch (physicalType) {
                case 1:
                    payment += (40.00 * numCopy); break;
                case 2:
                    payment += (10.00 * numCopy); break;
                case 3:
                    payment += (35.00 * numCopy); break;
                case 4:
                    payment += (3.00 * numCopy); break;
            }
        }

        if (urgentOrder) {
            payment += 50;
        }

        payment -= deposit;

        return payment;
    }
}
