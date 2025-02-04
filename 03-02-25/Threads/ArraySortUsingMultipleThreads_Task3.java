package Threads;

import java.util.Arrays;

//3. Write a Java program that sorts an array of integers using multiple threads.
public class ArraySortUsingMultipleThreads_Task3 {
	 
 
	    private int[] array;

	    public ArraySortUsingMultipleThreads_Task3 (int[] array) {
	        this.array = array;
	    }

	    public void sort() {
	        if (array.length < 2) {
	            return;
	        }
	        int mid = array.length / 2;
	        int[] left = Arrays.copyOfRange(array, 0, mid);
	        int[] right = Arrays.copyOfRange(array, mid, array.length);

	        Thread leftSorter = new Thread(() -> mergeSort(left));
	        Thread rightSorter = new Thread(() -> mergeSort(right));

	        leftSorter.start();
	        rightSorter.start();

	        try {
	            leftSorter.join();
	            rightSorter.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        merge(left, right);
	    }

	    private void mergeSort(int[] arr) {
	        if (arr.length < 2) {
	            return;
	        }
	        int mid = arr.length / 2;
	        int[] left = Arrays.copyOfRange(arr, 0, mid);
	        int[] right = Arrays.copyOfRange(arr, mid, arr.length);

	        mergeSort(left);
	        mergeSort(right);

	        mergeInternal(arr, left, right);
	    }

	    private void merge(int[] left, int[] right) {
	        mergeInternal(array, left, right);
	    }

	    private void mergeInternal(int[] result, int[] left, int[] right) {
	        int i = 0, j = 0, k = 0;
	        while (i < left.length && j < right.length) {
	            if (left[i] <= right[j]) {
	                result[k++] = left[i++];
	            } else {
	                result[k++] = right[j++];
	            }
	        }
	        while (i < left.length) {
	            result[k++] = left[i++];
	        }
	        while (j < right.length) {
	            result[k++] = right[j++];
	        }
	    }

	    public static void main(String[] args) {
	        int[] array = {12, 11, 13, 5, 6, 7};
	        System.out.println("Original Array: " + Arrays.toString(array));

	        ArraySortUsingMultipleThreads_Task3 sorter = new ArraySortUsingMultipleThreads_Task3(array);
	        sorter.sort();

	        System.out.println("Sorted Array: " + Arrays.toString(array));
	    }
	}

