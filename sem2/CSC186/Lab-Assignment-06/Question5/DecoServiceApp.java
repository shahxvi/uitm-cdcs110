import java.util.Scanner;

public class DecoServiceApp {
    public static void main() {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of services: ");
        int numService = keyboard.nextInt();
        keyboard.nextLine();

        DecoService[] service = new DecoService[numService];

        for (int i = 0; i < service.length; i++) {
            System.out.println("\n1. Home Deco");
            System.out.println("2. Wedding Deco");
            System.out.print("Enter Deco Type (1/2): ");
            int decoType = keyboard.nextInt();
            keyboard.nextLine();

            if (decoType == 1) {
                service[i] = new HomeDeco();
            } else {
                service[i] = new WeddingDeco();
            }

            System.out.print("\nEnter Name: ");
            service[i].setCustomerName(keyboard.nextLine());

            System.out.print("\nEnter Contact Number: ");
            service[i].setContactNumber(keyboard.nextInt());
            keyboard.nextLine();

            System.out.print("\n3D Plan? (true/false): ");
            service[i].setPlan3D(keyboard.nextBoolean());
            keyboard.nextLine();

            if (service[i] instanceof HomeDeco) {
                System.out.println("\n| --------------- | --------------- | --------------------- |");
                System.out.println("| Home Area       | Area Size (m^2) | Charge per 1 m^2 (RM) |");
                System.out.println("| --------------- | --------------- | --------------------- |");
                System.out.println("| 1 - Living Room | 20 and below    | 1000                  |");
                System.out.println("|                 | Above 20        | 1500                  |");
                System.out.println("| --------------- | --------------- | --------------------- |");
                System.out.println("| 2 - Dining Room | 20 and below    | 800                   |");
                System.out.println("|                 | Above 20        | 1300                  |");
                System.out.println("| --------------- | --------------- | --------------------- |");

                System.out.print("\nEnter Home Area (1/2): ");
                ((HomeDeco) service[i]).setHomeArea(keyboard.nextInt());
                keyboard.nextLine();

                System.out.print("\nEnter Area Size (m^2): ");
                ((HomeDeco) service[i]).setAreaSize(keyboard.nextInt());
                keyboard.nextLine();
            } else {

                System.out.println("\n| ------------- | --------------- | --------------------- |");
                System.out.println("| Wedding Theme | Wedding Package | Charge per 1 m^2 (RM) |");
                System.out.println("| ------------- | --------------- | --------------------- |");
                System.out.println("| 1 - Floral    | A               | 1000                  |");
                System.out.println("|               | B               | 1500                  |");
                System.out.println("| ------------- | --------------- | --------------------- |");
                System.out.println("| 2 - Beach     | A               | 800                   |");
                System.out.println("|               | B               | 1300                  |");
                System.out.println("| ------------- | --------------- | --------------------- |");

                System.out.print("\nEnter Wedding Theme (1/2): ");
                int choice = keyboard.nextInt();
                keyboard.nextLine();

                if (choice == 1) {
                    ((WeddingDeco) service[i]).setWeddingTheme("Floral");
                } else {
                    ((WeddingDeco) service[i]).setWeddingTheme("Beach");
                }

                System.out.print("\nEnter Wedding Package (A/B): ");
                ((WeddingDeco) service[i]).setWeddingPackage(keyboard.nextLine().charAt(0));
            }

        }

        // Calculate and display the total cost gathered from customers who chose a floral wedding theme.
        double floralTotalCost = 0.00;
        for (DecoService s : service) {
            if (s instanceof WeddingDeco && ((WeddingDeco) s).getWeddingTheme().equalsIgnoreCase("Floral")) {
                floralTotalCost += s.calcDesignCost();
            }
        }
        System.out.printf("\nTotal cost gathered from customers who chose a floral wedding theme: RM %,.2f", floralTotalCost);
    }
}
