package assignments;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacters {
	 

	public static void main(String args[]) {
//		## Problem Statement
//
//		Write a Java program to print the unique characters present in the given string in the same sequence as they appear(the first occurrence) in the input.
//
//		### Condition
//
//		All the characters should be in lowercase only.
//
//		## Input
//
//		    xperience
//
//		## Output
//
//		    xperinc
		Scanner sc=new Scanner(System.in);
		System.out.println("give the String  ");
		String str=sc.next();
		
		Set< Character> h=new HashSet<>();
		
		for(int i=0;i<str.length();i++) {
			h.add(str.charAt(i));
		}
		System.out.println(h);
		
		
//		String s="";
////		
//		HashMap<Character,Integer> h=new HashMap<>();
//		for(int i=0;i<str.length();i++) {
//			if( (h.get(str.charAt(i)) != null )) {
//				h.put(str.charAt(i),0);
//				 
//			}else s+=str.charAt(i);
//			 
//		}
//		System.out.println(s);
		
//		for(Entry<Character, Integer> ite : h.entrySet())
//		    System.out.print(ite.getKey()+", ");
//		
		
		
		
		
	}

}
