package ArrayList;

import java.util.LinkedList;

//16. Write a Java program to insert elements into the linked list at the first and last positions.
public class Task16 {
	
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println(" add an element at the end and first the linkedList");
		
		l.addFirst(100);
		l.addLast(200);
		System.out.println(l);
		
		
	

}
}