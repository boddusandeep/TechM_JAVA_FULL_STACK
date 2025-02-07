package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//4. Write a Java program to remove all duplicate elements from a list using streams.
public class Task4 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		System.out.println("the original "+a);
		
		List<Integer> l=a.stream().distinct().collect(Collectors.toList());
		System.out.println("without duplicates  "+l );
		
		
		
	}

}
