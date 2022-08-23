package sabah.problem1;

public class Book {
    private String category;
    private String author;
    private String title;
    private String publisher;
    private double price;
    private int quantity;
    private int bookId;

    public Book(String category,String author,String title,String publisher,
                double price, int quantity, int bookId){
        this.category =category;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.price = price;
        this.quantity = quantity;
        this.bookId = bookId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
