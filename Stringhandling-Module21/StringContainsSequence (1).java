public class StringContainsSequence {
    public static void main(String[] args) {
        // Define the input string
        String inputString = "Hello world";
        
        // Define the sequence to check
        String sequence = "lo";
        
        // Check if inputString contains sequence
        boolean containsSequence = inputString.contains(sequence);
        
        // Output the result
        if (containsSequence) {
            System.out.println("The string contains the sequence '" + sequence + "'.");
        } else {
            System.out.println("The string does not contain the sequence '" + sequence + "'.");
        }
    }
}

output:

The string contains the sequence 'lo'.

