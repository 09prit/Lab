package Lab5;

// Import the Scanner class for user input
import java.util.Scanner;

// Abstract class representing a generic Employee
abstract class Employee {
    private String name;  // Employee's name
    private String department;  // Employee's department

    // Constructor to initialize name and department
    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    // Abstract methods to be implemented by subclasses
    public abstract double calculateSalary();
    public abstract void displayInfo();

    // Getters for name and department
    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

// Subclass representing a Manager
class Manager extends Employee {
    private double bonus;  // Bonus for the manager

    // Constructor to initialize name, department, and bonus
    public Manager(String name, String department, double bonus) {
        super(name, department);
        this.bonus = bonus;
    }

    // Implement the calculateSalary method
    @Override
    public double calculateSalary() {
        double baseSalary = 50000;
        return baseSalary + bonus;
    }

    // Implement the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Subclass representing a Programmer
class Programmer extends Employee {
    private int experience;  // Years of experience

    // Constructor to initialize name, department, and experience
    public Programmer(String name, String department, int experience) {
        super(name, department);
        this.experience = experience;
    }

    // Implement the calculateSalary method
    @Override
    public double calculateSalary() {
        double baseSalary = 40000;
        double salaryPerYear = 2000;
        return baseSalary + (salaryPerYear * experience);
    }

    // Implement the displayInfo method
    @Override
    public void displayInfo() {
        System.out.println("Employee Name: " + getName());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: $" + calculateSalary());
    }
}

// Main class to test the Employee, Manager, and Programmer classes
public class Employee1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Manager
        System.out.print("Enter manager name: ");
        String managerName = scanner.nextLine();

        System.out.print("Enter manager department: ");
        String managerDepartment = scanner.nextLine();

        System.out.print("Enter manager bonus: ");
        double managerBonus = scanner.nextDouble();

        scanner.nextLine();  // Consume newline left-over

        // Input for Programmer
        System.out.print("Enter programmer name: ");
        String programmerName = scanner.nextLine();

        System.out.print("Enter programmer department: ");
        String programmerDepartment = scanner.nextLine();

        System.out.print("Enter programmer experience (years): ");
        int programmerExperience = scanner.nextInt();

        // Create instances of Manager and Programmer
        Manager manager = new Manager(managerName, managerDepartment, managerBonus);
        Programmer programmer = new Programmer(programmerName, programmerDepartment, programmerExperience);

        // Display information for both employees
        manager.displayInfo();
        programmer.displayInfo();
    }
}




