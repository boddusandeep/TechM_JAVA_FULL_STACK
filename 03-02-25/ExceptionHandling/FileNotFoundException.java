package ExceptionHandling;
//
//3. Write a Java program to create a method that reads a file and throws an exception if the file is not found.

import java.io.File;
import java.io.FileReader;

public class FileNotFoundException {
	public static void main(String args[]){
		 		try {
			FileReader f=new FileReader("g1.txt");
			 f.read();
		}catch(Exception e) {
			System.out.print(e);
			//e.printStackTrace();
		}
		 
		
	}

}
