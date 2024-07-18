package com.lab6;

import java.io.File; // Importing the File class
import java.io.FileNotFoundException; // Importing the FileNotFoundException class
import java.util.Scanner; // Importing the Scanner class

public class FileRead {
    public static void main(String[] args) {
        try {
            readFile("example.txt"); // Change the file name to test different scenarios
        } catch (FileNotFoundException e) { // Catching a FileNotFoundException
            System.out.println("File not found: " + e.getMessage()); // Printing the error message if the file is not found
        }
    }

    public static void readFile(String filename) throws FileNotFoundException {
        File file = new File(filename); // Creating a File object with the specified filename
        if (!file.exists()) { // Checking if the file exists
            throw new FileNotFoundException("File not found: " + filename); // Throwing an exception if the file does not exist
        }

        try {f
            Scanner scanner = new Scanner(file); // Creating a Scanner object to read the file

            // Read file content
            while (scanner.hasNextLine()) { // Looping through each line of the file
                System.out.println(scanner.nextLine()); // Printing each line of the file
            }

            scanner.close(); // Closing the scanner to free up resources
        } catch (FileNotFoundException e) {
            // This catch block is not strictly necessary because we already checked if the file exists
            // It's included here for demonstration purposes
            throw e; // Re-throwing the exception if caught
        }
    }
}

output:

scenario 1 :file exists and contains contents

Hello, world!
This is a test file.

scenario 2:file does not exists

File not found: File not found: example.txt

