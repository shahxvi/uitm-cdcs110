public class Vehicle {
    private String carType;
    private String carPlateNumber;
    private double carPrice;

    Vehicle(String carType, String carPlateNumber, double carPrice) {
        this.carType = carType;
        this.carPlateNumber = carPlateNumber;
        this.carPrice = carPrice;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public void setCarPlateNumber(String carPlateNumber) {
        this.carPlateNumber = carPlateNumber;
    }

    public void setCarPrice(double carPrice) {
        this.carPrice = carPrice;
    }

    public String getCarType() {
        return carType;
    }

    public String getCarPlateNumber() {
        return carPlateNumber;
    }

    public double getCarPrice() {
        return carPrice;
    }
}
