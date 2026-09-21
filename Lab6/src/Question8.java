/*
*CALVIN MOYO
*19001309
*Lab6
*/

class Animal {

    // Method that can be overridden by subclasses
    public void speak() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {

    // Override the speak() method inherited from Animal
    @Override
    public void speak() {
        System.out.println("The cat says meow.");
    }
}

public class Question8 {

    public static void main(String[] args) {

        // Create an Animal object
        Animal animal = new Animal();

        // Create a Cat object
        Cat cat = new Cat();

        // Calls Animal's speak()
        animal.speak();

        // Calls Cat's overridden speak()
        cat.speak();
    }
}