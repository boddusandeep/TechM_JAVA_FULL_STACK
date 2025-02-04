package ArrayList;
//13. Write a Java program to iterate through all elements in a linked list starting at the specified position.
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Task13 {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println(" give the position to itration through the linkedList at a spcified position");
		
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 
		ListIterator<Integer> iterator = l.listIterator(n);
	        
	        // Iterate through the list from the specified position
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
		
		
	}
}
