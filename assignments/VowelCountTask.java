package assignments;

import java.util.Scanner;

public class VowelCountTask {
//	## Problem Statement
//
//	Write a Java program to count both vowels and consonants in a given string
//
//	### Conditions
//
//	Only alphabets should be considered for counting
//
//	## Input
//
//	    Hello World!
//
//	## Output
//
//	    Vowels count - 3
//	    Consonants count - 7
//
//	## Explanation
//
//	> The vowels in the given string are `e`,`o` and `o` and so the vowels count is 3.
//	> Likewise, the consonants in the given string are `h`,`l`,`l`,`w`,`r`,`l` and `d` and so the count is 7.
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		 
		int v=0, c=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == 'a' ||  str.charAt(i) == 'e' ||str.charAt(i) == 'i' ||str.charAt(i) == 'o' ||str.charAt(i) == 'u' ||
					str.charAt(i) == 'A' ||	str.charAt(i) == 'E' ||str.charAt(i) == 'I' ||str.charAt(i) == 'O' ||str.charAt(i) == 'U' ) {
				v++;
		 
			} 
			else if(str.charAt(i) == ' ' || str.charAt(i) =='!' ){
				 
				continue;
			}
			else {
				c++;
			}
		 
			
			 
		}
		System.out.println("vowels count "+v);
		System.out.println("consonants count "+c);
		
		
	}

}
