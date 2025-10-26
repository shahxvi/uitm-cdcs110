import java.util.Scanner;

public class Canopy_OOP {
        public static final double STUDENT_CHARGE = 90.00;
        public static final double STAFF_CHARGE = 150.00;
        public static final double OUTSIDER_CHARGE = 200.00;

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
                        System.out.printf("| Participant Type | Participant Code | Charges / Day |");
                        System.out.printf("\n| ---------------- | ---------------- | ------------- |");
                        System.out.printf("\n| Students         | T                | RM%.2f        |", STUDENT_CHARGE);
                        System.out.printf("\n| Staff            | S                | RM%.2f        |", STAFF_CHARGE);
                        System.out.printf("\n| Outsider         | O                | RM%.2f        |", OUTSIDER_CHARGE);

                        // Get Code
                        System.out.print("\nPlease enter your code: ");
                        participantCode = Character.toUpperCase(keyboard.next().charAt(0));

                        // Loop for invalid code
                        while (participantCode != 'T' && participantCode != 'S' && participantCode != 'O') {
                                System.out.print("\nPlease enter your code: ");
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
                        System.out.print("\nWill you be selling wet items? (y/n): ");
                        isSellingWetItem = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');

                        // Calculate total charge
                        totalCharge = canopyCharge(participantCode, totalCanopies, totalDays)
                                        + additionalCharge(isSellingWetItem);

                        // Summary
                        System.out.println("\nParticipant Code:\t" + participantCode);
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
                                return (STUDENT_CHARGE * totalCanopies) * totalDays;
                        case 'S':
                                return (STAFF_CHARGE * totalCanopies) * totalDays;
                        default:
                                return (OUTSIDER_CHARGE * totalCanopies) * totalDays;
                }
        }

        private class Customer {
                private char participantCode;
                private int totalCanopies;
                private int totalDays;
                private boolean isSellingWetItem;
                private double totalCharge;

                // Setters
                public void setParticipantCode(char participantCode) {
                        this.participantCode = participantCode;
                }

                public void setTotalCanopies(int totalCanopies) {
                        this.totalCanopies = totalCanopies;
                }

                public void setTotalDays(int totalDays) {
                        this.totalDays = totalDays;
                }

                public void setIsSellingWetItem(boolean isSellingWetItem) {
                        this.isSellingWetItem = isSellingWetItem;
                }

                public void setTotalCharge(double totalCharge) {
                        this.totalCharge = totalCharge;
                }

                // Getters
                public char getParticipantCode() {
                        return participantCode;
                }

                public int getTotalCanopies() {
                        return totalCanopies;
                }

                public int getTotalDays() {
                        return totalDays;
                }

                public boolean getIsSellingWetItem() {
                        return isSellingWetItem;
                }

                public double getTotalCharge() {
                        return totalCharge;
                }
        }
}
