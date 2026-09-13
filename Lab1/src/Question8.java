/*
 *Calvin Moyo
 *19001309
 *Question 8
 */

import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of a rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the width of a rectangle: ");
        double width = sc.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width); //parentheses to ensure operations run in order

        System.out.println("The area of the rectangle is: " + area);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        sc.close();

    }
    
}   
