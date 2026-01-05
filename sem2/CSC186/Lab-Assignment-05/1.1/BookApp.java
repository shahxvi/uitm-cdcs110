import java.util.Scanner;

public class BookApp {
    public static void main (String[] args) {
        int bookSize = 0;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter the amount of books: ");
        bookSize = keyboard.nextInt();
        keyboard.nextLine();

        Book[] books = new Book[bookSize];

        for (int i = 0; i < books.length; i++) {
            System.out.print("\nPlease enter book #" + (i+1) + " id: ");
            String id = keyboard.nextLine();

            System.out.print("Please enter book #" + (i+1) + " title: ");
            String title = keyboard.nextLine();

            System.out.print("Please enter book #" + (i+1) + " author: ");
            String author = keyboard.nextLine();

            System.out.print("Please enter book #" + (i+1) + " number of pages: ");
            int numPages = keyboard.nextInt();
            keyboard.nextLine();

            books[i] = new Book(id, title, author, numPages);
        }

        // Display all the object’s information, including the cost
        for (Book b : books) {
            System.out.println(); // newline
            System.out.println(b.toString());
        }
        System.out.println(); // newline

        // Total cost of books
        double totalCost = 0.00;
        for (Book b : books) {
            totalCost += b.calcPrice();
        }
        System.out.println("Total cost of books: " + totalCost);

        // Display the highest cost of book
        double highestCost = -999.99;
        for (Book b : books) {
            if (b.calcPrice() > highestCost)
                highestCost = b.calcPrice();
        }
        System.out.println("Highest cost of book: RM" + highestCost);

        // Display the lowest cost of book
        double lowestCost = 9999.99;
        for (Book b : books) {
            if (b.calcPrice() < lowestCost)
                lowestCost = b.calcPrice();
        }
        System.out.println("Lowest cost of book: RM" + lowestCost);

        // Number of books with the minimum of pages is more than 500
        int bookPagesMoreThan500 = 0;
        for (Book b : books) {
            if (b.getNumPages() > 500)
                bookPagesMoreThan500++;
        }
        System.out.println("Number of books with the minimum of pages is more than 500: " + bookPagesMoreThan500);
    }
}
