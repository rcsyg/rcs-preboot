package lv.accenture.preboot.arrays;

public class ArrayBasicPractise {

	public static void main(String[] args) {
		int[] arr = { 4, -12, 7, 9, 8, 14, -25, 5, 7 };
		
		int min = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min of array : " + min);
		
		int max = arr[0];
		for(int i = 1; i < arr.length; i++ ) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max of array : " + max);
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++ ) {
			sum = sum + arr[i];
		}
		System.out.println("Sum of array : " + sum);
		
		int searched = 13;
		boolean hasMatch = false;
		for(int i = 0; i < arr.length; i++ ) {
			if(searched == arr[i]) {
				System.out.println("Index : " + i);
				hasMatch = true;
			} 
		}
		
		if(!hasMatch) {
			System.out.println("Not found (-1)");
		}
		
	}

}
