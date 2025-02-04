package ExceptionHandling;

import java.util.Scanner;
//. Write a Java program that throws an exception and catch it using a try-catch block.

public class Task1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		try {
			int n=n1/n2;
			System.out.print(n);
		}
		catch(ArithmeticException e){
			//System.out.print(e);
			e.printStackTrace();//used to display the error caused by the exception
			//we cam specify our own message at the console too
		}
	}

}
