/*
*Calvin Moyo
*19001309
*Lab 4
*/

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Question2 {
    public static void main(String[] args) {
        double[] numbers = {3.5, 7.0, 1.6, 0.7, 3.1, 19.5, 20.6};

        try {
            PrintWriter writer = new PrintWriter(new FileWriter("numbers.txt"));

            // Write each number to the file on a new line
            for (int i = 0; i < numbers.length; i++) {
                writer.println(numbers[i]);
            }

            writer.close();

            System.out.println("Array Values written to numbers.txt");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to numbers.txt.");  

            }
        }
    }

