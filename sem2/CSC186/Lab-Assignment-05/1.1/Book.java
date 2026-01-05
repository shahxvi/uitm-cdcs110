public class Book extends Product {
    private String author;
    private int numPages;

    public Book() {
        super();
        author = "";
        numPages = 0;
    }

    public Book(String id, String title, String author, int numPages) {
        super(id, title);
        this.author = author;
        this.numPages = numPages;
    }

    public Book(Book other) {
        super(other.id, other.title);
        this.author = author;
        this.numPages = numPages;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumPages() {
        return numPages;
    }

    public double calcPrice() {
        double cost = 0.00;
        double discountRate = 0.00;
        cost = (numPages * 0.50);

       if (cost <= 200)
           discountRate = 0.02;
       else if (cost >= 201 && cost <= 500)
           discountRate = 0.05;
       else
           discountRate = 0.10;

       return cost * (1 - discountRate);
    }

    public String toString() {
        String str = super.toString();
        str += String.format("\nNumber Of Pages: %d \nPrice: RM%.2f", numPages, calcPrice());
        return str;
    }

}
