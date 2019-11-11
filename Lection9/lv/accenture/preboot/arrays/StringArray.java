package lv.accenture.preboot.arrays;

public class StringArray {

	public static void main(String[] args) {
		String[] arrstr = {"Hello", "World!"};
		
		for(int i = 0; i<arrstr.length; i++) {
			System.out.print(arrstr[i] + " ");
		}
		
		long a = 5L;
		int b = (int) a;
		a = b;
		
		int[] arr = new int[1];
		long[] arr2 = new long[1];
		
		arr[0] = (int) 5L;
		arr2[0] = 3;
		
		//arr = (int[]) arr2;

	}

}
