import java.util.Scanner;

public class DesignSeriveApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter number of customers: ");
        int numOrder = keyboard.nextInt();
        keyboard.nextLine();

        DesignService[] ds = new DesignService[numOrder];

        for (int i = 0; i < numOrder; i++) {
            System.out.println("\nCustomer #" + (i+1));
            System.out.println("1. Physical Design");
            System.out.println("2. Digital Design");
            System.out.print("Choose Your Design Service (1/2): ");
            int intInput = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("\nEnter your name: ");
            String custName = keyboard.nextLine();

            System.out.print("\nEnter deposit amount (Minimum RM30): RM");
            int deposit = keyboard.nextInt();
            keyboard.nextLine();

            System.out.print("\nIs your order urgent? (Y/N): ");
            boolean urgentOrder = (Character.toUpperCase(keyboard.nextLine().charAt(0)) == 'Y');

            switch (intInput) {
                case 1:
                    System.out.println("\n1. Banner");
                    System.out.println("2. Brochure");
                    System.out.println("3. Poster");
                    System.out.println("4. Business Card");
                    System.out.print("Choose Your Design Service (1 - 4): ");
                    int type = keyboard.nextInt();
                    keyboard.nextLine();

                    System.out.print("\nDo you want printing (Y/N): ");
                    boolean printing = (Character.toUpperCase(keyboard.nextLine().charAt(0)) == 'Y');

                    System.out.print("\nHow many copies would you like?: ");
                    int numCopy = keyboard.nextInt();
                    keyboard.nextLine();

                    ds[i] = new PhysicalDesign(custName, deposit, urgentOrder, type, printing, numCopy);
                    break;
                case 2:
                    System.out.println("\n1. Website");
                    System.out.println("2. Advertisement");
                    System.out.print("\nChoose Your Design Service (1/2): ");
                    type = keyboard.nextInt();
                    keyboard.nextLine();

                    ds[i] = new DigitalDesign(custName, deposit, urgentOrder, type);
                    break;
            }

        }

        // Display the details of PhysicalDesign order together with payment
        System.out.println("\nDetails of Physical Design Order:");
        for (DesignService d : ds) {
            if (d instanceof PhysicalDesign) {
                System.out.println(d.toString());
                System.out.println("Payment: RM" + d.calcPayment() + "\n");
            }
        }
        
        // Count and display the number of urgent orders for website design
        int count = 0;
        for (DesignService d : ds) {
            if (d instanceof DigitalDesign && d.getUrgentOrder()) {
                count++;
            }
        }

        System.out.println("\nThe number of urgent orders for website design: " + count);
    }
}
