package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

////Task 1 : Recursively insert multiple row/s into the table.
//Hint :: Use PreparedStatement
public class Task1 {
	public static void main(String args[]) throws Exception,ClassNotFoundException{
		try {	
				Scanner sc=new Scanner(System.in);
			System.out.println("give the number of persons data u need to enter");
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","S@ndy1234");
			//statement
			 int n=sc.nextInt();
			for(int i=0;i<n;i++) {
				
				System.out.print("give the id , name , age for person   "+i);
				int id1=sc.nextInt();
				String name1=sc.next();
				int age1=sc.nextInt();
				
			 PreparedStatement ps=con.prepareStatement("insert into demo1 values(?,?,?)");
			 ps.setInt(1,id1);
			 ps.setString(2, name1);
			 ps.setInt(3, age1);
			
			 int val=ps.executeUpdate();
			
			 if(val > 0) {
				 System.out.println("updated ");
				 
			 }else {
				 System.out.println("not proccessed");
			 }
			}
			con.close();
			sc.close();
			
		
		}catch(Exception e) {
			e.printStackTrace();
			
		}
		
	}

}
