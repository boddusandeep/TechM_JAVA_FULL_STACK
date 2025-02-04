package ArrayList;

import java.util.LinkedList;
//19. Write a Java program to insert some elements at the specified position into a linked list.
import java.util.Scanner;

public class Task19 {

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
		
		System.out.println("give the  count of elements to be inserted   ");
	
		int n=sc.nextInt();
		System.out.println("give the elements and positions according ");
		for(int i=0;i<n;i++) {
			int k=sc.nextInt();
			int p=sc.nextInt();
			l.add(p,k);
		} 
	 
		System.out.println(l);
}}
