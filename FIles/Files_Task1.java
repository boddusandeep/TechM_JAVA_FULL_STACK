package FIles;
//1. Write a Java program to get a list of all file/directory names in the given directory.
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;


public class Files_Task1 {
	public static void main(String args[]) {
	 
		String directoryPath = "D:\\eclipse\\New folder";

         
        File directory = new File(directoryPath);

        
        if (directory.exists() && directory.isDirectory()) {
            
            String[] filesAndDirectories = directory.list();
 
            for (String fileOrDirectory : filesAndDirectories) {
                System.out.println(fileOrDirectory);
            }
        } else {
            System.out.println("Invalid directory path: " + directoryPath);
        }
		
		
	}

}
