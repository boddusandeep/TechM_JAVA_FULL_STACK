package JDBC_Excution_Practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

public class Task4 {
//	Task 4 : Create a menu driven program where the options would be
//	1. Insert a new Row 
//	2. Update a Row
//	3. Delete a Row
//	4. Select the row
//	5. Exit
	public static void main(String args[]) throws ClassNotFoundException{
		try {
		System.out.println("enter the option"
				+ "1. Insert a new Row \r\n"
				+ "//	2. Update a Row\r\n"
				+ "//	3. Delete a Row\r\n"
				+ "//	4. Select the row\r\n"
				+ "//	5. Exit");
		   Scanner sc=new Scanner(System.in);
		   int n=sc.nextInt();
		   Class.forName("com.mysql.cj.jdbc.Driver");
			//connection
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcDemo?autoReconnect=true&useSSL=false","root","S@ndy1234");
			
		   switch(n) {
		   case 1:     System.out.print("give the id , name , age of person");
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
		                  break;
		   case 2:       System.out.println("give the id of the person that you want to update ");			
		   				    int id6=sc.nextInt();	   					 		   				 
		   					System.out.println("give the  name and age  that needed to be updated ");		   					 
		   					String str=sc.next();
		   					int age4=sc.nextInt();
		   					PreparedStatement ps2=con.prepareStatement("UPDATE demo1 SET name= ?, age=? where id=?");		   				 
		         			ps2.setString(1, str);
		         			ps2.setInt(2, age4);
		         			ps2.setInt(3, id6);
		         			int rs1=ps2.executeUpdate();
		         			if(rs1 > 0) {
		        	   			System.out.println("successfully done");
			
		         			}else {
		         				System.out.println("errorrr in the code ");
		         			}	         			 
			   			break;
		   case 3:
			            System.out.println("give the name of the person that to be deleted ");			
				         String name2=sc.next();
				          PreparedStatement ps1=con.prepareStatement("delete from demo1 where name=? ");
				 
			               ps1.setString(1, name2);
				           int rs=ps1.executeUpdate();
				 
				           if(rs > 0) {
					           System.out.println("successfully done");
					
				               }else {
				                	System.out.println("errorrr in the code ");
				                }
				             break;
		   case 4 :  	Statement stmt=con.createStatement();
						//Resultset
		   				int rs10 = stmt.executeUpdate("insert into  demo1(id,name,age) values('210','prashanth','21')");
			
		   				if(rs10 > 0) {
		   					System.out.println("successfully done");
					
		   					}else {
							System.out.println("errorrr in the code ");
		   					} break;
		   case 5: return; 
		   
			default:return;          
		   }
		
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
