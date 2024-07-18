package lab3;

// Base class representing a generic Vehicle
class Vehicle {
    // Method to simulate driving the vehicle
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Derived class representing a Car, extends Vehicle
class Car extends Vehicle {
    // Overridden method to simulate repairing the car
    @Override
    void drive() {
        System.out.println("Repairing a car");
    }
}

// Main class to test the Vehicle and Car classes
public class VehicleMain {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a new Vehicle object and call its drive method
        Vehicle v = new Vehicle();
        v.drive();  // Output: Driving a vehicle

        // Create a new Car object and call its drive method
        Car c = new Car();
        c.drive();  // Output: Repairing a car
    }
}

output:

Driving a vehicle
Repairing a car

