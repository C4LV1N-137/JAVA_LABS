/*
 *Calvin Moyo
 *19001309
 *Question 6
 */

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Scanner to read several values from one line

        System.out.print("Enter three scores: ");
        double score1 = sc.nextDouble();
        double score2 = sc.nextDouble();
        double score3 = sc.nextDouble();

        //Using double division to keep decimal places rather than truncating

        double average = (score1 + score2 + score3) / 3.0;

        System.out.println("The average score is: " + average);

        sc.close();
    }
}
