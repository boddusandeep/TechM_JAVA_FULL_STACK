package ArrayList;

import java.util.ArrayList;

//6. Write a Java program to remove the third element from an array list.
public class Task6 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		System.out.println("remove  an element from 3rd index ");
		a.remove(3);
		System.out.print(a);
		
	}

}
