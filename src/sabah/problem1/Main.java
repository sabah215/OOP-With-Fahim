package sabah.problem1;

public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("kids","Roald Dahl",
                "Charlie and the Chocolate Factory","pub1",15,20,1);
        Book b2 = new Book("kids","E.B. White",
                "Charlotte's Web","pub2",12,15,2);
        Book b3 = new Book("engineering","Mark Holtzapple",
                "Foundations of Engineering","pub3",30,18,3);
        Book b4 = new Book("engineering","M Holtz",
                "Book 3","pub3",35,20,4);

        BookStore store = new BookStore();
        System.out.println(store.addBooks(b1));
        System.out.println(store.addBooks(b2));
        System.out.println(store.addBooks(b3));
        System.out.println(store.addBooks(b4));

//        store.sell();
        store.sell(b4);
        System.out.println(store.trackSalesStatus());

    }
}
