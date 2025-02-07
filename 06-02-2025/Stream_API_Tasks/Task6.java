package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.

public class Task6 {

public static void main(String args[]) {
		
		List<String> words = Arrays.asList("paste","copy "+"hello","Apple", "Banana", "Cherry"+"anand"+"boss");
		
		System.out.println(words);
		 List<String> ascendingOrder = words.stream()
                 .sorted()
                 .collect(Collectors.toList());
System.out.println("Ascending order: " + ascendingOrder);

// Sort in descending order
List<String> descendingOrder = words.stream()
                  .sorted((a, b) -> b.compareTo(a))
                  .collect(Collectors.toList());

System.out.println("Descending order: " + descendingOrder);
		

}
}