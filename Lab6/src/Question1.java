/*
*CALVIN MOYO
*19001309
*Lab6
*/

public class Question1 {

    // Method that checks whether a number is even
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {

        // Call the method with different values
        System.out.println("Is 4 even? " + isEven(4));
        System.out.println("Is 7 even? " + isEven(7));
        System.out.println("Is 10 even? " + isEven(10));
    }
}