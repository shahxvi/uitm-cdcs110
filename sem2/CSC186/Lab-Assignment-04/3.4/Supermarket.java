public class Supermarket {
    private String itemName;
    private int quantity;
    private double unitPrice;

    // Constructors
    Supermarket() {
        itemName = "";
        quantity = 0;
        unitPrice = 0.00;
    }

    Supermarket(String itemName, int quantity, double unitPrice) {
        itemName = "";
        quantity = 0;
        unitPrice = 0.00;
    }

    Supermarket(Supermarket other) {
        other.itemName = "";
        other.quantity = 0;
        other.unitPrice = 0.00;
    }

    // Setters
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Getters
    public String getItemName() {
        return itemName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }
}
