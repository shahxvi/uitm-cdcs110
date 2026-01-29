public class GeneralAdmissionTicket extends Ticket {
    private int seatingArea; // 1 = First Tier, 2 = Second Tier, 3 = Third Tier

    public GeneralAdmissionTicket() {
        super();
        seatingArea = 0;
    }

    public GeneralAdmissionTicket(String ticketID, String customerName, boolean earlyBird, int seatingArea) {
        super(ticketID, customerName, earlyBird);
        this.seatingArea = seatingArea;
    }

    public void setSeatingArea(int seatingArea) {
        this.seatingArea = seatingArea;
    }

    public int getSeatingArea() {
        return seatingArea;
    }

    public String toString() {
        return super.toString() +
               "\nSeating Area: Tier " + seatingArea;
    }

    @Override
    public double calcTicketPrice() {
        double ticketPrice = 0.00;

        switch (seatingArea) {
            case 1: ticketPrice = 450; break;
            case 2: ticketPrice = 250; break;
            case 3: ticketPrice = 100; break;
        }

        if (earlyBird) {
            ticketPrice *= 0.85;
        }

        return ticketPrice;
    }
}
