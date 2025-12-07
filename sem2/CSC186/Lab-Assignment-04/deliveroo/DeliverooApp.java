import java.util.Scanner;
import java.io.*;
import java.text.DecimalFormat;

public class DeliverooApp {
    public static void main(String[] args) {
        try {
            File inputFile = new File("deliveroo.txt");
            Scanner inputReader = new Scanner(inputFile);
            PrintWriter output = new PrintWriter("earnings.txt");
            DecimalFormat df = new DecimalFormat("#.##");

            double totalProfit = 0;
            int deliveries = 0;
            output.printf("Profit earned for each delivery\n");
            output.printf("Date(Day)\t\t\tProfit\n");
            output.printf("===============================\n");

            while (inputReader.hasNext()) {
                String record = inputReader.nextLine();
                String[] tokens = record.split(",");
                String date = tokens[0];
                String day = tokens[1];
                double price = Double.parseDouble(tokens[5]);
                double priceMultiplier = Double.parseDouble(tokens[7]);
                double profit = df.format((price * priceMultiplier) - price);
                totalProfit += profit;
                deliveries++;

                output.printf("%-10s(%-3s)\t\tRM%.2f\n", date, day.substring(0, 3), profit);
            }
            output.printf("===============================\n");
            output.printf("Average profit for each order: RM%f", (totalProfit / deliveries));

            inputReader.close();
            output.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}
