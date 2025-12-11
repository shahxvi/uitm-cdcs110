import java.util.Scanner;
import java.io.*;

public class SupermarketApp {
    public static void main(String[] args) {
        try {
            File file = new File("20180221.txt");
            Scanner inputFile = new Scanner(file);
            Supermarket[] arrStore = new Supermarket[5];

            int index = 0;
            while (inputFile.hasNext() && index < arrStore.length) {
                String str = inputFile.nextLine();
                String[] token = str.split(",");

                arrStore[index] = new Supermarket();
                arrStore[index].setItemName(token[0]);
                arrStore[index].setQuantity(Integer.parseInt(token[1]));
                arrStore[index].setUnitPrice(Double.parseDouble(token[2]));
                index++;
            }
            inputFile.close();

            double totalSale = 0.00;
            PrintWriter outputFile = new PrintWriter("reportSale.txt");
            outputFile.printf("%-18s\t%-8s\t%-9s\t%-11s\n", "Item", "Quantity", "Price(RM)", "Sub Total(RM)");
            for (int i = 0; i < arrStore.length; i++) {
                double subtotal = arrStore[i].getUnitPrice() * arrStore[i].getQuantity();
                totalSale += subtotal;
                outputFile.printf("%-18s\t%-8d\t%-9.2f\t%-11.2f\n", arrStore[i].getItemName(), arrStore[i].getQuantity(), arrStore[i].getUnitPrice(), subtotal);
            }
            outputFile.printf("TOTAL SALE for date: 21st, February 2018 is: RM%.2f", totalSale);
            outputFile.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
