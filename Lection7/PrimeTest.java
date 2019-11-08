import java.util.Scanner;

public class PrimeTest {

	public static void main(String[] args) {
		System.out.println("Enter number to test : ");
		int userInput = new Scanner(System.in).nextInt();

		boolean isPrime = true;
		for (int i = 2; i < userInput / 2; i++) {
			if (userInput % i == 0) {
				isPrime = false;
				//i = userInput + 1;
				break;
			}
		}

		if (isPrime) {
			System.out.println(userInput + " is prime!");
		} else {
			System.out.println(userInput + " is not prime!");
		}

	}

}
