/*
*CALVIN MOYO
*19001309
*Question 6
*Lab 2
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user for a number representing a day of the week
        System.out.print("Enter a number from 1 to 7 representing a day of the week: ");
        int day = console.nextInt();

        // Use a switch statement to determine the day of the week
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

            default:// Handle invalid input
                System.out.println("Invalid input: please enter a number between 1 and 7.");
        }

        // Close the scanner to prevent resource leaks
        console.close();
    }
}