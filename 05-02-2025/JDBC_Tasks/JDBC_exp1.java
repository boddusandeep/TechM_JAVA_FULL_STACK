package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_exp1 {
	public static void main(String args[]) throws SQLException,Exception {
		//register the driver to connect to mysql environment
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Establish the connection
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false" ,"root","S@ndy1234");
		//enable the STatement object to pass sql queries.
		Statement stmt = con.createStatement();
		//use the ResultSet
		ResultSet rs = stmt.executeQuery("select * from demo1");
		
		//iterate the rows
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getInt(3));
		}
		
		rs.close();
		stmt.close();
		con.close();
	   }
	
	

}
