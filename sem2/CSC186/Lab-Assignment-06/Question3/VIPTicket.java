public class VIPTicket extends Ticket {
    private String packageType;

    public VIPTicket() {
        super();
        this.packageType = null;
    }

    public VIPTicket(String ticketID, String customerName, boolean earlyBird, String packageType) {
        super(ticketID, customerName, earlyBird);
        this.packageType = packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public String getPackageType() {
        return packageType;
    }

    public String toString() {
        return super.toString() +
               "\nPackage Type: " + packageType;
    }

    @Override
    public double calcTicketPrice() {
        double ticketPrice = 0.00;

        if (packageType.equalsIgnoreCase("Platinum")) {
            ticketPrice = 3200;
        } else {
            ticketPrice = 2500;
        }

        if (earlyBird) {
            ticketPrice *= 0.80;
        }

        return ticketPrice;
    }
}
