package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
public class Task3 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(101);
		a.add(102);
		a.add(103);
		a.add(104);
		a.add(105);
		System.out.println("the original "+a);
		
		List<Integer> l=a.stream().filter(i-> i%2 ==0).collect(Collectors.toList());
		System.out.println(l);

		List<Integer> l1=a.stream().filter(i-> i%2 !=0).collect(Collectors.toList());
		System.out.println(l1);
		
		 int sum1=l.stream().mapToInt(Integer::intValue).sum();
		 int sum2=l1.stream().mapToInt(Integer::intValue).sum();
		 System.out.println("even sum "+sum1);
		 System.out.println("Odd sum "+sum2);
		 
		 

		
	}

}
