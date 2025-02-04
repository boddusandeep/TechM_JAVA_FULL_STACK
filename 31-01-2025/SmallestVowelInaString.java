package assignments;
//## Problem Statement
//
//Write a program to print the smallest vowel in a given string
//
//## Input
//
//    matrix
//
//## Output
//
//    a
//
//## Explanation
//
//> The vowels in the given string are `a` and `i`.
//> And the alphabetically smallest between them is `a`.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SmallestVowelInaString {
	public static void main(String argd[] ){
		Scanner sc=new  Scanner(System.in);
		String str=sc.nextLine();
		
		 
		//ArrayList<Character> arr=new ArrayList<>();
		String s="";
		
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' ||  str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ||
					str.charAt(i) == 'A' ||	str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U' ) {
				
				s+=str.charAt(i);		 
			} 
		char a[]=new char[s.length()];
		for(int i1=0;i1<a.length;i1++) {
			a[i1]=s.charAt(i);
		}
			Arrays.sort(a);
			System.out.println(a[0]);
			 
	}
	}
}
