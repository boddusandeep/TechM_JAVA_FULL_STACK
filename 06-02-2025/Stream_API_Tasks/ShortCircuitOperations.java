package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class ShortCircuitOperations {
	public static void main(String args[]) {
		List<String > l=new ArrayList<>();
		l.add("a");
		l.add("b");
		l.add("c");
		
		Stream<String> s=l.stream();
		s.distinct().forEach(System.out::println);
		
		s=l.stream();
		
		Optional<String> o1=s.findFirst();
		
	System.out.println(o1.get());
	 
	 
		
		
		
		
		
		}

}
