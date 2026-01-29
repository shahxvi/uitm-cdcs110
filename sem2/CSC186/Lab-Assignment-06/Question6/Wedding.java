public class Wedding extends Event {
    private int numOfGuest;
    private char menuPackage;
    private boolean doorGift;

    public Wedding() {
        super();
        numOfGuest = 0;
        menuPackage = '\n';
        doorGift = false;
    }

    public Wedding(String eventName, String date, int numOfGuest, char menuPackage, boolean doorGift) {
        super(eventName, date);
        this.numOfGuest = numOfGuest;
        this.menuPackage = menuPackage;
        this.doorGift = doorGift;
    }

    // Setters
    public void setNumOfGuest(int numOfGuest) {
        this.numOfGuest = numOfGuest;
    }

    public void setMenuPackage(char menuPackage) {
        this.menuPackage = menuPackage;
    }

    public void setDoorGift(boolean doorGift) {
        this.doorGift = doorGift;
    }
    // Setters

    public int getNumOfGuest() {
        return numOfGuest;
    }

    public char getMenuPackage() {
        return menuPackage;
    }

    public boolean getDoorGift() {
        return doorGift;
    }

    public double calcPayment() {
        menuPackage = Character.toUpperCase(menuPackage);

        double cost = 0.00;

        switch (menuPackage) {
            case 'A':
               cost = 10000.00; break;
            case 'B':
                cost = 15000.00; break;
            case 'C':
                cost = 22000.00; break;
        }
        if (doorGift) {
            cost += (numOfGuest * 9.00);
        }
        return cost;
    }

    public String toString() {
        return super.toString() +
               "\nNumber of Guests: " + numOfGuest +
               "\nMenu Package: " + menuPackage;
    }
}
