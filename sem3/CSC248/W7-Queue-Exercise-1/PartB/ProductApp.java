import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // (a) Store 10 products into the queue; prodQueue
        Queue prodQueue = new Queue();
        Queue tempQueue = new Queue();

        for (int i = 0; i < 10; i++) {
            System.out.print("\nEnter Product Type (shortSleeve / shortPants / booties): ");
            String type = keyboard.nextLine();

            System.out.print("Enter Product Color: ");
            String color = keyboard.nextLine();

            System.out.print("Enter Product Size (S / M / L): ");
            char size = keyboard.nextLine().charAt(0);

            System.out.print("Enter Price: RM");
            double price = keyboard.nextDouble();
            keyboard.nextLine();

            Product p = new Product(type, color, size, price);
            prodQueue.enqueue(p);
        }

        // (b)  Copy all products from prodQueue and store them into THREE (3) different queues (shortSleeve, shortPants and booties).
        // **All products in the prodQueue must remain in the original order.

        Queue shortSleeve = new Queue();
        Queue shortPants = new Queue();
        Queue booties = new Queue();
        
        while (!prodQueue.isEmpty()) {
            Product p1 = (Product) prodQueue.dequeue();

            if (p1.getType().equalsIgnoreCase("shortSleeve")) {
                shortSleeve.enqueue(p1);
            } else if (p1.getType().equalsIgnoreCase("shortPants")) {
                shortSleeve.enqueue(p1);
            } else {
                booties.enqueue(p1);
            }

            tempQueue.enqueue(p1);
        }

        while (!tempQueue.isEmpty()) {
            prodQueue.enqueue(tempQueue.dequeue());
        }

        // (c) Calculate and display the total price of all products from each queue.
        double totalShortSleeve = 0.00;
        double totalShortPants = 0.00;
        double totalBooties = 0.00;

        while (!shortSleeve.isEmpty()) {
            Product p = (Product) shortSleeve.dequeue();
            totalShortSleeve += p.getPrice();
        }

        while (!shortPants.isEmpty()) {
            Product p = (Product) shortPants.dequeue();
            totalShortPants += p.getPrice();
        }

        while (!booties.isEmpty()) {
            Product p = (Product) booties.dequeue();
            totalBooties += p.getPrice();
        }

        System.out.println("\nTotal price of shortSleeve: RM" + totalShortSleeve);
        System.out.println("Total price of shortPants: RM" + totalShortSleeve);
        System.out.println("Total price of booties: RM" + totalBooties);

        // (d) Display all the types and prices of the product of size 'M' and color "blue"
        System.out.println("\n----- All types and prices of product size 'M' and \"blue\" -----");
        while (!prodQueue.isEmpty()) {
            Product p = (Product) prodQueue.dequeue();
            if (p.getSize() == 'M' && p.getColor().equalsIgnoreCase("blue")) {
                p.display();
            }
        }

        keyboard.close();
    }
}
