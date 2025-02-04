package Cursors_examples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_example {
	public static void main(String args[]) {
ArrayList a=new ArrayList();
		
		a.add(1);
		a.add(2);
		a.add("hii");
		a.add(1.52);
ListIterator ltr=a.listIterator();
		//same order
		while(ltr.hasNext()) {
			Object ele=ltr.next();
			System.out.println(ele);
			
		}
		//reverse order 
		while(ltr.hasPrevious()) {
			Object ele=ltr.previous();
			System.out.println(ele);
			
		}
	}

}
