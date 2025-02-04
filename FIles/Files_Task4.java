package FIles;

import java.io.File;

//4. Write a Java program to check if a file or directory has read and write permissions.
public class Files_Task4 {
	public static void main(String args[]) {
       String directoryPath = "D:\\eclipse\\New folder";        
        File directory = new File(directoryPath);
        
        if (directory.exists()|| directory.isDirectory()) {
            System.out.println("exists");
             
        
        	
            if(directory.canRead()) System.out.println("readable");
            if(directory.canWrite()) System.out.println("can  writable");
            
        }
        else {
        	System.out.println("not exsists");
        }
		
	}
	}