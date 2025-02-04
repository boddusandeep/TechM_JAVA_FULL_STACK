package ExceptionHandling;

import java.util.Scanner;

//2. Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.

public class Task2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int number=sc.nextInt();
		
		System.out.print(number);
		function(number);
		
	}
	public static void function(int n) {
		if(n% 2 != 0) {
			throw new ArithmeticException("the number given is Odd");
		}else {
			System.out.println("  given number is even number");
		}
		 
		
	}
}
