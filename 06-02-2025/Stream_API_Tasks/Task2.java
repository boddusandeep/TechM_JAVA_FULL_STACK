package Examples;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//
//2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.

public class Task2 {
	public static void main(String args[]) {
		
		List<String> words = Arrays.asList("Apple", "Banana", "Cherry");

        // Convert to uppercase
        List<String> upperCaseWords = words.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());
        
        System.out.println("Uppercase: " + upperCaseWords);

        // Convert to lowercase
        List<String> lowerCaseWords = words.stream()
                                           .map(String::toLowerCase)
                                           .collect(Collectors.toList());
        System.out.println("Lowercase: " + lowerCaseWords);
    }
}
