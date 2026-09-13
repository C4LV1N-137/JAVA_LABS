/*
*CALVIN MOYO
*19001309
*Question 5
*Lab 2
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question5 {
    public static void main(String[] args) {
        String inputFile = "students.txt";
        String outputFile = "grades.txt";

        // Read the input file, calculate grades, and write to the output file
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {

            // Write the header to the output file
                String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    double score = Double.parseDouble(parts[1].trim());
                    String grade = getGrade(score);
                    writer.println(name + "," + (int) score + "," + grade);
                }
            }

            // Inform the user that the grade report has been successfully written
            System.out.println("Grade report successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred with file input/output: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while parsing a score: " + e.getMessage());
        }
    }

    // Method to determine the letter grade based on the numeric score
    private static String getGrade(double score) {
        if (score >= 80) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 60) {
            return "C";
        } else if (score >= 50) {
            return "D";
        } else {
            return "F";
        }
    }
}