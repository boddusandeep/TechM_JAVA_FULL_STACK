package Generic_examples;

import java.util.ArrayList;
import java.util.List;

//5. Write a Java program to create a generic method that takes two 
//lists of the same type and merges them into a single list. This method alternates the elements of each list.
public class Generics_Task5 {
	
	public static <T> List merge(  List<T> l1, List<T> l2) {
		
		List<T> l=new ArrayList<>();
		
		for(int i=0;i<l1.size();i++) {
			
			l.add(l1.get(i));
		}
		for(int i=0;i<l2.size();i++) {
			l.add(l2.get(i));
		}
		
		return l;
	}

	public static void main(String args[]) {
		List<Integer> l1=new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		List<Integer> l2=new ArrayList<>();
		l2.add(4);
		l2.add(5);
		l2.add(6);
		System.out.println("origina list 1   "+l1);
		System.out.println("origina list 2    "+l2);
		
		System.out.println("merged list "+merge(l1,l2));
	}
	
}
