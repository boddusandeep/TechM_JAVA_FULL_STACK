package ArrayList;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

//14. Write a Java program to iterate a linked list in reverse order.
public class Task14 {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println(" itration through the linkedList in reverse order.");
		 
		 int n=l.size()-1;
		ListIterator<Integer> iterator = l.listIterator(n);
	        
	        // Iterate through the list from the specified position
	        while (iterator.hasPrevious()) {
	            System.out.println(iterator.previous());
	        }
		
		
		
		
	}

}
