/*
*CALVIN MOYO
*19001309
*Lab6
*/

class Calculator {

    // Private instance variable
    private int callCount = 0;

    // Static method
    public static int add(int a, int b) {
        return a + b;
    }

    // Instance method
    public int multiply(int a, int b) {

        // Increase the counter whenever multiply() is called
        callCount++;

        return a * b;
    }

    // Method for checking the number of calls
    public int getCallCount() {
        return callCount;
    }
}

public class Question6 {

    public static void main(String[] args) {

        // Static method called using the class name
        int sum = Calculator.add(10, 5);

        System.out.println("Addition: " + sum);

        // Create a Calculator object
        Calculator calculator = new Calculator();

        // Instance methods are called using the object
        System.out.println("Multiplication: "
                + calculator.multiply(4, 5));

        System.out.println("Multiplication: "
                + calculator.multiply(3, 6));

        // Display how many times multiply() was called
        System.out.println("multiply() call count: "
                + calculator.getCallCount());
    }
}