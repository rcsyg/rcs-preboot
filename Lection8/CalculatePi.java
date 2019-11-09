
public class CalculatePi {

	public static void main(String[] args) {
		
		// Generate +1 -3 +5 -7 +9 -11 ... sequence
		// Index     0  1  2  3  4   5
		
		/*
		int sum = 0;
		for(int i =0; i<10; i++) {
			sum = sum +i;
		}*/
		
		double sum = 0;
		for (int i = 1, j = 0; i <= 100000; i += 2, j++) {
			double division = (1 / (double) i);
			if (j % 2 == 0) {
				sum = sum + division;
			} else {
				sum = sum - division;
			}
		}
		
		double pi = 4 * sum;
		System.out.println("Pi : " + pi);

	}

}
