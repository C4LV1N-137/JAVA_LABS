/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
    

    System.out.print("Enter a whole number: ");
    int number = console.nextInt();

    //long in case the result is too large for an int
    long factorial = 1;

    // Calculate the factorial of the number
    for (int i = 1; i <= number; i++) {
        factorial *= i;
    }

    // Display the result
    System.out.println("The factorial of " + number + " is " + factorial + ".");

    // Close the scanner
    console.close();
 }
}
    

