package demo;
import java.util.*;
//deep equals and equals
public class Task3_day2 {
	public static void main(String args[]) {
		
		int a[]= {1,2,3};
		int a2[]= {1,2,3};
		
		Object[] obj= {a};
		Object[] obj1= {a2};
		
		System.out.println(Arrays.equals(a2,a));
		System.out.println(a.equals(a2));
		System.out.println(a.equals(obj));
		System.out.println(obj.equals(obj1));
		
		System.out.println(Arrays.deepEquals(obj,obj1));;
		
		
		
		

}
}
