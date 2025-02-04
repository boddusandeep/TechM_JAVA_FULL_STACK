package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//
//8. Write a Java program to sort a given array list.

public class Task8 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		 
		a.add(4);
		a.add(5);
		a.add(1);
		a.add(2);
		a.add(3);
		
		System.out.println(a);
		 
		Collections.sort(a);
		System.out.println("the sorted order ");
		System.out.println(a);
		
	}

}
