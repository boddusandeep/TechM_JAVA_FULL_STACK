package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

//10. Write a Java program to shuffle elements in an array list.
public class Task10 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		Collections.shuffle(a);
		System.out.println("Shuffled arrayList  "+a);
		 
		 
		 
		
	}

}
