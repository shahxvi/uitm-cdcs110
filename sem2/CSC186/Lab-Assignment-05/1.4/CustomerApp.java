import java.util.Scanner;

public class CustomerApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int numberOfCustomers;

        System.out.print("Please enter the number of Customers: ");
        numberOfCustomers = keyboard.nextInt();
        keyboard.nextLine();

        Customer[] customers = new Customer[numberOfCustomers];

        for (int i = 0; i < customers.length; i++) {
            System.out.print("\nEnter Customer #" + (i+1) + " Name: ");
            String custName = keyboard.nextLine();

            System.out.print("Enter Customer #" + (i+1) + " IC Number: ");
            int icNo = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Enter Customer #" + (i+1) + " Address: ");
            String address = keyboard.nextLine();

            System.out.println("\n| Room Type | Price (RM/Day) |");
            System.out.println("| --------- | -------------- |");
            System.out.println("| Standard  | 180.00         |");
            System.out.println("| Superior  | 220.00         |");
            System.out.println("| Deluxe    | 280.00         |");
            System.out.println("| Executive | 400.00         |");
            System.out.print("Enter Customer #" + (i+1) + " Room Type: ");
            String roomType = keyboard.nextLine();

            System.out.print("Enter Customer #" + (i+1) + " Booking Number: ");
            int bookingNo = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Enter Customer #" + (i+1) + " Number of Booking Days: ");
            int day = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("Is Customer #" + (i+1) + " a Member? (Y/N): ");
            boolean member = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');
            keyboard.nextLine();

            if (member) {
                System.out.print("Enter Customer #" + (i+1) + " Member Number: ");
                int memberNo = keyboard.nextInt();
                keyboard.nextLine();

                System.out.print("Enter Customer #" + (i+1) + " Member Expiry Date: ");
                String dateExpired = keyboard.nextLine();
                customers[i] = new Member(custName, icNo, address, roomType, bookingNo, day, memberNo, dateExpired);
            } else {
                System.out.print("Did Customer #" + (i+1) + " booked a Spa Treatment? (Y/N): ");
                boolean spa = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');
                keyboard.nextLine();

                int noTreatment = 0;
                if (spa) {
                    System.out.print("Enter Customer #" + (i+1) + " number of spa treatment: ");
                    noTreatment = keyboard.nextInt();
                    keyboard.nextLine();
                }

                System.out.print("Did Customer #" + (i+1) + " booked for breakfast? (Y/N): ");
                boolean breakfast = (Character.toUpperCase(keyboard.next().charAt(0)) == 'Y');
                keyboard.nextLine();

                customers[i] = new NonMember(custName, icNo, address, roomType, bookingNo, day, spa, noTreatment, breakfast);
            }
        }

        // Net price for all customers
        for (Customer c : customers) {
            System.out.println();
            c.toString();
        }

        // Grand total
        double grandTotal = 0.00;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] instanceof NonMember) {
                grandTotal += ((NonMember) customers[i]).calculatePayment();
            } else {
                grandTotal += ((Member) customers[i]).calculatePayment();
            }
        }
        System.out.println("Grand total for all Customers: RM" + grandTotal);
        
        // Customer with the highest payment
        System.out.println("\nDetails of customer with the highest payment:-");
        double highestPayment = -999.99;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i] instanceof NonMember) {
                if (((NonMember) customers[i]).calculatePayment() > highestPayment) {
                    highestPayment = ((NonMember) customers[i]).calculatePayment();
                }
            } else {
                if (((Member) customers[i]).calculatePayment() > highestPayment) {
                    highestPayment = ((Member) customers[i]).calculatePayment();
                }
            }
        }

        for (int i = 0; i < customers.length; i++) {
            if (customers[i] instanceof NonMember) {
                if (((NonMember) customers[i]).calculatePayment() == highestPayment) {
                    System.out.println(customers[i].toString());
                }
            } else {
                if (((Member) customers[i]).calculatePayment() == highestPayment) {
                    System.out.println(customers[i].toString());
                }
            }
        }

        // Total number of non-member who have breafast and spa
        int breakfastAndSpa = 0;
        for (Customer c : customers) {
            if (c instanceof NonMember) {
                if (((NonMember) c).getBreakfast() && ((NonMember) c).getSpa()) {
                    breakfastAndSpa++;
                }
            }
        }
        System.out.println("Total number of Non-Members who have breakfast and Spa: " + breakfastAndSpa);
    }
}
