/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Continue");
            System.out.println("2. Exit");
            System.out.println("Enter your choice: ");
            choice = console.nextInt();

        } while (choice != 2);

        System.out.println("Goodbye!");

        console.close();
    }
    
}
