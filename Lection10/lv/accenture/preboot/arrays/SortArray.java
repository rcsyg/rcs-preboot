package lv.accenture.preboot.arrays;

import java.util.Random;
import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
		/*
		 * Ask user to enter array length
		 * read user input for array length
		 * initialize int[] arr with user-defined length
		 *
		 * for i 0 .. arr.length
		 * 		arr[i] = random();
		 * 
		 * for i 0 .. arr.length
		 * 		print arr[i] + ", "
		 * 
		 * for i 0 .. (arr.lengh - 1) 
		 * 		int min = arr[i]; 
		 * 		int minIndex = i;
		 * 		for j i .. arr.lengh
		 * 			if(arr[j] < min) 
		 * 				min = arr[j]
		 * 				minIndex = j
		 * 		int temp = arr[i]
		 * 		arr[i] = arr[minIndex]
		 * 		arr[minIndex] = temp
		 * 
		 */
		
		System.out.println("Enter array length :");
		Scanner sc = new Scanner(System.in);
		int arrLength = sc.nextInt();

		int[] arr = new int[arrLength];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < arr.length - 1; i++) {
			
			int min = arr[i];
			int minIndex = i;
			for (int j = i; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

}
