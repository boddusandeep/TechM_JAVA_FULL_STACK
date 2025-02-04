package ExceptionHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//
//5. Write a Java program that reads a file and throws an exception if the file is empty.


public class ThrowsAnExceptionIffileIsEmpty {
	public static void main(String args[]) throws Exception   {
		String path="D:\\eclipse\\New folder\\Assignments\\src\\ExceptionHandling\\filereader.txt";
	  
		FileReader fr=new FileReader(path);
		if(fr.read() == -1) {
			throw new Exception("empty file");
		}
		else {
				System.out.println("file is not empty");
			}
			 
	 
	 
	  
		
		
	

}}
