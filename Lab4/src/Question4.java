/*
*Calvin Moyo
*19001309
*Lab 4
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user for a whole number
        System.out.println("Enter a Whole Number: ");
        int number = console.nextInt();
         
        // Store the original number for display purposes
        int original = number;
        StringBuilder binary = new StringBuilder();

        // Handling the special case for 0
        if (number == 0) {
            binary.append("0");
        } else {
            //Repeatedly divide by 2, collecting remainders from right to left
            while (number > 0) {
                int remainder = number % 2;
                binary.insert(0, remainder);
                number = number / 2;
            }
        }

        System.out.println("The binary representation of " + original + " is " + binary + ".");

        console.close();
        }

    }
    

