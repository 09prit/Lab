package com.lab6;

import java.util.InputMismatchException; // Importing the InputMismatchException class
import java.util.Scanner; // Importing the Scanner class

public class InputInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the console

        try {
            System.out.print("Enter an integer: "); // Prompting the user to enter an integer
            int number = scanner.nextInt(); // Reading the next integer input from the user
            System.out.println("You entered: " + number); // Printing the entered integer
        } catch (InputMismatchException e) { // Catching an InputMismatchException if the user enters a non-integer
            System.out.println("Input mismatch: Please enter an integer."); // Printing an error message
            // Clearing the input buffer to avoid infinite loop
            scanner.next(); // Consuming the invalid input to clear the buffer
        } finally {
            scanner.close(); // Closing the scanner object to free up resources
        }
    }
}

output :

scenario 1: user enters a valid integer

Enter an integer: 42
You entered: 42

scenario 2: user enters an invalid input

Enter an integer: abc
Input mismatch: Please enter an integer.



