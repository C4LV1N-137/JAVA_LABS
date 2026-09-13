/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user to enter a positive whole number
        System.out.println("Enter a positive whole number: ");
        int limit = console.nextInt();

        int sum = 0;
        int current = 1;

        // Calculate the sum of all whole numbers from 1 to the limit
        while (current <= limit) {
            sum += current;
            current++;
        }

        // Display the result
        System.out.println("The sum of all whole numbers from 1 to " + limit + " is " + sum + ".");

        console.close();
    }
    
}
