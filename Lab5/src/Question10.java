/*
*CALVIN  MOYO
*19001309
*LAB 5
*Question 10
*/

public class Question10 {
    public static void main(String[] args) {
    //Create a Library Object
        Library library = new Library();


    //Add all four books to the Library object
        library.addBook(new Book("Tlogatloga", "W.W Cassim", 320.99));
        library.addBook(new Book("Motswasele", "L.D Raditladi", 200.00));
        library.addBook(new Book("Mahube 2", "Amina Makhwa", 168.00));


    //Display all books currently stored in the library
        library.printAllBooks();
    }
}