package ExceptionHandling;

import java.util.Scanner;

public class TryWithResourses {
	public static void main(String args[]) {
		
		try {
			Scanner sc=new Scanner(System.in);
			int n1=sc.nextInt();
			System.out.println("try with resourses executed");
		}finally {
			System.out.println("finally block");
		}
	}

}