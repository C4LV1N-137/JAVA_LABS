/*
*CALVIN MOYO
*19001309
*Question 10
*Lab 2
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String inputFile = "numbers.txt";

        // Prompt the user for a number to search for
        System.out.print("Enter a number to search for: ");
        int target = console.nextInt();

        // Initialize a boolean variable to track if the number is found
        boolean found = false;

        // Read the input file and search for the target number
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                int number = Integer.parseInt(line);
                if (number == target) {
                    found = true;
                    break;
                }
            }
            // Catch any exceptions that may occur during file reading or number parsing
        } catch (IOException e) {
            System.out.println("An error occurred while reading " + inputFile + ": " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while parsing a number: " + e.getMessage());
        }

        // Print the result of the search
        System.out.println(found);// Print true if the number is found, false otherwise

        console.close();// Close the scanner
    }
}