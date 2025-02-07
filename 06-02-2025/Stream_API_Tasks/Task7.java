package Examples;

import java.util.ArrayList;
import java.util.Optional;

public class Task7 {
//7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
public static void main(String args[]) {
	ArrayList<Integer> a=new ArrayList<>();
	a.add(101);
	a.add(102);
	a.add(103);
	a.add(104);
	a.add(105);
	System.out.println("the original "+a);
	
 
	
	Optional<Integer> max = a.stream().max(Integer::compareTo);
    max.ifPresent(value -> System.out.println("Maximum value: " + value));

    // Find minimum value
    Optional<Integer> min = a.stream().min(Integer::compareTo);
    min.ifPresent(value -> System.out.println("Minimum value: " + value));
		
		 

}
}