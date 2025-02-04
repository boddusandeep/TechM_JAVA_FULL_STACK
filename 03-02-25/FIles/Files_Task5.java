package FIles;

import java.io.File;

//Write a Java program to check if the given pathname is a directory or a file.
public class Files_Task5 {
	public static void main(String args[]) {
		 String path="D:\\eclipse\\New folder\\Assignments\\src\\FIles";
		 
		 File f=new File(path);
		 
		 if(f.isDirectory()) {
			 System.out.println("directory  ");
		 }
		 if(f.isFile()) {
			 System.out.println("file");
		 }
		 
		 
	}
	
	

}
