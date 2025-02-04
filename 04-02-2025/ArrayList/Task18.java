package ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

//18. Write a Java program to insert the specified element at the end of a linked list.
public class Task18 {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println("give the  element to be added at the last of ll");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		l.addLast(n);
		
		System.out.println(l);
		
		
		
		
	}
}
