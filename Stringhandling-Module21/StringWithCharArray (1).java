public class StringWithCharArray {
    public static void main(String[] args) {
        // Character array
        char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
        
        // Creating a String object from the character array
        String str = new String(charArray);
        
        // Displaying the string
        System.out.println("String created from character array: " + str);
    }
}

output:

String created from character array: Hello World
