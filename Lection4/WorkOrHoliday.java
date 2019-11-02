import java.util.Scanner;

public class WorkOrHoliday {
	public static void main(String[] args) {
		System.out.println("Dienas kaartas numurs: ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		if (userInput >= 1 && userInput <= 7) {
			if (userInput <= 5) {
				System.out.println("Darba diena");
			} else {
				System.out.println("Brivdiena");
			}
		} else {
			System.out.println("Nav tadas dienas");
		}
	}
}
