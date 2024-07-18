package com.lab6;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Simulate an operation that might throw an exception
            int result = divideByZero(); // This method call will throw an ArithmeticException
            System.out.println("Result: " + result); // This line will not be executed
        } catch (ArithmeticException e) {
            // Catch the exception and handle it
            System.out.println("An arithmetic exception occurred: " + e.getMessage()); // Printing the error message
        }
    }

    public static int divideByZero() {
        // Attempting to divide by zero will throw an ArithmeticException
        return 10 / 0; // This line throws an ArithmeticException
    }
}

output:

An arithmetic exception occurred: / by zero

