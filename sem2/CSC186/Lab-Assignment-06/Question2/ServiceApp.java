import java.util.Scanner;

public class ServiceApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Declaration of an array for the e-hailing services named service which the number of services is determined by the user
        System.out.print("Enter number of service: ");
        int serviceNum = keyboard.nextInt();
        Service[] service = new Service[serviceNum];

        for (int i = 0; i < service.length; i++) {
            System.out.println("\n1. Food Delivery Service");
            System.out.println("2. Ride Service");
            System.out.print("Enter e-Hailing service (1/2): ");
            int chosenService = keyboard.nextInt();
            keyboard.nextLine();

            if (chosenService == 1) {
                    service[i] = new FoodDelivery();
            } else {
                    service[i] = new Ride();
            }

            System.out.print("\nEnter your name: ");
            service[i].setCustomerName(keyboard.nextLine());

            System.out.print("\nEnter your current location: ");
            service[i].setCustomerLocation(keyboard.nextLine());

            System.out.println("\n1. Cash");
            System.out.println("2. eWallet");
            System.out.print("Enter your payment type (1/2): ");
            service[i].setPaymentType(keyboard.nextLine());

            System.out.print("\nEnter total amount: RM");
            service[i].setTotalAmount(keyboard.nextDouble());
            keyboard.nextLine();

            String orderTime = null;
            if (service[i] instanceof FoodDelivery) {
                System.out.println("\n1. Breakfast");
                System.out.println("2. Lunch");
                System.out.println("3. Hi-Tea");
                System.out.println("4. Dinner");
                System.out.print("Enter your order time (1-4): ");
                int chosenOrderTime = keyboard.nextInt();
                keyboard.nextLine();

                switch (chosenOrderTime) {
                    case 1: service[i].setOrderTime("Breakfast"); break;
                    case 2: service[i].setOrderTime("Lunch"); break;
                    case 3: service[i].setOrderTime("Hi-Tea"); break;
                    case 4: service[i].setOrderTime("Dinner"); break;
                }

                System.out.print("\nEnter restaurant name: ");
                ((FoodDelivery) service[i]).setRestaurantName(keyboard.nextLine());

                System.out.print("\nEnter restaurant location: ");
                ((FoodDelivery) service[i]).setRestaurantLocation(keyboard.nextLine());

                System.out.print("\nEnter your order details: ");
                ((FoodDelivery) service[i]).setOrderDetail(keyboard.nextLine());
            } else {
                System.out.println("\n1. Day");
                System.out.println("2. Night");
                System.out.print("Enter your order time (1-2): ");
                int chosenOrderTime = keyboard.nextInt();
                keyboard.nextLine();

                switch (chosenOrderTime) {
                    case 1: service[i].setOrderTime("Day"); break;
                    case 2: service[i].setOrderTime("Night"); break;
                }

                System.out.print("\nEnter driver name: ");
                ((Ride) service[i]).setDriverName(keyboard.nextLine());

                System.out.print("\nEnter license plate: ");
                ((Ride) service[i]).setLicensePlate(keyboard.nextLine());

                System.out.println("\n1. Motorcycle");
                System.out.println("2. Sedan Car");
                System.out.println("3. MPV");
                System.out.print("Enter vehicle type (1-3): ");
                int chosenVehicleType = keyboard.nextInt();
                keyboard.nextLine();

                switch (chosenVehicleType) {
                    case 1: ((Ride) service[i]).setVehicleType("Motorcycle"); break;
                    case 2: ((Ride) service[i]).setVehicleType("Sedan Car"); break;
                    case 3: ((Ride) service[i]).setVehicleType("MPV"); break;
                }

                System.out.print("\nEnter destination: ");
                ((Ride) service[i]).setDestination(keyboard.nextLine());
            }
        }

        for (Service s : service) {
            System.out.println("\n" + s.toString());
            System.out.println("Total Profit: RM" + s.calculateProfit() + "");
        }

        // Show the total profit that is contributed from the MPV ride service
        double MPVtotalProfit = 0.00;
        for (Service s : service) {
            if (s instanceof Ride && ((Ride) s).getVehicleType().equalsIgnoreCase("MPV")) {
                MPVtotalProfit += s.calculateProfit();
            }
        }
        System.out.println("\nTotal profit that is contributed from MPV ride service: RM" + MPVtotalProfit);
    }
}
