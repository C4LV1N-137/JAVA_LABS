/*
*CALVIN MOYO
*19001309
*Question 3
*Lab 2
 */

// This program reads a text file named "students.txt" and displays the names and scores of students.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {
        String fileName = "students.txt";

        // Read the file and display the names and scores
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.trim().isEmpty()) {
                    continue;
                }
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String name = parts[0].trim();
                    String score = parts[1].trim();
                    System.out.println("Name: " + name + " | Score: " + score);
                } else {
                    System.out.println("Skipping malformed line: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading " + fileName + ": " + e.getMessage());
        }
    }
}