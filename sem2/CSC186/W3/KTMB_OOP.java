import java.util.Scanner;

public class KTMB_OOP {
        public static void main(String[] args) {
                Scanner keyboard = new Scanner(System.in);
                char repeat;

                do {
                        Customers customers = new Customers();

                        // Get Pessenger ID
                        System.out.print("Please enter Passenger ID: ");
                        customers.setPassengerID(keyboard.nextLine());

                        // Table of Prices
                        System.out.println("\n| Type of Package  | Ticket Category | Ticket Price (RM) |");
                        System.out.println("| ---------------- | --------------- | ----------------- |");
                        System.out.printf("| ETS Gold (G)     | Adult           | %.2f             |\n", Ticket.getAdultGoldPrice());
                        System.out.printf("| ETS Gold (G)     | Child           | %.2f             |\n", Ticket.getChildGoldPrice());
                        System.out.printf("| ETS Platinum (P) | Adult           | %.2f             |\n", Ticket.getAdultPlatinumPrice());
                        System.out.printf("| ETS Platinum (P) | Child           | %.2f             |\n", Ticket.getChildPlatinumPrice());

                        // Get Package Code
                        System.out.print("Please enter package code (G / P): ");
                        customers.setPackageCode(Character.toUpperCase(keyboard.next().charAt(0)));

                        // For invalid Package Code
                        while (!(customers.getPackageCode() == 'G' || customers.getPackageCode() == 'P')) {
                                System.out.println("Invalid Package Code");
                                System.out.print("Please enter package code (G / P): ");
                                customers.setPackageCode(Character.toUpperCase(keyboard.next().charAt(0)));
                        }

                        System.out.print("\nPlease enter quantity of adults: ");
                        customers.setAdultQuantity(keyboard.nextInt());

                        System.out.print("\nPlease enter quantity of children: ");
                        customers.setChildQuantity(keyboard.nextInt());

                        // Confirmation for meal combo
                        System.out.print("\nDo you want add on meal combo? (Y/N): ");
                        customers.setAddOn(keyboard.next().equalsIgnoreCase("Y"));

                        // Get quantity and calculate charge
                        if (customers.getAddOn()) {
                                System.out.print("\nEnter quantity of meal combo: ");
                                customers.setMealQuantity(keyboard.nextInt());
                        }

                        // Order Summary
                        System.out.println("\nETS TICKET INFORMATION - Butterworth to Kuala Lumpur");
                        System.out.printf("PASSENGER ID:\t\t%s\n", customers.getPassengerID());
                        System.out.printf("Number of Adults:\t%d\n", customers.getAdultQuantity());
                        System.out.printf("Number of Childrens:\t%d\n", customers.getChildQuantity());
                        System.out.printf("Ticket Price:\t\tRM%,.2f\n", customers.getTicketPrice());
                        System.out.printf("Meal Combo Price:\tRM%,.2f\n",customers.getMealPrice());
                        System.out.printf("Net Ticket Price:\tRM%,.2f\n", customers.getTotal());

                        System.out.print("\nRepeat for a different Customer? (Y/N): ");
                        repeat = Character.toUpperCase(keyboard.next().charAt(0));
                        keyboard.nextLine(); // consume the leftover \n

                        System.out.println(); // line seperator
                } while (!(repeat == 'N'));

                keyboard.close();
        }

        private static class Customers {
                String passengerID;
                char packageCode;
                int adultQuantity;
                int childQuantity;
                boolean addOn;
                int mealQuantity;
                double total;

                Ticket ticket = new Ticket();
                Meal meal = new Meal();

                public void setPassengerID(String passengerID) {
                        this.passengerID = passengerID;
                }

                public void setPackageCode(char packageCode) {
                        this.packageCode = packageCode;
                }

                public void setAdultQuantity(int adultQuantity) {
                        this.adultQuantity = adultQuantity;
                }

                public void setChildQuantity(int childQuantity) {
                        this.childQuantity = childQuantity;
                }

                public void setAddOn(boolean addOn) {
                        this.addOn = addOn;
                }

                public void setMealQuantity(int mealQuantity) {
                        this.mealQuantity = mealQuantity;
                }

                public String getPassengerID() {
                        return passengerID;
                }

                public char getPackageCode() {
                        return packageCode;
                }

                public int getAdultQuantity() {
                        return adultQuantity;
                }

                public int getChildQuantity() {
                        return childQuantity;
                }

                public double getTicketPrice() {
                        return ticket.getTicketPrice(packageCode, adultQuantity, childQuantity);
                }

                public boolean getAddOn() {
                        return addOn;
                }
                public double getMealPrice() {
                        if (addOn)
                                return meal.getMealPrice(mealQuantity);
                        else
                                return 0;
                }

                public double getTotal() {
                        return getTicketPrice() + getMealPrice();
                }
        }

        public static class Ticket {
                private double ticketPrice;
                private static double ADULT_GOLD_PRICE = 59.00;
                private static double CHILD_GOLD_PRICE = 34.00;
                private static double ADULT_PLATINUM_PRICE = 79.00;
                private static double CHILD_PLATINUM_PRICE = 44.00;

                public static double getAdultGoldPrice() {
                        return ADULT_GOLD_PRICE;
                }

                public static double getChildGoldPrice() {
                        return CHILD_GOLD_PRICE;
                }

                public static double getAdultPlatinumPrice() {
                        return ADULT_PLATINUM_PRICE;
                }

                public static double getChildPlatinumPrice() {
                        return CHILD_PLATINUM_PRICE;
                }

                public double getTicketPrice(char packageCode, int adultQuantity, int childQuantity) {
                        if (packageCode == 'G')
                                ticketPrice = (adultQuantity * ADULT_GOLD_PRICE) + (childQuantity * CHILD_GOLD_PRICE);
                        else
                                ticketPrice = (adultQuantity * ADULT_PLATINUM_PRICE) + (childQuantity * CHILD_PLATINUM_PRICE);
                        return ticketPrice;
                }
        }

        private static class Meal {
                final double MEAL_COMBO_PRICE = 7.00;

                public double getMealPrice(int mealQuantity) {
                        return mealQuantity * MEAL_COMBO_PRICE;
                }
        }
}
