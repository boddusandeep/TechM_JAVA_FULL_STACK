package Examples;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class practice1 {
	public static void main(String args[]) {
		List<String> l=new ArrayList<>();
		l.add("java");
		l.add("python");
		l.add("reacat");
		System.out.println(l);
		
		Stream<String> s=l.stream();
	//	System.out.println("1.reduce list to store it in optional ");
		Optional<String > optional=s.sorted().reduce((s1,s2) -> s1 + ","+ s2);
		System.out.println(optional.isPresent());
		
		//get the values
		System.out.println(optional.get());
		optional.ifPresent(System.out::println);
		
		
		
		
		
		
		
	}

}
