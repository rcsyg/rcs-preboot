package lv.accenture.preboot.arrays;

public class ArrayColumn {

	public static void main(String[] args) {
		
		char[][] greeting = new char[][] {
			{'h', 'e', 'l', 'l', 'o'},
			{'w', 'o', 'r', 'l', 'd', '!'},
			{'a', 'n', 'd'},
			{'g', 'o', 'o', 'd', 'b', 'y', 'e', '!'},
		};
		
		/* 
		 * for 0 .. i (rindu skaits)
		 * 		print greeting[i][2]		
		 *  
		 *  */
		
		for (int i = 0; i < greeting.length; i++) {
			System.out.print(greeting[i][2]);
		}
		
		System.out.println("\n");
		
		for (int i = 0; i < greeting.length; i++) {
			System.out.print(greeting[i].length + " ");
		}
		
		
	}

}
