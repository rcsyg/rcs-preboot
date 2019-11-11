package lv.accenture.preboot.arrays;

public class MultiplyingTable {

	public static void main(String[] args) {
		/* 
		 * define int[][] of size 9x9
		 * for i 0..8
		 * 		for j 0..8
		 * 			int res = (i + 1) * (j + 1)
		 * 			assign res to arr[i][j]
		 * 
		 * for i 0..8
		 * 		for j 0..8
		 * 			print arr[i][j]
		 * 		println()
		 *  */
		
		int[][] arr = new int[9][9];
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				int res = (i + 1) * (j + 1);
				arr[i][j] = res;
			}
		}
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = 0; j<arr[i].length; j++) {
				int result = arr[i][j];
				if (result < 10) {
					System.out.print(" ");
				}
				System.out.print(result + " ");
			}
			System.out.println("");
		}

	}

}
