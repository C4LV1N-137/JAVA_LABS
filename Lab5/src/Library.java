/*
*CALVIN  MOYO
*19001309
*LAB 5
*Question 9
*/

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    public void printAllBooks() {
        for (int i =0; i < books.size(); i++) {
            System.out.println(books.get(i).getSummary());
        }
    }
}