import java.util.Scanner;

public class Canopy {
        public static void main(String[] args) {
                boolean isContinue;
                Scanner keyboard = new Scanner(System.in);
                do {
                        char participantCode = 'N';
                        int totalCanopies = 0;
                        int totalDays = 0;
                        boolean isSellingWetItem = false;
                        double totalCharge = 0;

                        // Table
                        System.out.println("| Participant Type | Participant Code | Charges / Day |");
                        System.out.println("| ---------------- | ---------------- | ------------- |");
                        System.out.println("| Students         | T                | RM90.00       |");
                        System.out.println("| Staff            | S                | RM150.00      |");
                        System.out.println("| Outsider         | O                | RM200.00      |");

                        // Get Code
                        System.out.print("Please enter your code: ");
                        participantCode = Character.toUpperCase(keyboard.next().charAt(0));

                        // Loop for invalid code
                        while (participantCode != 'T' && participantCode != 'S' && participantCode != 'O') {
                                System.out.print("Please enter your code: ");
                                participantCode = Character.toUpperCase(keyboard.next().charAt(0));
                        }
                        keyboard.nextLine(); // Consume leftover \n

                        // Get number of canopies
                        System.out.print("\nPlease the number of canopies: ");
                        totalCanopies = keyboard.nextInt();
                        keyboard.nextLine(); // Consume leftover \n

                        // Get day count
                        System.out.print("\nPlease the number of days to use: ");
                        totalDays = keyboard.nextInt();
                        keyboard.nextLine(); // Consume leftover \n

                        // Get wet item
                        System.out.print("\nDo you want to sell wet item? (y/n): ");
                        isSellingWetItem = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');

                        // Calculate total charge
                        totalCharge = canopyCharge(participantCode, totalCanopies, totalDays)
                                        + additionalCharge(isSellingWetItem);
                        // Summary
                        System.out.println("Participant Code:\t" + participantCode);
                        System.out.println("Number of Canopies:\t" + totalCanopies);
                        System.out.println("Selling Wet Item:\t" + isSellingWetItem);
                        if (isSellingWetItem)
                                System.out.println("Wet Item Charge:\t" + additionalCharge(isSellingWetItem));
                        System.out.println("Total Charge:\t\t" + totalCharge);

                        // Continue?
                        System.out.print("\nDo you want to continue for another customer? (y/n): ");
                        isContinue = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');
                } while (isContinue);
                keyboard.close();
        }

        public static double additionalCharge(boolean isSellingWetItem) {
                return (isSellingWetItem) ? 100 : 0;
        }

        public static double canopyCharge(char participantCode, int totalCanopies, int totalDays) {
                switch (participantCode) {
                        case 'T':
                                return (90 * totalDays) * totalCanopies;
                        case 'S':
                                return (150 * totalDays) * totalCanopies;
                        default:
                                return (200 * totalDays) * totalCanopies;
                }
        }
}
