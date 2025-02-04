package assignments;

import java.util.Scanner;

//## Problem Statement
//
//Write a Java program to reverse a given number
//
//### Condition
//
//Input will only be a positive interger and will not have any characters
//
//## Input
//
//    12345
//
//## Output
//
//    54321
//
//## Explanation
//
//> Solution1-Explanation
//> Number modulo 10 will give the last digit as result. (ie., 12345 % 10 = 5).
//> Again dividing the same number by 10 will give the remaining digits except last one.
//> Solution2-Explanation
//> StringBuffer's append method concats the given input to the buffer.
//> StringBuffer's reverse method reverses the contents of the StringBuffer.


public class ReverseANumber {
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give a number that needed to be reversed");
		int number=sc.nextInt();
		
		int reverseNumber=0;
		
		while(number !=0) {
			int rem=number%10;
			reverseNumber=reverseNumber*10+rem;
			number/=10;
		}
		System.out.println(reverseNumber);
	}
	

}
