package FIles;

import java.io.File;
//Write a Java program to determine the last modified date of a file.
public class Files_Task6 {
	public static void main(String args[]) {
		String path="D:\\eclipse\\New folder\\Assignments\\src\\FIles";
		File f=new File(path);
		 
		 if(f.isDirectory()) {
			 System.out.println("directory  ");
		 }
		 else if(f.isFile()) {
			 System.out.println("file");
		 }
		 else {
			 System.out.println("not a file or a directory");
		 }
		
		 if(f.setLastModified(22))
		  System.out.println("Last modified date: " + new java.util.Date(f.lastModified()));
	}
}

