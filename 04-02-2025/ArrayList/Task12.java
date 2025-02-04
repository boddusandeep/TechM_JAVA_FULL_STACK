package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;

public class Task12 {
	//12. Write a Java program to iterate through all elements in a linked list.
	
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println(" itration through the linkedList");
		
		Iterator i=l.iterator();
		
		while(i.hasNext()) {
			Object o=i.next();
			System.out.println(o);
		}
		
		
	}

}
