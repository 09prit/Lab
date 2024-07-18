package Lab5;

// Abstract class representing a generic Vehicle
abstract class Vehicle {
    // Abstract methods to start and stop the engine
    abstract void startEngine();
    abstract void stopEngine();
}

// Class representing a Car, extending the Vehicle class
class Car extends Vehicle {
    // Implement the startEngine method
    @Override
    void startEngine() {
        System.out.println("Car: Starts the Engine");
    }

    // Implement the stopEngine method
    @Override
    void stopEngine() {
        System.out.println("Car: Stops the Engine");
    }
}

// Class representing a Motorcycle, extending the Vehicle class
class MotorCycle extends Vehicle {
    // Implement the startEngine method
    @Override
    void startEngine() {
        System.out.println("Motorcycle: Starts the Engine");
    }

    // Implement the stopEngine method
    @Override
    void stopEngine() {
        System.out.println("Motorcycle: Stops the Engine");
    }
}

// Main class to test the Vehicle, Car, and MotorCycle classes
public class Vehicle2 {
    public static void main(String[] args) {
        // Create instances of Car and MotorCycle
        Vehicle car = new Car();
        Vehicle motor = new MotorCycle();
        
        // Start and stop the engine for Car
        car.startEngine();
        car.stopEngine();
        
        // Start and stop the engine for MotorCycle
        motor.startEngine();
        motor.stopEngine();
    }
}

output:

Car: Starts the Engine
Car: Stops the Engine
Motorcycle: Starts the Engine
Motorcycle: Stops the Engine
