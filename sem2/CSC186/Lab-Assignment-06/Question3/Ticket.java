public abstract class Ticket {
    protected String ticketID;
    protected String customerName;
    protected boolean earlyBird;

    public Ticket() {
        this.ticketID = null;
        this.customerName = null;
        this.earlyBird = false;
    }

    public Ticket(String ticketID, String customerName, boolean earlyBird) {
        this.ticketID = ticketID;
        this.customerName = customerName;
        this.earlyBird = earlyBird;
    }

    public void setTicketID(String ticketID) {
        this.ticketID = ticketID;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEarlyBird(boolean earlyBird) {
        this.earlyBird = earlyBird;
    }

    public String getTicketID() {
        return ticketID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public boolean getEarlyBird() {
        return earlyBird;
    }

    public String toString() {
        return "Ticket ID: " + ticketID + 
               "\nCustomer Name: " + customerName +
               "\nEarly Bird: " + earlyBird;
    }

    public abstract double calcTicketPrice();
}
