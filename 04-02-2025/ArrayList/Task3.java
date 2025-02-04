package ArrayList;
//3. Write a Java program to insert an element into the array list at the first position.

import java.util.ArrayList;

public class Task3 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		System.out.println("Add an element in the 1st position");
		 
		a.add(0,100);
		System.out.println(a);
	}

}
