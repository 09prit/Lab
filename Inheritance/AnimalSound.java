package lab3;

// Base class representing a generic Animal
class Animal {
    // Method to simulate making a sound
    void makeSound() {
        System.out.println("Making a sound");
    }
}

// Derived class representing a Cat, extends Animal
class Cat extends Animal {
    // Overridden method to simulate the sound a cat makes
    @Override
    void makeSound() {
        System.out.println("Cat be like: Meow Meow..!!");
    }
}

// Main class to test the Animal and Cat classes
public class AnimalSound {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a new Animal object and call its makeSound method
        Animal a = new Animal();
        a.makeSound();  // Output: Making a sound

        // Create a new Cat object and call its makeSound method
        Cat c = new Cat();
        c.makeSound();  // Output: Cat be like: Meow Meow..!!
    }
}

output:

Making a sound
Cat be like: Meow Meow..!!

