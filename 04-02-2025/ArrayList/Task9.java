package ArrayList;
//9. Write a Java program to copy one array list into another.
import java.util.ArrayList;
import java.util.List;

public class Task9 {
	public static void main(String args[]) {
		ArrayList<Integer> a=new ArrayList();
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		a.add(5);
		ArrayList<Integer> a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		
		
		 System.out.println(a);
		 System.out.println(a1);
		 
		 List<Integer> l=new ArrayList<>();
		 l.addAll(a);
		 l.addAll(a1);
		 
		 System.out.println(" copy one two arrayLists  "+l);
		 
		 
		
	}

}
