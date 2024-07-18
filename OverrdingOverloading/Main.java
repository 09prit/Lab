// Employee class representing a generic employee
class Employee 
{
	String name;
	int baseSalary;

	// Constructor to initialize name and baseSalary
	public Employee(String name, int baseSalary) 
	{
		this.name = name;
		this.baseSalary = baseSalary;
	}

	// Method to calculate salary
	public int calculateSalary() 
	{
		return baseSalary;
	}
}

// Manager class representing a manager, extends Employee
class Manager extends Employee 
{
	int bonus;

	// Constructor to initialize name, baseSalary, and bonus
	public Manager(String name, int baseSalary, int bonus) 
	{
		super(name, baseSalary);
		this.bonus = bonus;
	}

	// Override calculateSalary method to include bonus
	@Override
 	public int calculateSalary() 
	{
		return baseSalary + bonus;
	}
}

// Programmer class representing a programmer, extends Employee
class Programmer extends Employee 
{
	int linesOfCode;

	// Constructor to initialize name, baseSalary, and linesOfCode
	public Programmer(String name, int baseSalary, int linesOfCode) 
	{
		super(name, baseSalary);
		this.linesOfCode = linesOfCode;
	}

	// Override calculateSalary method to include linesOfCode
	@Override
	public int calculateSalary() 
	{
		return baseSalary + (linesOfCode * 2);
	}
}

// Main class to test the Employee, Manager, and Programmer classes
public class Main 
{
	public static void main(String[] args) 	
	{
		// Create instances of Manager and Programmer
		Manager manager = new Manager("Priti Dannak", 50000, 10000);
		Programmer programmer = new Programmer("Narendra Modi", 60000, 2000);

		// Print salaries of Manager and Programmer
		System.out.println("Manager's Salary: " + manager.calculateSalary());
		System.out.println("Programmer's Salary: " + programmer.calculateSalary());
	}
}

output:

Manager's Salary: 60000
Programmer's Salary: 64000



