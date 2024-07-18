package lab3;

// Base class representing a generic Shape
class Shape {
    // Method to get the area of the shape, default implementation returns 0
    double getArea() {
        return 0;
    }
}

// Derived class representing a Rectangle, extends Shape
class Rectangle extends Shape {
    double length; // Length of the rectangle
    double width;  // Width of the rectangle

    // Constructor to initialize the length and width of the rectangle
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Overridden method to calculate and return the area of the rectangle
    double getArea() {
        return length * width;
    }
}

// Main class to test the Shape and Rectangle classes
public class ShapeMain {
    // Main method to execute the program
    public static void main(String[] args) {
        // Create a new Rectangle object with length 5 and width 10
        Rectangle r = new Rectangle(5, 10);

        // Calculate the area of the rectangle
        double area = r.getArea();

        // Print the area of the rectangle
        System.out.println("Area of Rectangle: " + area); // Output: Area of Rectangle: 50.0
    }
}

output:

Area of Rectangle: 50.0

