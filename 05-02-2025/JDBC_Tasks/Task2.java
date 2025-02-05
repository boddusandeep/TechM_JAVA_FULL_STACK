package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

//Task 2 : Update the row of a table dynamically using Scanner class.
public class Task2 {
	public static void main(String args[]) throws SQLException,ClassNotFoundException{
		
		try {
			Scanner sc=new Scanner(System.in);
			 
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","S@ndy1234");
			//statement		  
			 
			  System.out.println("give the id , name , age of person");
				int id1=sc.nextInt();
				String name1=sc.next();
				int age1=sc.nextInt();
				
				 PreparedStatement ps=con.prepareStatement("insert into demo1 values(?,?,?)");
				 ps.setInt(1,id1);
				 ps.setString(2, name1);
				 ps.setInt(3, age1);
			
			int n=ps.executeUpdate();
			if(n>0) System.out.println("updated ");
			else {
				System.out.println("not updated ");
			}
			con.close();
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
