public class Product {
    protected String id;
    protected String title;

    public Product() {
        id = "";
        title = "";
    }

    public Product(String id, String title) {
        this.id = id;
        this.title = title;
    }

    public Product(Product other) {
        id = other.id;
        title = other.title;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "ID: " + id +
               "\nTitle: " + title;
    }
}
