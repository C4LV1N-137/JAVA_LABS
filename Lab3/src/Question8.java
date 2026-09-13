/*
*CALVIN MOYO
*19001309
*LAB 3
*/

import java.util.Scanner;

public class Question8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user to enter a word or sentence
        System.out.print("Enter a word or sentence: ");
        String input = console.nextLine();

        // Convert the input to lowercase to make the vowel counting case-insensitive
        String lowerInput = input.toLowerCase();
        int vowelCount = 0;

        // Iterate through each character in the input string
        for (int i = 0; i < lowerInput.length(); i++) {
            char currentChar = lowerInput.charAt(i);

            // Check if the current character is a vowel
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        // Display the number of vowels in the input
        System.out.println("Numbber of Vowels: " + vowelCount);

        console.close();
    }
    
}
