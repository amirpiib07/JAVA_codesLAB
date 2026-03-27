package LAB_7;
// Book class
class Book {
    protected int    bookId;
    protected String title;
    protected String author;
    protected double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title  = title;
        this.author = author;
        this.price  = price;
    }

    public void displayBook() {
        System.out.println("Book ID : " + bookId);
        System.out.println("Title   : " + title);
        System.out.println("Author  : " + author);
        System.out.printf ("Price   : $%.2f%n", price);
    }
}

// Periodical extends Book
class Periodical extends Book {
    private String period;  // weekly, monthly, etc.

    public Periodical(int bookId, String title, String author,
                      double price, String period) {
        super(bookId, title, author, price);
        this.period = period;
    }

    // Behavior to modify price and period
    public void modifyPrice(double newPrice) {
        this.price = newPrice;
        System.out.printf("Price updated to: $%.2f%n", newPrice);
    }

    public void modifyPeriod(String newPeriod) {
        this.period = newPeriod;
        System.out.println("Period updated to: " + newPeriod);
    }

    public void displayPeriodical() {
        super.displayBook();
        System.out.println("Period  : " + period);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Periodical p = new Periodical(301, "Tech Weekly", "John Doe",
                5.99, "Weekly");

        System.out.println("--- Before Update ---");
        p.displayPeriodical();

        p.modifyPrice(7.99);
        p.modifyPeriod("Monthly");

        System.out.println("\n--- After Update ---");
        p.displayPeriodical();
    }
}