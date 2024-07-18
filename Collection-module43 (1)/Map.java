//Write a Java program to count the number of key-value (size) mappings in a map
package Anudipjavalab;
import java.util.*; 

public class Map {
    public static void main(String args[]) {  
        // Create a HashMap with Integer keys and String values
        HashMap<Integer,String> hash_map = new HashMap<Integer,String>();  

        // Add key-value pairs to the HashMap using put() method
        hash_map.put(1, "Red");
        hash_map.put(2, "Green");
        hash_map.put(3, "Black");
        hash_map.put(4, "White");
        hash_map.put(5, "Blue");

        // Print the size of the hash map using size() method
        System.out.println("Size of the hash map: " + hash_map.size());
    }
}

/*Dry run
Size of the hash map: 5
/*

