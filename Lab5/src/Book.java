/*19001309
*LAB 5
*Question 1, 2, 4 & 5
*/



//Q1. Creating a class called Book
public class Book { 
    // Fields used to store book information
    private String title;
    private String author;
    private double price;

    // Q2. Constructor used to initialize a new Book object
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Q4. Adding a method that returns all book information as one String
    public String getSummary() {
        return title + " by " + author + " - P" + price;
    }

    // Q5. Encapsulation
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

