// Shape1 class representing a generic shape
class Shape1
{
	// Method to draw the shape
	void draw()
	{
		System.out.println("This is Shape Class");
	}
	
	// Method to calculate the area of the shape (default implementation returns 0)
	double calculateArea()
	{
		return 0;
	}
}

// Circle1 class representing a circle, extends Shape1
class Circle1 extends Shape1
{
	double radius;

	// Constructor to initialize the radius
	Circle1(double radius) 
	{
		this.radius = radius;
	}

	// Override draw method to specify drawing a circle
	void draw() 
	{
		System.out.println("Drawing Circle");
	}
	
	// Override calculateArea method to calculate the area of the circle
	double calculateArea()
	{
		return Math.PI * radius * radius;
	}
}

// Square class representing a square, extends Shape1
class Square extends Shape1
{
	double side;
	
	// Constructor to initialize the side
	Square(double side)
	{
		this.side = side;
	}

	// Override draw method to specify drawing a square
	void draw() 
	{
		System.out.println("Drawing Square");
	}
	
	// Override calculateArea method to calculate the area of the square
	double calculateArea() 
	{
		return side * side;
	}
}

// Triangle class representing a triangle, extends Shape1
class Triangle extends Shape1
{
	double base;
	double height;

	// Constructor to initialize the base and height
	Triangle(double base, double height)
	{
		this.base = base;
		this.height = height;
	}

	// Override draw method to specify drawing a triangle
	void draw()
	{
		System.out.println("Drawing Triangle");
	}

	// Override calculateArea method to calculate the area of the triangle
	double calculateArea() 
	{
		return 0.5 * base * height;
	}	
}

// Main class to test the Shape1, Circle1, Square, and Triangle classes
public class ShapeMain 
{
	public static void main(String[] args) 
	{
		// Create instances of Circle1, Square, and Triangle
		Circle1 circle = new Circle1(5);
		Square square = new Square(4);
		Triangle triangle = new Triangle(3, 6);

		// Draw each shape and print its area
		circle.draw();
		System.out.println("Area of Circle: " + circle.calculateArea());

		square.draw();
		System.out.println("Area of Square: " + square.calculateArea());

		triangle.draw();
		System.out.println("Area of Triangle: " + triangle.calculateArea());
	}
}

output:

Drawing Circle
Area of Circle: 78.53981633974483
Drawing Square
Area of Square: 16.0
Drawing Triangle
Area of Triangle: 9.0
