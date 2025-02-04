package assignments;
//## Problem Statement
//
//Write a Java program to print the characters at the odd position of a given string
//
//## Input
//
//    Hey there!
//
//## Output
//
//    e hr!
//
//## Explanation
//
//> All the characters (including whitespace) at the odd position of the string `Hey there!` are printed.

import java.util.Scanner;

public class CharacterAtOddPositions {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("give the String ");
		String str=sc.nextLine();
		
		for(int i=1;i<str.length();i+=2) {
			System.out.print(str.charAt(i));
		}
		
		
	}
	
	

}
