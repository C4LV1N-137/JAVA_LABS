/*
*CALVIN  MOYO
*19001309
*LAB 5
*Question 8
*/

public class Question8 {
//Method that receives 2 book objects and returns one with lower price
    public static Book cheaperBook(Book a, Book b) {
        if (a.getPrice() < b.getPrice()) { //Comparing Book Prices
            
        //Return first book if it is cheaper
            return a;
        } else {

        //Otherwise return the second book
            return b;
        }
    }

public static void main(String[] args) {
     Book book1 = new Book("Let It Happen", "Keiko O'Leary", 120.50);
     Book book2 = new Book("Mr Robot", "Calvin Moyo", 375.00);

     Book cheaper = cheaperBook(book1, book2);

     System.out.println("The cheaper book is: " + cheaper.getSummary());
}
}