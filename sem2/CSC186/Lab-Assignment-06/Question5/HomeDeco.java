public class HomeDeco extends DecoService {
    private int homeArea;
    private int areaSize;

    public HomeDeco() {
        super();
        this.homeArea = 0;
        this.areaSize = 0;
    }

    public HomeDeco(String customerName, int contactNumber, boolean plan3D, int homeArea, int areaSize) {
        super(customerName, contactNumber, plan3D);
        this.homeArea = homeArea;
        this.areaSize = areaSize;
    }

    /* Setters */
    public void setHomeArea(int homeArea) {
        this.homeArea = homeArea;
    }

    public void setAreaSize(int areaSize) {
        this.areaSize = areaSize;
    }
    /* Setters */

    /* Getters */
    public int getHomeArea() {
        return homeArea;
    }

    public int getAreaSize() {
        return areaSize;
    }
    /* Getters */

    @Override
    public double calcDesignCost() {
        double designCost = 0.00;
        if (homeArea == 1) {
            if (areaSize <= 20) {
                designCost = 1000;
            } else {
                designCost = 1500;
            }
        } else {
            if (areaSize <= 20) {
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
               "\nHome Area: " + homeArea +
               "\nArea Size: " + areaSize + "m^2";
    }
}
