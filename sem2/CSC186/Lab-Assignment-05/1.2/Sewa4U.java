import java.util.Scanner;

public class Sewa4U {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int terraceNumber;

        System.out.print("Please enter the number of terraces: ");
        terraceNumber = keyboard.nextInt();
        keyboard.nextLine();

        // Display the total rent the company should collect for the month
        Terrace[] terraces = new Terrace[terraceNumber];
        for (int i = 0; i < terraces.length; i++) {
            terraces[i] = new Terrace();

            System.out.print("\nPlease enter tenant's name: ");
            terraces[i].setTenant(keyboard.nextLine());

            System.out.print("Please enter IC number: ");
            terraces[i].setICNo(keyboard.nextLine());

            System.out.print("Please enter terrace address: ");
            terraces[i].setAddress(keyboard.nextLine());

            System.out.print("Please enter terrace type (Single-storey / Double-storey): ");
            terraces[i].setType(keyboard.nextLine());

            while (!terraces[i].getType().equals("Single-storey") && !terraces[i].getType().equals("Double-storey")) {
                System.out.print("Please enter valid terrace type (Single-storey / Double-storey): ");
                terraces[i].setType(keyboard.nextLine());
            }

            System.out.print("Please enter lot status (Y / N): ");
            terraces[i].setLotStatus(keyboard.nextLine().equalsIgnoreCase("Y"));
        }

        // Count and display the information of tenants for double-storey corner lots
        int terraceDoubleStoreyCount = 0;
        System.out.println("\nInformation of tenants for double-storey corner lots:-");
        for (Terrace t : terraces) {
            if (t.getType().equals("Double-storey") && t.getLotStatus()) {
                terraceDoubleStoreyCount = 0;
                System.out.println(t.toString() + "\n");
            }
        }
        System.out.println("The number of tenants for Double-storey corner lots: " + terraceDoubleStoreyCount);

        // Display the total rent the company should collect for the month
        double totalRent = 0.00;
        for (Terrace t : terraces) {
            totalRent += t.calculateRent();
        }
        System.out.println("\nTotal rent should be collected: RM" + totalRent);

        // Display the type of house rented by a tenant named "Ali bin Abu"
        for (Terrace t : terraces) {
            if (t.getTenant().equalsIgnoreCase("Ali bin Abu")) {
                System.out.println("\nType of house rented by tenant Ali bin Abu: " + t.getType());
            }
        }
    }
}
