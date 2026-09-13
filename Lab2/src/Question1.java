/*
*CALVIN MOYO
*19001309
*Question 1
*Lab 2
 */

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user for a numeric score
        System.out.print("Enter a numeric score between 0 and 100: ");
        double score = console.nextDouble();

        // Reject invalid scores
        if (score < 0 || score > 100) {
            System.out.println("Invalid score. Please enter a score between 0 and 100.");
            console.close();
            return; // Exit the program
        }

        String grade;

        // Determine the letter grade
        if (score >= 80) {
            grade = "A";
        } else if (score >= 70) {
            grade = "B";
        } else if (score >= 60) {
            grade = "C";
        } else if (score >= 50) {
            grade = "D";
        } else {
            grade = "F";
        }

        // Display the grade
        System.out.println("The grade for the score " + score + " is: " + grade);
        System.out.println("Letter Grade: " + grade);

        console.close();
    }
}