package ArrayList;

import java.util.ArrayList;

//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
public class Task4 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		System.out.println("get an element from 3 rd index ");
		System.out.print(a.get(3));
		
	}

}
