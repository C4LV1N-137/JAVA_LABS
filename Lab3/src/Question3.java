/*
*CALVIN MOYO
*19001309
*LAB 3
*/

public class Question3 {
    public static void main(String[] args) {
        int number = 1;

        // Print all even numbers from 1 to 50
        while (number <= 50) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
            // Increment the number for the next iteration
            number++;
        }
    }
}
