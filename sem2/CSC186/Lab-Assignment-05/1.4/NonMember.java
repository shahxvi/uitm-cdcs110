public class NonMember extends Customer {
    boolean spa; //either booking for spa treatment or not
    int noTreatment; //number of treatment for spa
    boolean breakfast; //either booking for breakfast or not

    public NonMember() {
        super();
        this.spa = false;
        this.noTreatment = 0;
        this.breakfast = false;
    }

    public NonMember(String custName, int icNo, String address, String roomType, int bookingNo, int day, boolean spa, int noTreatment, boolean breakfast) {
        super();
        this.spa = spa;
        this.noTreatment = noTreatment;
        this.breakfast = breakfast;
    }

    public NonMember(NonMember other) {
        super(other);
        this.spa = other.spa;
        this.noTreatment = other.noTreatment;
        this.breakfast = other.breakfast;
    }

    public void setSpa(boolean spa) {
        this.spa = spa;
    }

    public void setNoTreatment(int noTreatment) {
        this.noTreatment = noTreatment;
    }

    public void setBreakfast(boolean breakfast) {
        this.breakfast = breakfast;
    }

    public boolean getSpa() {
        return spa;
    }

    public int getNoTreatment() {
        return noTreatment;
    }

    public boolean getBreakfast() {
        return breakfast;
    }

    public double calculatePayment() {
        double payment = 0.00;
        if (roomType.equalsIgnoreCase("Standard")) {
            payment = 180;
        } else if (roomType.equalsIgnoreCase("Superior")) {
            payment = 220;
        } else if (roomType.equalsIgnoreCase("Deluxe")) {
            payment = 280;
        } else if (roomType.equalsIgnoreCase("Executive")) {
            payment = 400;
        }

        if (breakfast) {
            payment += (30 / day);
        }
        if (spa) {
            payment += (150 / noTreatment);
        }

        return payment;
    }

    public String toString() {
        return super.toString() +
               "\nSpa Treatment: " + spa +
               "\nNumber of Spa Treament: " + noTreatment +
               "\nBreakfast Booking: " + breakfast;
    }
}
