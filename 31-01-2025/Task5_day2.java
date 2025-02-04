package demo;

import java.util.Scanner;

public class Task5_day2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s="";
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(i %2 ==0 ) {
				s+=Character.toUpperCase(ch);
				continue;
			}
			s+= ch;
		 
		}
		System.out.println(s);
		 
	}

}