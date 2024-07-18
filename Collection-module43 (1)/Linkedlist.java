//Write a Java program to get the first and last occurrence of the specified elements in a linked list
package Anudipjavalab;
import java.util.LinkedList;
import java.util.Iterator;
public class Linkedlist {
	public static void main(String[] args) {
	    // create an empty linked list
	     LinkedList<String> l_list = new LinkedList<String>();
	   // use add() method to add values in the linked list
	          l_list.add("Tomato");
	          l_list.add("Potato");
	          l_list.add("Cabbage");
	          l_list.add("Cauliflower");
	          l_list.add("Pumpkin");
	      
	      // print original list
	   System.out.println("Original linked list:" + l_list);  
	 
	   // Find first element of the List
	    Object first_element = l_list.getFirst();
	    System.out.println("First Element is: "+first_element);
	 
	    // Find last element of the List
	    Object last_element = l_list.getLast();
	    System.out.println("Last Element is: "+last_element);
	 }
	}

/*Dry run
Original linked list:[Tomato, Potato, Cabbage, Cauliflower, Pumpkin]
First Element is: Tomato
Last Element is: Pumpkin
/*
