package demo;
import java.util.Arrays;
public class Task4_day2 {
	
	public static void main(String args[]) {
		int arr1[]= {1,2,3,4,5,5,6,6,7};
		int arr2[]= Arrays.copyOfRange(arr1, 0,7);
		
		 		
		for(int i: arr2) {
			System.out.print(i+" ");
		}
		
		
	}

}
