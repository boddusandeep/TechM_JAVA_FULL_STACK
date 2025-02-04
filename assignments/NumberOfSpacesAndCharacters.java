package assignments;

import java.util.Scanner;
//## Problem Statement
//
//Write a Java program to compute the number of spaces and characters in a given string
//
//### Condition
//
//Ignore all the digits
//
//## Input
//
//    Hello This is ABCD from XYZ city
//
//## Output
//
//    No of spaces : 6 and characters : 26
//
//## Explanation
//
//> The total number of spaces and all the characters excluding numbers/digits are computed and printed.

public class NumberOfSpacesAndCharacters {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int c=0,s=0;
		String str=sc.nextLine();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch == ' ') s++;
			else if(!Character.isDigit(ch)) {
				c++;
			}
		}
		System.out.println(s+"    " + c);
		
		
	}

}
