package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
///Task 3 : Delete the row from the table by using a delete query using Scanner class.
public class Task3 {
public static void main(String args[]) throws SQLException,Exception,ClassNotFoundException{
		
		try {
			//driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","S@ndy1234");
			//statement
			Statement stmt=con.createStatement();
			//Resultset
			Scanner sc=new Scanner(System.in);
			System.out.println("give the name of the person that to be deleted ");			
			String name1=sc.next();
			 PreparedStatement ps=con.prepareStatement("delete from demo1 where name=? ");
			 
		     ps.setString(1, name1);
			 int rs=ps.executeUpdate();
			 
			if(rs > 0) {
				System.out.println("successfully done");
				
			}else {
				System.out.println("errorrr in the code ");
			}
			
			con.close();
			sc.close();
		}catch(Exception e) {
			e.printStackTrace();
		}

}
}