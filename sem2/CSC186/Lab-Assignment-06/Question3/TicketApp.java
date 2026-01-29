import java.util.Scanner;

public class TicketApp {
    public static void main() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter number of ticket: ");
        int ticketNum = keyboard.nextInt();
        keyboard.nextLine();

        Ticket[] tick = new Ticket[ticketNum];

        for (int i = 0; i < tick.length; i++) {
            System.out.println("\n1. General Admission Ticket");
            System.out.println("2. VIP Ticket");
            System.out.print("Please enter ticket type: ");
            int ticketType = keyboard.nextInt();
            keyboard.nextLine();

            if (ticketType == 1) {
                tick[i] = new GeneralAdmissionTicket();
            } else {
                tick[i] = new VIPTicket();
            }

            System.out.print("\nEnter ticket ID: ");
            tick[i].setTicketID(keyboard.nextLine());

            System.out.print("\nEnter customer name: ");
            tick[i].setCustomerName(keyboard.nextLine());

            System.out.print("\nIs customer an early bird? (Y/N): ");
            boolean earlyBird = Character.toUpperCase(keyboard.nextLine().charAt(0)) == 'Y';
            tick[i].setEarlyBird(earlyBird);

            if (tick[i] instanceof GeneralAdmissionTicket) {
                System.out.println("\n1st Tier");
                System.out.println("2nd Tier");
                System.out.println("3rd Tier");
                System.out.print("Enter seating area (1-3): ");
                ((GeneralAdmissionTicket) tick[i]).setSeatingArea(keyboard.nextInt());
                keyboard.nextLine();
            } else {
                System.out.println("\n1. Platinum");
                System.out.println("2. Gold");
                System.out.print("Enter package type (1/2): ");
                int packageType = keyboard.nextInt();
                keyboard.nextLine();
                if (packageType == 1) {
                    ((VIPTicket) tick[i]).setPackageType("Platinum");
                } else {
                    ((VIPTicket) tick[i]).setPackageType("Gold");
                }
            }
        }

        // Calculate and display the total price of all purchased tickets
        double totalTicketPrice = 0.00;
        for (Ticket t : tick) {
            totalTicketPrice = t.calcTicketPrice();
        }
        System.out.println("\nTotal price of all purchased tickets: " + totalTicketPrice);

        // Count and display the number of tickets purchased for the Platinum package
        int platinumNum = 0;
        for (Ticket t : tick) {
            if (t instanceof VIPTicket && ((VIPTicket ) t).getPackageType().equalsIgnoreCase("Platinum")) {
                platinumNum++;
            }
        }
        System.out.println("\nThe number of tickets purchased for the Platinum package: " + platinumNum);
    }
}
