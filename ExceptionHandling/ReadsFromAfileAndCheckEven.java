package ExceptionHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.File;

//4. Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.


public class ReadsFromAfileAndCheckEven {
	public static void main(String args[])   {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         //System.out.print("Enter the Path : ");
        try {
        // Reading File name
        String path ="D:\\eclipse\\New folder\\Assignments\\src\\ExceptionHandling\\filereader.txt";

        FileReader fr = new FileReader(path);

        // Declaring loop variable
        int i=0;
       
        // Holds true till there is nothing to read
        while ((i= fr.read()) != -1)

            // Print all the content of a file
            System.out.print( i);
		 		
		 
		}catch(Exception e) {
			e.printStackTrace();
		}
       
		
	}
	

}
