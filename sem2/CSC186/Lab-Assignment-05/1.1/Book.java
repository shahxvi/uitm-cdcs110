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

    public 
}
