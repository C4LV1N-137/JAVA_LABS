/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number: ");
        int number = console.nextInt();

        // Display the multiplication table for the entered number
        for (int i = 1; i <= 12; i++) {
            System.out.println(number + "x" + i + "=" + (number * i));
        }

        // Close the scanner
        console.close();
    }
}
