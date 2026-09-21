/*
*CALVIN MOYO
*19001309
*Lab6
*/

public class Question3 {

    // Void method prints the banner directly
    public static void printBanner() {
        System.out.println("================ JAVA METHODS ================");
    }

    // Returning method gives the banner back as a String
    public static String getBanner() {
        return "================ JAVA METHODS ================";
    }

    public static void main(String[] args) {

        // Call the void method
        printBanner();

        // Call the returning method and store its result
        String banner = getBanner();

        // Print the returned value
        System.out.println(banner);
    }
}