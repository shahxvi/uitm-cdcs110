import java.util.*;

public class ComputerApp {
    public static void main (String args[]) {
        ArrayList computers = new ArrayList();

        String c_code;
        String c_brand;
        double c_price;

        Scanner in = new Scanner(System.in);
        for (int counter = 0; counter < 2; counter++) {
            System.out.print("Code: ");
            c_code = in.next();
            System.out.print("Brand: ");
            c_brand = in.next();
            System.out.print("Price: ");
            c_price = in.nextDouble();
            Computer c = new Computer(c_code, c_brand, c_price);
            computers.add(c);
        }

        // Write program segments that are able to perform the following tasks:
        // (a) Display the details of all computers objects
        System.out.println("\nDetails of all computers:\n" + computers);

        // (b) Count & display the number of HP computers
        int hpCount = 0;
        for (int i = 0; i < computers.size(); i++) {
                Computer computer = (Computer) computers.get(i);
                if (computer.getBrand().equalsIgnoreCase("HP")) {
                        hpCount++;
                }
        }
        System.out.println("\nNumber of HP Computers: " + hpCount);
        

        // (c) Copy all computers with prices more than RM3,500 to another ArrayList named expensiveComputers
        ArrayList expensiveComputers = new ArrayList();
        for (int i = 0; i < computers.size(); i++) {
                Computer computer = (Computer) computers.get(i);
                if (computer.getPrice() > 3500) {
                        expensiveComputers.add(computers.get(i));
                }
        }
        // (d) Display the number of elements that expensiveComputers have.
        System.out.println("\nNumber of Expensive Computers: " + expensiveComputers.size());

        // (e) Display the details of computer specified by the user (code)
        System.out.print("\nEnter computer code: ");
        in.nextLine(); // Clear out the buffer form line 18
        String code = in.nextLine();
        for (int i = 0; i < computers.size(); i++) {
                Computer computer = (Computer) computers.get(i);
                if (code.equalsIgnoreCase(computer.getCode())) {
                        System.out.println("Result:- " + computers.get(i));
                }
        }

        in.close();
    }
}
