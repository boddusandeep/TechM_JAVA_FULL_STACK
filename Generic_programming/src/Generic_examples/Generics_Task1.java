package Generic_examples;

import java.util.Scanner;

//1. Write a Java program to create a generic method that takes two arrays of the same type 
//and checks if they have the same elements in the same order.
public class Generics_Task1 {
	 	
	public static <T,V>boolean method(T []arr1,V []arr2) {
		
		if(arr1.length != arr2.length) return false;
		else {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					return false;
				}
			}
			
		}
		return true;
	}
	
	public static void main(String args[]) {
		   Integer[] arr1 = {1, 2, 3, 4, 5};
	        Integer[] arr2 = {1, 2, 3, 4, 5};
	        Integer[] arr3 = {1, 2, 3, 4, 6};
	        
	        System.out.println("arr1 and arr2 are equal: " + method(arr1, arr2)); // true
	        System.out.println("arr1 and arr3 are equal: " + method(arr1, arr3)); // false
	        
	        String[] strArr1 = {"apple", "banana", "cherry"};
	        String[] strArr2 = {"apple", "banana", "cherry"};
	        String[] strArr3 = {"apple", "cherry", "banana"};
	        
	        System.out.println("strArr1 and strArr2 are equal: " + method(strArr1, strArr2)); // true
	        System.out.println("strArr1 and strArr3 are equal: " + method(strArr1, strArr3)); // false
		
		
	}
}
