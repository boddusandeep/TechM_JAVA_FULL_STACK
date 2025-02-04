package ArrayList;
//5. Write a Java program to update an array element by the given element.
import java.util.ArrayList;

public class Task5 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		
		System.out.println(a);
		System.out.println("put an element at 3rd index ");
		a.add(3,10);
		System.out.print( a);
		
	}
}
