package FIles;
import java.io.File;



//3. Write a Java program to check if a file or directory specified by pathname exists or not.
public class Files_Task3 {
	
	public static void main(String args[]) {
		String directoryPath = "D:\\eclipse\\New folder\\sandy";

        
        File directory = new File(directoryPath);

        
        if (directory.exists() && directory.isDirectory()) {
            System.out.println("exists");
             
        } else {
            System.out.println("Invalid directory path: " + directoryPath);
        }
		
		
	}
		
		
	}


