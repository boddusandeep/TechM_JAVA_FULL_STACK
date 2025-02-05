package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc_Insertion {
	public static final String url="jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false";
	public static void main(String args[]) throws SQLException,Exception,ClassNotFoundException{
		
		try {
			//driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection con=DriverManager.getConnection(url,"root","S@ndy1234");
			//statement
			Statement stmt=con.createStatement();
			//Resultset
			 int rs = stmt.executeUpdate("insert into  demo1(id,name,age) values('210','prashanth','21')");
			
			if(rs > 0) {
				System.out.println("successfully done");
				
			}else {
				System.out.println("errorrr in the code ");
			}
			
			con.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		 
	}

}
