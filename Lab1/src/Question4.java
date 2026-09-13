/*
 *Calvin Moyo
 *19001309
 *Question 4
 */

import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompt user for input
        System.out.print("Enter a whole number: ");
        int wholeNumber = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double decimalNumber = sc.nextDouble();

        //next() reads a single word up to the next whitespace,
        //while nextLine() reads the entire line including spaces

        System.out.print("Enter a single word: ");
        String word = sc.next();

        System.out.println("You entered " + wholeNumber + "," + decimalNumber + ", and " + word + ".");
        
        sc.close();
    

    }
}
