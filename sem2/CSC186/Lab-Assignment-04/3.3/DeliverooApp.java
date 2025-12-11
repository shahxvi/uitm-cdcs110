import java.util.Scanner;
import java.io.*;

public class DeliverooApp {
    public static void main(String[] args) {
        try {
            File inputFile = new File("deliveroo.txt");
            Scanner inputReader = new Scanner(inputFile);
            PrintWriter output = new PrintWriter("earnings.txt");

            double totalProfit = 0;
            int deliveries = 0;
            output.printf("Profit earned for each delivery\n");
            output.printf("Date(Day)\t\t\tProfit\n");
            output.printf("=====================================\n");

            int deliveries9pmAndLater = 0;
            while (inputReader.hasNext()) {
                String record = inputReader.nextLine();
                String[] tokens = record.split(",");
                String date = tokens[0];
                String day = tokens[1];
                String startTime = tokens[2];
                String[] hourStr = startTime.split(":");
                int hour = Integer.parseInt(hourStr[0]);

                if (startTime.contains("PM") && hour >= 9)
                    deliveries9pmAndLater++;

                double price = Double.parseDouble(tokens[5]);
                double priceMultiplier = Double.parseDouble(tokens[7]);
                double profit = (price * priceMultiplier) - price;
                totalProfit += profit;
                deliveries++;

                output.printf("%-10s(%-3s)\t\tRM%.2f\n", date, day.substring(0, 3), profit);
            }
            output.printf("=====================================\n");
            output.printf("Average profit for each order: RM%.2f", (totalProfit / deliveries));

            inputReader.close();
            output.close();

            System.out.println("Number of deliveries with start time at 9PM or later: " + deliveries9pmAndLater);
        } catch (IOException e) {
            System.out.println("File not found.");
        }
    }
}
