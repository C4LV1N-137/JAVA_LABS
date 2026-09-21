/*
*CALVIN MOYO
*19001309
*Lab6
*/

public class Question2 {

    // Calculates and returns the area of a circle
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        // Call the method using two different radius values
        double area1 = circleArea(5.0);
        double area2 = circleArea(10.0);

        System.out.println("Area with radius 5 = " + area1);
        System.out.println("Area with radius 10 = " + area2);
    }
}