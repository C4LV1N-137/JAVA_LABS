/*
*CALVIN MOYO
*19001309
*Lab6
*/

public class Question5 {

    // Method that accepts only a name
    public static void displayInfo(String name) {
        System.out.println("Name: " + name);
    }

    // Overloaded method that accepts a name and age
    public static void displayInfo(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        // Calls the first version
        displayInfo("Calvin");

        // Calls the overloaded version
        displayInfo("Calvin", 22);
    }
}