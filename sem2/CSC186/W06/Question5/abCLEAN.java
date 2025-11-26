package W06.Question5;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class abCLEAN {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Worker[] worker = new Worker[2]; // TODO: Change array size from 2 to 50
        CustomerServices[] customerServices = new CustomerServices[2]; // TODO: Change array size from 2 to 50
        double serviceCharge;

        for (int i = 0; i < customerServices.length; i++) {
            System.out.print("\nPlease enter assigned Worker Name: ");
            String wkrName = keyboard.nextLine();

            System.out.print("Please enter " + wkrName + "'s ID: ");
            String wkrId = keyboard.nextLine();

            System.out.print("Please enter " + wkrName + "'s ID: ");
            String wkrContact = keyboard.nextLine();
            worker[i] = new Worker(wkrName, wkrId, wkrContact);

            customerServices[i] = new CustomerServices();
            System.out.print("Please enter customer's name: ");
            String custName = keyboard.nextLine();

            System.out.print("Please enter " + custName + "'s phone number: ");
            String phoneNo = keyboard.nextLine();

            System.out.print("Please enter " + custName + "'s address: ");
            String address = keyboard.nextLine();

            System.out.println("| Service Type | Price per feet^2 (RM) |");
            System.out.println("| ------------ | --------------------- |");
            System.out.println("| Grass        | 0.85                  |");
            System.out.println("| Rooom        | 2.00                  |");
            System.out.println("| Toilet       | 5.00                  |");

            String serviceType;
            do {
                System.out.print("Please enter service type: ");
                serviceType = keyboard.nextLine();

                serviceCharge = customerServices[i].clacServiceCharge();

            } while (serviceType.equalsIgnoreCase("Grass"));

            while (true) {
                System.out.print("Enter addition service type (enter q to quit): ");
                String str = keyboard.next().toUpperCase();

                if (str.equalsIgnoreCase("Q"))
                    continue;
                else
                    serviceType = str;

                System.out.println("| Service Type | Price per feet^2 (RM) |");
                System.out.println("| ------------ | --------------------- |");
                System.out.println("| Grass        | 0.85                  |");
                System.out.println("| Rooom        | 2.00                  |");
                System.out.println("| Toilet       | 5.00                  |");
                System.out.print("Enter addition service type (enter q to quit): ");
                serviceType = keyboard.nextLine();

                serviceCharge = customerServices[i].clacServiceCharge();

            }

            customerServices[i].setCustomerServices(custName, phoneNo, address, serviceType, serviceArea, toiletArea,
                    worker);
        }
    }
}
