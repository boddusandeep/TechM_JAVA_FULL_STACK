package Examples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exp2StreamsAPLI {
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
				
	}
}
