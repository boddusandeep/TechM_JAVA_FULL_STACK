package LambdaExpressions;

import java.util.Scanner;

interface numericTest{
	boolean test(int n);

	 
}

public class LambdaExpressions1 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int p=sc.nextInt();
		//Expression Lambda 
		numericTest obj=(n) -> (n%2)==0;
		if(obj.test(p)) System.out.println("even");
		else System.out.println("odd ");
		
		numericTest nm=(q)->(q>0);
		if(nm.test(p)) System.out.println("positive ");
		else System.out.println(" negative ");
	
	
	//Block lambda function
	numericTest obje=(n)-> {
		System.out.println("block lambda function");		
		return true;
		
	};
	 
	

}}
