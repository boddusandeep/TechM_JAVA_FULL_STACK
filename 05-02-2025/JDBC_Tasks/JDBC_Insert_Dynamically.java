package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class JDBC_Insert_Dynamically {
	
	public static void main(String args[]) throws Exception {
		try {
		int id1;
		String name1;
		int age1;
		Scanner sc=new Scanner(System.in);
		System.out.print("give the id , name , age");
		id1=sc.nextInt();
		name1=sc.next();
		age1=sc.nextInt();
		 
			//driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","S@ndy1234");
			//statement
			 
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
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
