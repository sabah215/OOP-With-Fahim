package sabah.problem1;

import java.util.ArrayList;

public class BookStore {
    private static int numOfSales = 0;
    private int storeId = 1;
    private ArrayList<Book> books = new ArrayList<>();


    public BookStore(){
        books = new ArrayList<>();
    }
    public int trackSalesStatus(){
        return numOfSales;
    }
    public void sell(Book b){
        if(books.contains(b)){
            int quantity = b.getQuantity();
            numOfSales++;
            b.setQuantity(--quantity);
        }
        else System.out.println("Book not found");
    }
    public String addBooks(Book b){
        books.add(b);
        return "Added "+b.getTitle();
    }
}
