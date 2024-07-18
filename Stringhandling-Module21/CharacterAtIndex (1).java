import java.util.Scanner;

public class CharacterAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Input the index
        System.out.print("Enter the index: ");
        int index = scanner.nextInt();
        
        // Get the character at the specified index
        char characterAtIndex = getCharacterAtIndex(inputString, index);
        
        // Check if the index is within the range of the string
        if (characterAtIndex == '\0') {
            System.out.println("Index out of range!");
        } else {
            // Output the character at the specified index
            System.out.println("Character at index " + index + ": " + characterAtIndex);
        }
        
        scanner.close();
    }
    
    // Method to get the character at the specified index
    public static char getCharacterAtIndex(String str, int index) {
        if (index >= 0 && index < str.length()) {
            return str.charAt(index);
        } else {
            return '\0'; // Null character indicating index out of range
        }
    }
}

output:

Enter a string: Hello
Enter the index: 2
Character at index 2: l

