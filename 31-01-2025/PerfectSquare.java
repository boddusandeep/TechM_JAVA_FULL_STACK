package assignments;
//## Problem Statement
//
//Write a Java program to check whether a given number is a perfect square or not
//
//### Condition
//
//Input will only be a positive interger and will not have any decimal or special characters
//
//## Input
//
//    9
//
//## Output
//
//    TRUE
//
//## Explanation
//
//> A positive integer is a perfect square if it is the product of some integer with itself.
//> As `9` is a square of `3` (ie., `3 * 3 = 9`).

import java.util.Scanner;

public class PerfectSquare {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the value to find wheather a square root or not");
		
		Long n=sc.nextLong();
		
		Long l=(long) Math.sqrt(n);
		
		if(l*l == n) System.out.println("yes");
		else System.out.println("noo");
	
	}
}
