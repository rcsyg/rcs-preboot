import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ievedatien nelielu (1-10) skaitli : ");
		int limit = scanner.nextInt();
		
		int i = 1;
		int result = 1;
		while(i <= limit) {
			result = result * i;
			i++;
		}
		
		System.out.println("Skaitla " + limit + " faktorials ir " + result);
	}
	
}
