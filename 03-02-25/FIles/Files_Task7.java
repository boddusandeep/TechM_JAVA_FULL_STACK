package FIles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

//7. Write a Java program to read input from the Java console.
public class Files_Task7 {
 public static void main(String args[]) throws IOException {	  
	  FileWriter w=new FileWriter("fileCreation.txt");
	  try {
		  w.write("args[0]");
	  }catch(Exception e) {
		  System.out.println(e);
	  }
	  
	  
 }
}
