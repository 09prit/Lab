import java.util.Scanner;

public class StringEndsWith {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the main string
        System.out.print("Enter the string: ");
        String mainString = scanner.nextLine();
        
        // Input the string to check if it's at the end
        System.out.print("Enter the string to check if it's at the end: ");
        String endsWithString = scanner.nextLine();
        
        // Check if the main string ends with the given string
        boolean endsWith = checkEndsWith(mainString, endsWithString);
        
        // Output the result
        if (endsWith) {
            System.out.println("The string ends with " + endsWithString);
        } else {
            System.out.println("The string does not end with " + endsWithString);
        }
        
        scanner.close();
    }
    
    // Method to check if the mainString ends with the endsWithString
    public static boolean checkEndsWith(String mainString, String endsWithString) {
        int mainLength = mainString.length();
        int endsWithLength = endsWithString.length();
        
        // If the endsWithString is longer than the mainString, it can't be at the end
        if (mainLength < endsWithLength) {
            return false;
        }
        
        // Get the substring from the main string that matches the length of the endsWithString
        String endOfMainString = mainString.substring(mainLength - endsWithLength);
        
        // Compare the substring with the endsWithString
        return endOfMainString.equals(endsWithString);
    }
}

output:

Enter the string: Hello, World!
Enter the string to check if it's at the end: World!
The string ends with World!

