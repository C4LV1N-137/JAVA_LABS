/*
*CALVIN MOYO
*19001309
*Lab6
*/

class Message {

    // First version of display()
    public void display(String text) {
        System.out.println("Message: " + text);
    }

    // Overloaded version of display()
    public void display(String text, int times) {

        for (int i = 0; i < times; i++) {
            System.out.println("Message: " + text);
        }
    }

    // Method that will be overridden
    public void showType() {
        System.out.println("This is a general message.");
    }
}

class SpecialMessage extends Message {

    // Override the parent's showType() method
    @Override
    public void showType() {
        System.out.println("This is a special message.");
    }
}

public class Question9 {

    public static void main(String[] args) {

        Message message = new Message();

        // Demonstrating overloading
        message.display("Hello");

        message.display("Java", 2);

        SpecialMessage special = new SpecialMessage();

        // Demonstrating overriding
        special.showType();
    }
}