import java.util.Scanner;

public class KTMB {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                char repeat;
                do {
                        String passengerID;
                        char packageCode;
                        int adultQuantity = 0;
                        int childQuantity = 0;

                        double ticketPrice;
                        final double ADULT_GOLD_PRICE = 59.00;
                        final double CHILD_GOLD_PRICE = 34.00;
                        final double ADULT_PLATINUM_PRICE = 79.00;
                        final double CHILD_PLATINUM_PRICE = 44.00;
                        double total;

                        boolean addOn;
                        final double MEAL_COMBO_PRICE = 7.00;
                        int mealComboQuantity = 0;
                        double mealComboCharge = 0.00;

                        // Get Pessenger ID
                        System.out.print("Please enter Passenger ID: ");
                        passengerID = keyboard.nextLine();

                        // Table of Prices
                        System.out.println("\n| Type of Package  | Ticket Category | Ticket Price (RM) |");
                        System.out.println("| ---------------- | --------------- | ----------------- |");
                        System.out.printf("| ETS Gold (G)     | Adult           | %.2f             |\n",
                                        ADULT_GOLD_PRICE);
                        System.out.printf("| ETS Gold (G)     | Child           | %.2f             |\n",
                                        CHILD_GOLD_PRICE);
                        System.out.printf("| ETS Platinum (P) | Adult           | %.2f             |\n",
                                        ADULT_PLATINUM_PRICE);
                        System.out.printf("| ETS Platinum (P) | Child           | %.2f             |\n",
                                        CHILD_PLATINUM_PRICE);

                        // Get Package Code
                        System.out.print("Please enter package code (G / P): ");
                        packageCode = Character.toUpperCase(keyboard.next().charAt(0));

                        // For invalid Package Code
                        while (!(packageCode == 'G' || packageCode == 'P')) {
                                System.out.println("Invalid Package Code");
                                System.out.print("Please enter package code (G / P): ");
                                packageCode = Character.toUpperCase(keyboard.next().charAt(0));
                        }

                        System.out.print("\nPlease enter quantity of adults: ");
                        adultQuantity = keyboard.nextInt();

                        System.out.print("\nPlease enter quantity of children: ");
                        childQuantity = keyboard.nextInt();

                        // Calculation for ticket price
                        if (packageCode == 'G') {
                                ticketPrice = (adultQuantity * ADULT_GOLD_PRICE) + (childQuantity * CHILD_GOLD_PRICE);
                        } else {
                                ticketPrice = (adultQuantity * ADULT_PLATINUM_PRICE)
                                                + (childQuantity * CHILD_PLATINUM_PRICE);
                        }

                        // Confirmation for meal combo
                        System.out.print("\nDo you want add on meal combo? (Y/N): ");
                        addOn = keyboard.next().equalsIgnoreCase("Y");

                        // Get quantity and calculate charge
                        if (addOn) {
                                System.out.print("Enter quantity of meal combo: ");
                                mealComboQuantity = keyboard.nextInt();

                                mealComboCharge = mealComboQuantity * MEAL_COMBO_PRICE;
                        }

                        // Calculate final @ total charge
                        total = ticketPrice + mealComboCharge;

                        // Order Summary
                        System.out.println("\nETS TICKET INFORMATION - Butterworth to Kuala Lumpur");
                        System.out.printf("PASSENGER ID:\t\t%s\n", passengerID);
                        System.out.printf("Number of Adults:\t%d\n", adultQuantity);
                        System.out.printf("Number of Childrens:\t%d\n", childQuantity);
                        System.out.printf("Ticket Price:\t\tRM%,.2f\n", ticketPrice);
                        System.out.printf("Meal Combo Price:\tRM%,.2f\n", mealComboCharge);
                        System.out.printf("Net Ticket Price:\tRM%,.2f\n", total);

                        System.out.print("\nRepeat for a different Customer? (Y/N): ");
                        repeat = Character.toUpperCase(keyboard.next().charAt(0));
                } while (!(repeat == 'N'));
                keyboard.close();
        }
}
