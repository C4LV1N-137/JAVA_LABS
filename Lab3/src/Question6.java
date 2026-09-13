/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;
        int total = 0;

        // Prompt the user to enter numbers and calculate the total until they enter 0
        do {
            System.out.println("Enter a number (0 to stop): ");
            number = console.nextInt();
            total += number;

            // Display the current total after each entry
        } while (number != 0);

        // Display the final total after the loop ends
        System.out.println("Final total: " + total);

        console.close();
        }
    }
    
