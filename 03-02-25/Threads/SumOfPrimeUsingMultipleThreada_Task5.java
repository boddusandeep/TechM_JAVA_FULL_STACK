package Threads;

import java.util.Scanner;

//5. Write a Java program that calculates the sum of all prime numbers up to a given limit using multiple threads.

public class SumOfPrimeUsingMultipleThreada_Task5 implements Runnable {
	int n;
	public SumOfPrimeUsingMultipleThreada_Task5(int n){
		this.n=n;
		
	}
		
	 public void run() {
		 int sum=0;
		 for(int i=1;i<=n;i++ ) {
			 if(isPrime(i)) {
				 sum+=i;
			 }
		 }
		 
		 System.out.println(sum);
	 }
	
	
	public boolean isPrime(int n) {
		if(n <= 1 ) {
			return false;
		}
		else {
			int c=0;
			 for(int i=1;i<=n;i++) {
			    if(n%i == 0) c++;
			 
			}
			return  c==2 ;
			
			
		}
	}
	
	   
	
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		SumOfPrimeUsingMultipleThreada_Task5 t=new SumOfPrimeUsingMultipleThreada_Task5(n);
		Thread tt=new Thread(t);
		
		tt.start();
		
		
		
		
	}
	 
	

}
