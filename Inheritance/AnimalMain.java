package lab3;

// Define a base class named 'wildAnimal'
class wildAnimal {
    
    // Method to simulate the movement of the animal
    void move() {
        System.out.println("Running");
    }
}

// Define a subclass named 'Cheetah' that extends 'wildAnimal'
class Cheetah extends wildAnimal {
    
    // Override the 'move' method to provide specific behavior for a cheetah
    void move() {
        System.out.println("Running through a hell...!!");
    }
}

// Main class to test the 'wildAnimal' and 'Cheetah' classes
public class AnimalMain {

    // Main method to execute the program
    public static void main(String[] args) {
        
        // Create an instance of 'wildAnimal' and call its 'move' method
        wildAnimal a = new wildAnimal();
        a.move();  // Output: Running
        
        // Create an instance of 'Cheetah' and call its 'move' method
        Cheetah c = new Cheetah();
        c.move();  // Output: Running through a hell...!!
    }
}

Dry run output:

Running
Running through a hell...!!

