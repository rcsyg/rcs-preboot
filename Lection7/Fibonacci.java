
public class Fibonacci {

	public static void main(String[] args) {
		
		// Fibonacci
		// 0 1 1 2 3 5 8 13
		
		int f1 = 0;
		int f2 = 1;
		int limit = 10;
		
		for(int i = 0; i<limit; i++) {
			int sum = f1 + f2;
			System.out.print(sum + " ");
			f1 = f2;
			f2 = sum;
		}
	}

}
