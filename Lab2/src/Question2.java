/*
*CALVIN MOYO
*19001309
*Question 2
*Lab 2
 */

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        // Prompt the user for their full name
        System.out.print("Enter your full name: ");
        String fullName = console.nextLine();

        // Calculate the total number of characters, convert to uppercase and lowercase
        int totalCharacters = fullName.length();
        String upperCaseName = fullName.toUpperCase();
        String lowerCaseName = fullName.toLowerCase();

        // Prompt the user for a letter to check if their name starts with it
        System.out.print("Enter a letter to check if your name starts with it: ");
        String letterInput = console.nextLine();

        // Check if the full name starts with the specified letter (case-insensitive)
        boolean startsWithLetter = false;
        if (!letterInput.isEmpty()) {
            char letter = letterInput.charAt(0);
            startsWithLetter = !fullName.isEmpty()
                    && Character.toLowerCase(fullName.charAt(0)) == Character.toLowerCase(letter);
        }

        // Display the results
        System.out.println();
        System.out.println("Full name: " + fullName);
        System.out.println("Total number of characters (including spaces): " + totalCharacters);
        System.out.println("Uppercase: " + upperCaseName);
        System.out.println("Lowercase: " + lowerCaseName);
        System.out.println("Starts with '" + letterInput + "'? " + startsWithLetter);

        console.close();
    }
}