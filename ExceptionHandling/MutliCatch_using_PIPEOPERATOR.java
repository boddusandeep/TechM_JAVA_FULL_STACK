package ExceptionHandling;

import java.nio.channels.AlreadyBoundException;
import java.util.Scanner;

public class MutliCatch_using_PIPEOPERATOR {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4};
		int n=sc.nextInt();
		
		try {
			System.out.println(arr[1]/n);// 
			int n2=arr[10];
		}
		catch(ArithmeticException | AlreadyBoundException e) {
			System.out.println(e);
			e.printStackTrace();
		 
			
		}
		
	}

}
