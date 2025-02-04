package ArrayList;

import java.util.LinkedList;
import java.util.Scanner;

//15. Write a Java program to insert the specified element at the specified position in the linked list.

public class Task15 {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(4);
		l.add(5);
		System.out.println(l);
		System.out.println("to insert the specified element at the specified position in the linked list  ");
		Scanner sc=new Scanner(System.in);
		System.out.println("give the element and position ");
		int number=sc.nextInt();
		int pos=sc.nextInt();
		
		l.add(pos,number);
		System.out.println(l);
		
		
		
		
		
		
		
	}
}
