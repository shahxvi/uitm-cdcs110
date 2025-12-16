import java.util.Scanner;
import java.io.*;

public class CarApp {
    public static void main(String[] args) {
        try {
            File inputFile = new File("car.txt");
            Scanner inputReader = new Scanner(inputFile);

            Vehicle[] arrCar = new Vehicle[6];
            for (int i = 0; i < arrCar.length; i++) {
                String str = inputReader.nextLine();
                String[] tokens = str.split(";");
                String carType = tokens[0];
                String carPlateNumber = tokens[1];
                double carPrice = Double.parseDouble(tokens[2]);
                arrCar[i] = new Vehicle(carType, carPlateNumber, carPrice);
            }

            final int selangor = 0;
            final int terengganu = 1;
            PrintWriter[] output = new PrintWriter[2];
            for (int i = 0; i < output.length; i++) {
                output[i] = new PrintWriter((i == 0 ? "selangor" : "terengganu") + ".txt");
                output[i].printf("%-6s    %-12s    %-10s\n", "Type", "Plate Number", "Price (RM)");
                output[i].printf("%-6s    %-12s    %-10s\n", "------", "------------", "----------");
            }

            double totalPriceSelangor = 0;
            double totalPriceTerengganu = 0;
            for (Vehicle a : arrCar) {
                if (a.getCarPlateNumber().startsWith("B")) { // Selangor License Plate
                    output[selangor].printf("%-6s    %-12s    %-10.2f\n", a.getCarType(), a.getCarPlateNumber(),
                            a.getCarPrice());
                    totalPriceSelangor += a.getCarPrice();
                }
                if (a.getCarPlateNumber().startsWith("T")) { // Terengganu License Plate
                    output[terengganu].printf("%-6s    %-12s    %-10.2f\n", a.getCarType(), a.getCarPlateNumber(),
                            a.getCarPrice());
                    totalPriceTerengganu += a.getCarPrice();
                }
            }

            inputReader.close();
            for (int i = 0; i < output.length; i++) {
                output[i].close();
            }
            System.out.println("Total price for cars manufactured in Selangor: RM" + totalPriceSelangor);
            System.out.println("Total price for cars manufactured in Terengganu: RM" + totalPriceTerengganu);
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}
