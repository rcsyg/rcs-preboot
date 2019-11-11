package lv.accenture.preboot.arrays;

public class Array2D {

	public static void main(String[] args) {
		char[][] greeting = new char[][] {
				{'h', 'e', 'l', 'l', 'o'},
				{'w', 'o', 'r', 'l', 'd', '!'},
				{'a', 'n', 'd'},
				{'g', 'o', 'o', 'd', 'b', 'y', 'e', '!'},
		};
		
		//char[] thirdRow = greeting[2];
		
		greeting[0][0] = 'H';
		greeting[3][5] = 'Y';
		
		for (int i = 0; i < greeting.length; i++) {
			char[] row = greeting[i];
			
			for (int j = 0; j < row.length; j++) {
				System.out.print(row[j]);
			}
			
			System.out.print(" ");
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < greeting.length; i++) {
			for (int j = 0; j < greeting[i].length; j++) {
				System.out.print(greeting[i][j]);
			}
			System.out.print(" ");
		}
		
		System.out.println("\n");
		
		char[] and = greeting[2];
		for (int j = 0; j < and.length; j++) {
			System.out.print(and[j]);
		}

	}

}
