public class Terrace extends House {
    String type; // Single-storey or double-storey
    boolean lotStatus;

    public Terrace() {
        super();
        this.type = "";
        this.lotStatus = false;
    }

    public Terrace(String tenant, String ICNo, String address, String type, boolean lotStatus) {
        super(tenant, ICNo, address);
        this.type = type;
        this.lotStatus = lotStatus;
    }

    public Terrace(Terrace other) {
        super(other);
        this.type = other.type;
        this.lotStatus = other.lotStatus;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setLotStatus(boolean lotStatus) {
        this.lotStatus = lotStatus;
    }

    public String getType() {
        return type;
    }

    public boolean getLotStatus() {
        return lotStatus;
    }

    public double calculateRent() {
        if (type.equalsIgnoreCase("Single-storey")) {
            if (lotStatus)
                return 2000.00;
            else
                return 1500.00;
        } else if (type.equalsIgnoreCase("Double-storey")) {
            if (lotStatus)
                return 3000.00;
            else
                return 2500.00;
        } else
            return -1.00;
    }

    public String toString() {
        String str = "\nType: " + type +
                     "\nLot Status: " + lotStatus;
        return super.toString() + str;
    }
}
