package ExceptionHandling;

import java.util.Scanner;

public class ThrowsKeyWord {
	public static void main(String args[]) throws ArithmeticException {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		
		try {
			int n=n1/n2;
			System.out.println("n");
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
