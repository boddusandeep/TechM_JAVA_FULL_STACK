package Examples;

import java.util.Arrays;
import java.util.List;
 
//5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.

public class Task5 {
public static void main(String args[]) {
		
		List<String> words = Arrays.asList("Apple", "Banana", "Cherry","chocolate","chesss","chin");
		 char targetLetter = 'c';  
		 System.out.println(words);

	        int count = (int) words.stream().filter(word -> word.startsWith(String.valueOf(targetLetter))).count();
		
		System.out.println(count +" are starting with letter  "+targetLetter);

}
}
