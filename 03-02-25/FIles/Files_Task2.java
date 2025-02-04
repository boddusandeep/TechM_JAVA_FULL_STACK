package FIles;

import java.io.File;

import java.io.FilenameFilter;
import java.util.Scanner;

	public class Files_Task2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter folder path");
	        String folderPath = scanner.nextLine();
	        
	        //   extension from user
	        System.out.print("Enter file extension (e.g., txt, java): ");
	        String extension = scanner.nextLine();
	        
	        File folder = new File(folderPath);
	        
	        if (!folder.isDirectory()) {
	            System.out.println("Invalid folder path.");
	            return;
	        }
	        
	        // Filter files by extension
	        FilenameFilter filter = (dir, name) -> name.toLowerCase().endsWith("." + extension.toLowerCase());
	        File[] files = folder.listFiles(filter);
	        
	        if (files == null || files.length == 0) {
	            System.out.println("No files found with extension: " + extension);
	        } else {
	            System.out.println("Files with ." + extension + " extension:");
	            for (File file : files) {
	                System.out.println(file.getName());
	            }
	        }
	        scanner.close();
}
}