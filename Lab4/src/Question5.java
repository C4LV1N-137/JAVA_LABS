/*
*Calvin Moyo
*19001309
*Lab 4
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user for a word or phrase
        System.out.println("Enter a Word or Phrase: ");
        String input = console.nextLine();

        // Clean the input by removing spaces and converting to lowercase
        String cleaned = input.toLowerCase().replaceAll("\\s+", "");
        String reversed = new StringBuilder(cleaned).reverse().toString(); // Reverse the cleaned string

        // Check if the cleaned string is equal to its reverse
        boolean isPalindrome = cleaned.equals(reversed);

        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        console.close();
        }
    }
    

