package Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//1. Write a Java program to calculate the average of a list of integers using streams.
public class Task1 {
	public static void main(String args[]) {
		
		 
        IntStream stream = IntStream.of(2, 3, 4, 5, 6, 7, 8);     
        OptionalDouble obj = stream.average();         
        if (obj.isPresent()) {
           System.out.println(obj.getAsDouble());
       }        else {
            System.out.println("-1");
        }
		//or
        
        List<Integer> numbers = Arrays.asList(2,3,4,5,6,7,8);
        
        OptionalDouble average = numbers.stream()
                                        .mapToInt(Integer::intValue)
                                        .average();
        
        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("List is empty.");
        }
	 
	}

}
