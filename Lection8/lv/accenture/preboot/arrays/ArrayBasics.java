package lv.accenture.preboot.arrays;

public class ArrayBasics {

	public static void main(String[] args) {
		//int[] arr = new int[10];
		int[] arr2 = new int[] {1,3,5,2,4,6};
		
		///System.out.println("4th value : " + arr[3]);
		
		/*for(int i = 0 ; i < arr2.length ; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		System.out.println(arr2[arr2.length]);*/
		
		boolean[] arr3 = { true, false, true, false };
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i] + " ");
		}
		
		System.out.println("\n");
		
		char[] arr4 = { 'H', 'e', 'l', 'l', 'o' };
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]);
		}
		
		arr4[2] = 'L';
		arr4[3] = 'L';
		
		System.out.println("\n");
		
		for (int i = 0; i < arr4.length; i++) {
			System.out.print(arr4[i]);
		}
	}

}
