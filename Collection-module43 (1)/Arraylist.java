//Write a Java program to sort a given array list.
package Anudipjavalab;
import java.util.*;

public class Arraylist {

    public static void main(String[] args) {
        // Create an ArrayList to store strings
        List<String> list_Strings = new ArrayList<String>();

        // Add some colors to the ArrayList
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        // Print the ArrayList before sorting
        System.out.println("List before sort: " + list_Strings);

        // Sort the ArrayList using Collections.sort() method
        Collections.sort(list_Strings);

        // Print the ArrayList after sorting
        System.out.println("List after sort: " + list_Strings);
    }
}

/*Dry run
List before sort: [Red, Green, Orange, White, Black]
List after sort: [Black, Green, Orange, Red, White]
/*


