/*
*CALVIN MOYO
*19001309
*Lab6
*/

import java.util.Scanner;

public class Rectangle {

    // Calculate and return the area
    public static double area(double length, double width) {
        return length * width;
    }

    // Calculate and return the perimeter
    public static double perimeter(double length, double width) {
        return 2 * (length + width);
    }

    public static void main(String[] args) {

        // Scanner reads keyboard input
        Scanner input = new Scanner(System.in);

        // Ask user for rectangle dimensions
        System.out.print("Enter length: ");
        double length = input.nextDouble();

        System.out.print("Enter width: ");
        double width = input.nextDouble();

        // Call the methods and display their returned results
        System.out.println("Area: " + area(length, width));
        System.out.println("Perimeter: "
                + perimeter(length, width));

        // Close Scanner when finished
        input.close();
    }
}