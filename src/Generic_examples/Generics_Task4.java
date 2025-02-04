package Generic_examples;
import java.util.ArrayList;
//4. Write a Java program to create a generic method that takes a list of any type and returns 
//it as a new list with the elements in reverse order.
import java.util.List;

public class Generics_Task4 {
	
public static <T> List find(List<T> n2) {
         
	List<T> n=new ArrayList<>();
        
         for(int i=n2.size()-1;i>=0;i--) {
        	 
        	 n.add(n2.get(i));
         }
        
         return n;
        
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        System.out.println("original  "+numbers);
        System.out.println("reversed     "+(find(numbers)));
        
        List<String> n2 = new ArrayList<>();
        n2.add("java ");
        n2.add("is ");
        n2.add("powerful " );
        n2.add("language ");
        System.out.println("Original list "+n2);
        System.out.println("reverse List "+ find(n2));
        
        
        
    }

}
