/*
*CALVIN  MOYO
*19001309
*LAB 5
*Question 6
*/

public class Question6 {
    public static void main(String[] args){
        Book[] books = new Book[3];

    //Creating book objects and storing them in the array
        books[0] = new Book("Attitude is Everything", "Jeff Keller", 350.99);
        books[1] = new Book("The Law Of Success", "Napoleon Hill", 200.00);
        books[2] = new Book("Boundaries", "Dr.Henry Cloud", 150.00);
    
//Looping throught the array
for (int i = 0; i < books.length; i++) {
    System.out.println(books[i].getSummary());

}
}
}

