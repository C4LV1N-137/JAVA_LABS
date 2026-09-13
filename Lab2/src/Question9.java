/*
*CALVIN MOYO
*19001309
*Question 9
*Lab 2
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question9 {
    public static void main(String[] args) {
        String inputFile = "numbers.txt";
        String outputFile = "signs.txt";

        // Initialize variables to track the total and count of positive and negative numbers
        long positiveTotal = 0;
        long negativeTotal = 0;
        int positiveCount = 0;
        int negativeCount = 0;

        // Read the input file and calculate the total and count of positive and negative numbers
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                int number = Integer.parseInt(line);
                if (number > 0) {
                    positiveTotal += number;
                    positiveCount++;
                } else if (number < 0) {
                    negativeTotal += number;
                    negativeCount++;
                }
                // numbers equal to 0 are neither positive nor negative, so they are skipped
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading " + inputFile + ": " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while parsing a number: " + e.getMessage());
            return;
        }

        // Write the positive and negative totals to the output file
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("Positive total: " + positiveTotal + " (" + positiveCount + " numbers)");
            writer.println("Negative total: " + negativeTotal + " (" + negativeCount + " numbers)");
            System.out.println("Sign totals successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + outputFile + ": " + e.getMessage());
        }
    }
}