package Cursors_examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Cursor_iteratorType {
	
	public static void main(String args[]) {
		
		ArrayList a=new ArrayList();
		
		a.add(1);
		a.add(2);
		a.add("hii");
		
		Iterator it=a.iterator();
		
		while(it.hasNext()) {
			Object ob=it.next();
			System.out.println(ob);
		}
		
		
		 
		
		
	}

}
