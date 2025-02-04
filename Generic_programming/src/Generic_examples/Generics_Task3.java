package Generic_examples;

import java.util.List;

//3. Write a Java program to create a generic method that takes a list of any type and a target element.
//It returns the index of the first occurrence of the target element in the list. Return -1 if the target element cannot be found.
public class Generics_Task3 {
	public static <T extends Number> void find(List<T> numbers,int target) {
         
        
        for (T num : numbers) {
            int value = num.intValue();
            if(value==target) {
            	System.out.println(numbers.indexOf(value));
            }
             
        }
        
        
    }

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        find(numbers,9);
    }

	
	

}
