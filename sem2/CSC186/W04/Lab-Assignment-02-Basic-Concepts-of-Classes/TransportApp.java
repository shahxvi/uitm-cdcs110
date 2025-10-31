import java.util.Scanner;

public class TransportApp {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                Transport transport = new Transport();

                // Get registration number
                System.out.print("Please enter your registration number: ");
                transport.setRegistrationNumber(keyboard.nextLine());

                // Get brand
                System.out.print("Please enter your brand: ");
                transport.setBrand(keyboard.nextLine());

                // Get transport's price
                System.out.print("Please your transport's original price: ");
                transport.setPrice(keyboard.nextDouble());
                keyboard.nextLine();

                if (transport.transportSelangor())
                        transport.setDiscountRate(0.10);

                System.out.println(transport);
                keyboard.close();
        }
}
