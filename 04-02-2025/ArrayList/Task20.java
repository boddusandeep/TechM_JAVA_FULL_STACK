package ArrayList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;
//20. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class Task20 {
	public static void main(String args[]) {
		LinkedList<Integer> l=new LinkedList<>();
		
		l.add(1);
		l.add(2);
		l.add(3);
		l.add(100);
		l.add(4);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(8);
		l.add(100);
		System.out.println(l);
		
		Iterator<Integer> i=l.iterator();
		Scanner sc=new Scanner(System.in);
		System.out.println("give the number to be found");
		int n=sc.nextInt();
		int k=0;
		while(i.hasNext()) {
			Object o=i.next();
			k++;
			 if(o == (Object)n) {
				 System.out.println("the first occurance of the element at the index of:  ");
				 System.out.println(  k-1);
				 break;
			 }
		}
		
		for(int i1=l.size()-1;i1>0;i1--) {
			if(n == l.get(i1)) {
				System.out.println("the last occarance of the element at the index of :"+i1);
				break;
			}
		}
	 
		 
		
		
		 
		 

}
}
