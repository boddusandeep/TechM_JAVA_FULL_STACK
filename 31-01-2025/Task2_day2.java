package demo;
import java.util.Scanner;
//to accept marks off different students and find their avg

public class Task2_day2 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of students");
		
		int n=sc.nextInt();
		
		int arr[][]=new int[n][3];
		String a1[][]=new String[n][1];
		System.out.println("give the name and marks of each student ");
		 
		for(int i=0;i<n;i++) { 
			a1[i][0]=sc.next();
			for(int j=0;j<3;j++) {
				 
				arr[i][j]=sc.nextInt();				
			}
		}
		
			for(int i=0;i<n;i++) {
				System.out.println(a1[i][0]);
				for(int j=0;j<3;j++) {
					System.out.print(arr[i][j]+ " ");					
				}
				System.out.println("");		
			}
		 int p=0,q=0;
			for(int i=0;i<n;i++) {
				 
				for(int j=0;j<3;j++) {
						p+=arr[i][j];		
				}
				
		 }
		 
			
		sc.close();
	}

}
