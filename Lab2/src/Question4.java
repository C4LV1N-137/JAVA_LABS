/*
*CALVIN MOYO
*19001309
*Question 4
*Lab 2
 */


import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Question4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String[] names = new String[5];
        int[] scores = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter name for student " + (i + 1) + ": ");
            names[i] = console.nextLine();

            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = Integer.parseInt(console.nextLine().trim());
        }

        String fileName = "results.txt";

        try (PrintWriter writer = new PrintWriter(new FileWriter(fileName))) {
            for (int i = 0; i < 5; i++) {
                writer.println(names[i] + "," + scores[i]);
            }
            System.out.println("Results successfully written to " + fileName);
        } catch (IOException e) {
            System.out.println("An error occurred while writing to " + fileName + ": " + e.getMessage());
        }

        console.close();
    }
}