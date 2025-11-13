public class Cloth {
    private String name;
    private double price;
    private double length;

    /* Constructors */
    public Cloth() {
        name = "";
        price = 0.00;
        length = 0.00;
    }

    public Cloth(String name, double price, double length) {
        this.name = name;
        this.price = price;
        this.length = length;
    }

    public Cloth(Cloth otherCloth) {
        otherCloth.name = name;
        otherCloth.price = price;
        otherCloth.length = length;
    }
    /* Constructors */

    /* Setters */
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setLength(double length) {
        this.length = length;
    }
    /* Setters */

    /* Getters */
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }
    /* Getters */

    /* Printer */
    public String toString() {
        return String.format("\nName: %s\nCloth Price: RM%,.2f\nLength: %,.2f\nPayment: RM%,.2f\n", name, price, length,
                calcPayment());
    }

    /* Processor */
    public double calcPayment() {
        double tax = 0.06;
        return (price * length) * (1 - tax);
    }
}
