public class Ride extends Service {
    private String driverName;
    private String licensePlate;
    private String vehicleType; // Motorcycle, Sedan Car, & MPV
    private String destination;

    public Ride() {
        super();
        this.driverName = null;
        this.licensePlate = null;
        this.vehicleType = null;
        this.destination = null;
    }

    public Ride(String customerName, String customerLocation, String paymentType, int totalAmount, String orderTime, String driverName, String licensePlate, String vehicleType, String destination) {
        super(customerName, customerLocation, paymentType, totalAmount, orderTime);
        this.driverName = driverName;
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
        this.destination = destination;
    }

    /* Setters */
    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    /* Setters */

    /* Getters */
    public String getDriverName() {
        return driverName;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getDestination() {
        return destination;
    }
    /* Getters */

    public double calculateProfit() {
        boolean MPV = vehicleType.equalsIgnoreCase("MPV");
        boolean day = orderTime.equalsIgnoreCase("Day");
        boolean night = orderTime.equalsIgnoreCase("Night");

        if (MPV && day) {
            return totalAmount * 0.35;
        } else if (MPV && night) {
            return totalAmount * 0.25;
        }

        return totalAmount * 0.20;
    }

    public String toString() {
        return super.toString() +
               "\nDriver Name: " + driverName +
               "\nLicense Plate: " + licensePlate +
               "\nVehicle Type: " + vehicleType +
               "\nDestination: " + destination;
    }
}
