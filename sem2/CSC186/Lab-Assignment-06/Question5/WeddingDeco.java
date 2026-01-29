public class WeddingDeco extends DecoService {
    private String weddingTheme; // Floral or Beach
    private char weddingPackage; // A or B

    public WeddingDeco() {
        super();
        this.weddingTheme = null;
        this.weddingPackage = '\0';
    }

    public WeddingDeco(String customerName, int contactNumber, boolean plan3D, String weddingTheme, char weddingPackage) {
        super(customerName, contactNumber, plan3D);
        this.weddingTheme = weddingTheme;
        this.weddingPackage = weddingPackage;
    }

    /* Setters */
    public void setWeddingTheme(String weddingTheme) {
        this.weddingTheme = weddingTheme;
    }

    public void setWeddingPackage(char weddingPackage) {
        this.weddingPackage = weddingPackage;
    }
    /* Setters */

    /* Getters */
    public String getWeddingTheme() {
        return weddingTheme;
    }

    public char getWeddingPackage() {
        return weddingPackage;
    }
    /* Getters */

    public double calcDesignCost() {
        double designCost = 0.00;

        if (weddingTheme.equalsIgnoreCase("Floral")) {
            if (weddingPackage == 'A') {
                designCost = 1000;
            } else {
                designCost = 1500;
            }
        } else {
            if (weddingPackage == 'A') {
                designCost = 800;
            } else {
                designCost = 1300;
            }
        }

        if (plan3D) {
            designCost *= 1.10;
        }

        return designCost;
    }
    
    public String toString() {
        return super.toString() +
               "\nWedding Theme: " + weddingTheme +
               "\nWedding Package: " + weddingPackage;
    }
}
