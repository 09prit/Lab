// Abstract class representing a generic shape
abstract class Shape {
    // Abstract methods to calculate area and perimeter
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

// Class representing a Circle, extending the Shape class
class Circle extends Shape {
    private double radius;

    // Constructor to initialize radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Implement the calculateArea method for Circle
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implement the calculatePerimeter method for Circle
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Class representing a Triangle, extending the Shape class
class Triangle extends Shape {
    private double base;
    private double height;

    // Constructor to initialize base and height
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Implement the calculateArea method for Triangle
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    // Implement the calculatePerimeter method for Triangle
    @Override
    double calculatePerimeter() {
        double hypo = Math.sqrt((base * base) + (height * height)); // Calculate the hypotenuse
        return base + height + hypo;
    }
}

// Main class to test the Shape, Circle, and Triangle classes
public class ShapeAbstract {
    public static void main(String[] args) {
        // Create instances of Circle and Triangle
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(3, 4);

        // Print the area and perimeter of the Circle
        System.out.println("Circle area: " + circle.calculateArea());
        System.out.println("Circle perimeter: " + circle.calculatePerimeter());

        // Print the area and perimeter of the Triangle
        System.out.println("Triangle area: " + triangle.calculateArea());
        System.out.println("Triangle perimeter: " + triangle.calculatePerimeter());
    }
}

output:

Circle area: 78.53981633974483
Circle perimeter: 31.41592653589793
Triangle area: 6.0S
Triangle perimeter: 12.0
