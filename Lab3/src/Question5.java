/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a number between 1 and 10: ");
            number = console.nextInt();

            if (number < 1 || number > 10) {
                System.out.println("Invalid number, please try again.");
            }

        } while (number < 1 || number > 10);

        System.out.println("You entered a valid number: " + number);

        console.close();
        }
    }
