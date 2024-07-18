package com.lab6;

// Custom exception class for handling odd numbers
class OddNumberException extends Exception {
    public OddNumberException() {
        super("Odd number exception: Number cannot be odd"); // Custom error message for the exception
    }
}

public class NumberCheck {
    public static void main(String[] args) {
        try {
            int number = 1; // Change the number to test different scenarios
            checkEvenNumber(number); // Check if the number is even
            System.out.println(number + " is even."); // This line will execute if the number is even
        } catch (OddNumberException e) {
            System.out.println(e.getMessage()); // Handle the exception and print the custom error message
        }
    }

    // Method to check if a number is even
    public static void checkEvenNumber(int number) throws OddNumberException {
        if (number % 2 != 0) { // Check if the number is odd
            throw new OddNumberException(); // Throw a custom exception if the number is odd
        }
    }
}

