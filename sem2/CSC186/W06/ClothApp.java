import java.util.Scanner;

public class ClothApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfCustomers = 3;
        Cloth[] cloths = new Cloth[numberOfCustomers];

        for (int i = 0; i < cloths.length; i++) {
            cloths[i] = new Cloth();

            System.out.print("\nEnter your name: ");
            cloths[i].setName(keyboard.nextLine());

            System.out.print("Enter cloth price: ");
            cloths[i].setPrice(keyboard.nextDouble());
            keyboard.nextLine();

            System.out.print("Enter cloth length: ");
            cloths[i].setLength(keyboard.nextDouble());
            keyboard.nextLine();

            System.out.print(cloths[i]);
        }
        keyboard.close();

        System.out.printf("\nTotal payment from all customers: RM%,.2f", totalPayment(cloths));
        System.out.println("\nNumber of customers with more than 10 meters of cloth: " + customersWithMoreThan10Meters(cloths));
        System.out.println("\nCustomer with the highest payment:" + highestPayment(cloths));
    }

    public static int customersWithMoreThan10Meters(Cloth[] cloths) {
        int customersWithMoreThan10Meters = 0;
        for (Cloth c : cloths) {
            if (c.getLength() > 10.00) {
                customersWithMoreThan10Meters++;
            }
        }
        return customersWithMoreThan10Meters;
    }

    public static double totalPayment(Cloth[] cloths) {
        double totalPayment = 0;
        for (Cloth c : cloths) {
            totalPayment += c.calcPayment();
        }
        return totalPayment;
    }

    public static Cloth highestPayment(Cloth[] cloths) {
        double highestPayment = -9999999.99;
        int i = 0;
        for (Cloth c : cloths) {
            if (c.calcPayment() > highestPayment) {
                highestPayment = c.calcPayment();
            } else {
                i++;
            }
        }
        return cloths[i];
    }
}
