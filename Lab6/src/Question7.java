/*
*CALVIN MOYO
*19001309
*Lab6
*/

public class Question7 {

    // Attempts to double the parameter
    public static void tryToDouble(int number) {

        number = number * 2;

        System.out.println("Inside method: " + number);
    }

    public static void main(String[] args) {

        int value = 10;

        System.out.println("Before method: " + value);

        // A copy of value is passed to the method
        tryToDouble(value);

        // Original value remains unchanged
        System.out.println("After method: " + value);
    }
}