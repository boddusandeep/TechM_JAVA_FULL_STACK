package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;
//7. Write a Java program to search for an element in an array list.
public class Task7 {
	 
		public static void main(String args[]) {
			ArrayList<Integer> a=new ArrayList();
			Scanner sc=new Scanner(System.in);
			a.add(1);
			a.add(2);
			a.add(3);
			a.add(4);
			a.add(5);
			 
			System.out.println("give the number to be found");
			int n=sc.nextInt();
		for(int i=0;i<a.size();i++) {
			if(a.get(i) == n) {
				System.out.println("the number is found and the index of the number is   "+i);
			}
		}
			
			
			
		}
	}


