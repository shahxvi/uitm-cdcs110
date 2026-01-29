public class Conference extends Event {
    private char type;  // A for academic,
                        // S for seminar,
                        // W ofr workshop
    public Conference() {
        super();
        type = '\0';
    }

    public Conference(String eventName, String date, char type) {
        super(eventName, date);
        this.type = type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    public double calcPayment() {
        type = Character.toUpperCase(type);
        double fee = 0.00;
        switch (type) {
            case 'A':
                fee = 890.00; break;
            case 'S':
                fee = 450.00; break;
            case 'W':
                fee = 650.00; break;
        }

        return fee;
    }
    
    public String toString() {
        return super.toString() +
               "\nType: " + type;
    }
}
