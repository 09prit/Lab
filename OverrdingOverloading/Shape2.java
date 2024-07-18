// Shape class representing a generic shape
class Shape 
{
    // Method to draw the shape
    void draw()
    {
        System.out.println("Draw Method of Shape class");
    }

    // Method to calculate the area of the shape (default implementation returns 0)
    double calculateArea()
    {
        return 0;
    }
}

// Circle class representing a circle, extends Shape
class Circle extends Shape 
{
    double radius;

    // Constructor to initialize the radius
    public Circle(double radius) 
    {
        this.radius = radius;
    }

    // Override draw method to specify drawing a circle
    @Override
    void draw() 
    {
        System.out.println("Drawing Circle");
    }

    // Override calculateArea method to calculate the area of the circle
    @Override
    double calculateArea() 
    {
        return 3.14 * radius * radius;
    }
}

// Cylinder class representing a cylinder, extends Circle
class Cylinder extends Circle 
{
    double height;

    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height) 
    {
        super(radius);
        this.height = height;
    }

    // Override draw method to specify drawing a cylinder
    @Override
    void draw() 
    {
        System.out.println("Drawing Cylinder");
    }

    // Override calculateArea method to calculate the total surface area of the cylinder
    @Override
    double calculateArea() 
    {
        double circleArea = super.calculateArea(); // Calculate the area of the circular base
        double cylinderArea = 2 * 3.14 * super.radius * height + 2 * circleArea; // Calculate the total surface area
        return cylinderArea;
    }
}

// Main class to test the Shape, Circle, and Cylinder classes
public class Shape2 
{
    public static void main(String[] args) 
    {
        // Create an instance of Circle and calculate its area
        Circle circle = new Circle(5);
        circle.draw(); // Draw the circle
        System.out.println("Area of Circle: " + circle.calculateArea()); // Print the area of the circle

        // Create an instance of Cylinder and calculate its total surface area
        Cylinder cylinder = new Cylinder(3, 7);
        cylinder.draw(); // Draw the cylinder
        System.out.println("Total Surface Area of Cylinder: " + cylinder.calculateArea()); // Print the total surface area of the cylinder
    }
}

output:

Drawing Circle
Area of Circle: 78.5
Drawing Cylinder
Total Surface Area of Cylinder: 263.0
