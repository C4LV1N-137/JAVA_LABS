/*
*CALVIN MOYO
*19001309
*Lab6
*/

public class Question4 {

    // combine() for integer values
    public static int combine(int a, int b) {
        return a + b;
    }

    // combine() for String values
    public static String combine(String first, String second) {
        return first + second;
    }

    // combine() for double values
    public static double combine(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {

        // Java chooses the correct method based on argument types
        System.out.println("Integer result: " + combine(10, 20));

        System.out.println("String result: "
                + combine("Hello ", "Java"));

        System.out.println("Double result: "
                + combine(4.5, 3.2));
    }
}