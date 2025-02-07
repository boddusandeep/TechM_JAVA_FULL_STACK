package Examples;
import java.util.*;
import java.util.stream.*;


public class EXP1 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(10);
		a.add(201);
		a.add(301);
		a.add(401);
		a.add(50);
		a.add(60);
		System.out.println("collection "+a);
		//Stream operations
		List<Integer> l=a.stream().filter(i -> i%2==0 ).collect(Collectors.toList());
		
		System.out.println(l);
		
	}

}
