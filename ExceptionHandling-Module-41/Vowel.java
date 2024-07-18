package com.lab6;

// Custom Exception Class for handling cases where no vowels are found in a string
class NoVowelsException extends Exception {
    public NoVowelsException(String message) {
        super(message); // Call the constructor of the Exception class with the custom message
    }
}

public class Vowel {

    // Method to check if a string contains any vowels
    public static void checkForVowels(String str) throws NoVowelsException {
        boolean foundVowel = false; // Flag to track if a vowel is found
        for (char ch : str.toCharArray()) { // Loop through each character in the string
            if ("aeiouAEIOU".indexOf(ch) != -1) { // Check if the character is a vowel
                foundVowel = true; // Set the flag to true if a vowel is found
                break; // Exit the loop as we found at least one vowel
            }
        }
        if (!foundVowel) { // If no vowels were found
            throw new NoVowelsException("No vowels found in the string!"); // Throw a custom exception
        }
    }

    public static void main(String[] args) {
        String testString1 = "Priti"; // Change the string to test different scenarios

        try {
            checkForVowels(testString1); // Check if the string contains vowels
            System.out.println("String contains vowels!"); // This line will execute if vowels are found
        } catch (NoVowelsException e) {
            System.out.println(e.getMessage()); // Handle the exception and print the custom error message
        }
    }
}
