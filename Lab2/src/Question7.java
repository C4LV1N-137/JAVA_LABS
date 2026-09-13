

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question7 {
    public static void main(String[] args) {
        String inputFile = "numbers.txt";
        String outputFile = "stats.txt";

        // Initialize variables to track the smallest, largest, sum, and count of numbers
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        long sum = 0;
        int count = 0;

        // Read the input file and calculate the smallest, largest, sum, and count of numbers
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();
                if (line.isEmpty()) {
                    continue;
                }
                int number = Integer.parseInt(line);
                if (number < smallest) {
                    smallest = number;
                }
                if (number > largest) {
                    largest = number;
                }
                sum += number;
                count++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading " + inputFile + ": " + e.getMessage());
            return;
        } catch (NumberFormatException e) {
            System.out.println("An error occurred while parsing a number: " + e.getMessage());
            return;
        }

        if (count == 0) {
            System.out.println("No numbers were found in " + inputFile);
            return;
        }

        double average = (double) sum / count;

        // Write the statistics to the output file
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFile))) {
            writer.println("Smallest: " + smallest);
            writer.println("Largest: " + largest);
            writer.println("Average: " + average);
            System.out.println("Statistics successfully written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + outputFile + ": " + e.getMessage());
        }
    }
}