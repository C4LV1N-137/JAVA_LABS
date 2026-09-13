/*
*CALVIN MOYO
*19001309
*Question 8
*Lab 2
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question8 {
    public static void main(String[] args) {
        String inputFile = "numbers.txt";
        String outputFile = "evenodd.txt";

        // Initialize variables to track the count of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Read the input file and count the even and odd numbers
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                int number = Integer.parseInt(line);
                if (number % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading " + inputFile + ": " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while parsing a number: " + e.getMessage());
            return;
        }

        // Write the even/odd counts to the output file
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("Even count: " + evenCount);
            writer.println("Odd count: " + oddCount);
            System.out.println("Even/odd counts successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + outputFile + ": " + e.getMessage());
        }
    }
}