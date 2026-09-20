/*
*CALVIN  MOYO
*19001309
*LAB 5
*Question3
*/

//Q3. Creating Objects

public class Question3 {
    public static void main(String[] args) {

        //Creating Book objects
        Book book1 = new Book("Let It Happen", "Keiko O'Leary", 120.50);
        Book book2 = new Book("Mr Robot", "Calvin Moyo", 375.00);
    
        //Display Details of the first Book
        System.out.println("Book 1");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println("Price: " + book1.getPrice());

        System.out.println(); //Blank line to separate the two Books

        //Displaying details of the second Book
        System.out.println("Book 2");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println("Price: " + book2.getPrice());

    }
}