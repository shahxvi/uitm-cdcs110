import java.util.Scanner;

public class EventApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // STEP 1: Declare array of object
        System.out.print("Enter size of Array: ");
        int eventSize = keyboard.nextInt();
        keyboard.nextLine();

        Event[] event = new Event[eventSize];

        for (int i = 0; i < event.length; i++) {
            System.out.print("\nEnter Event #" + (i+1) + " Name: ");
            String eventName = keyboard.nextLine();

            System.out.print("Enter Date: ");
            String date = keyboard.nextLine();

            System.out.println("1 - Conference");
            System.out.println("2 - Wedding");
            System.out.print("Enter Option: ");
            int option = keyboard.nextInt();
            keyboard.nextLine();

            if (option == 1) {
                System.out.print("Enter Type: ");
                char type = keyboard.nextLine().toUpperCase().charAt(0);

                event[i] = new Conference(eventName, date, type);
            } else {
                System.out.print("Eneter Number of Guests: ");
                int numOfGuest = keyboard.nextInt();
                keyboard.nextLine();

                System.out.print("Enter Menu Package: ");
                char menuPackage = keyboard.nextLine().toUpperCase().charAt(0);

                System.out.print("Enter Door Gifts (Y/N): ");
                boolean doorGift = (keyboard.nextLine().toUpperCase().charAt(0) == 'Y');

                event[i] = new Wedding(eventName, date, numOfGuest, menuPackage, doorGift);
            }

        }

        for (Event e : event) {
            if (e.getDate().substring(2, 8).equalsIgnoreCase("052023")) {
                System.out.printf("\n%s\nPayment: RM%,.2f\n", e.toString() , e.calcPayment());
            }
        }

        int conferenceCount = 0, weddingCount = 0;
        double totalConferenceCost = 0.00, totalWeddingCost = 0.00;

        for (Event e : event) {
            if (e instanceof Conference) {
                conferenceCount++;
                totalConferenceCost += e.calcPayment();
            } else if (e instanceof Wedding) {
                weddingCount++;
                totalWeddingCost += e.calcPayment();
            }
        }

        System.out.println("The number of Conference events: " + conferenceCount);
        System.out.printf("Total Payment of Conference events: RM%,.2f", totalConferenceCost);

        System.out.println("\nThe number of Wedding events: " + weddingCount);
        System.out.printf("Total Payment of Wedding events: RM%,.2f\n", totalWeddingCost);
    }
}
