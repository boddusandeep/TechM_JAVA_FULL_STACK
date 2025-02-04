package ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

//11. Write a Java program to append the specified element to the end of a linked list.
public class Task11 {
	public static void main(String a[]) {
		
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		System.out.println(l);
		
		System.out.println("give the number to be added at the end of the linked List ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		l.addLast(n);
		System.out.println(l);
		
		
		
	}

}
