package ArrayList;
//17. Write a Java program to insert the specified element at the front of a linked list.
import java.util.LinkedList;
import java.util.Scanner;

public class Task17 {
	public static void main(String args[]) {
		LinkedList l=new LinkedList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("give the element to add at the first of the linkedList");
		int n=sc.nextInt();
		l.addFirst(n);
		
		System.out.println(l);
		
		
		
	}

}
