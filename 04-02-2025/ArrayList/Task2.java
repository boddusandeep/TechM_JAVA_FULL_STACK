package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in an array list.

public class Task2 {
	public static void main(String args[]) {
		ArrayList a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add("hii");
		a.add("hello ");
		
		Iterator it=a.iterator();
		
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
		}
	}

}
