package com.lab6;

import java.util.Scanner; // Importing the Scanner class for user input

// Custom Exception Class for handling underage scenarios
class UnderAgeException extends Exception {
    public UnderAgeException() {
        super("You are under 18 and not eligible for voting"); // Custom error message for the exception
    }
}

public class Voting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creating a Scanner object to read input from the console

        try {
            System.out.print("Enter your age: "); // Prompting the user to enter their age
            int age = scanner.nextInt(); // Reading the age input

            if (age < 18) { // Checking if the age is less than 18
                throw new UnderAgeException(); // Throwing a custom exception if the user is underage
            } else {
                System.out.println("You are eligible for voting!"); // Printing a message if the user is eligible
            }
        } catch (UnderAgeException e) { // Catching the custom underage exception
            System.out.println(e.getMessage()); // Printing the custom error message
        } catch (Exception e) { // Catching any other exceptions (e.g., non-integer input)
            System.out.println("Please enter a valid age (a number)."); // Printing a message for invalid input
        } finally {
            scanner.close(); // Closing the scanner to free up resources
        }
    }
}
