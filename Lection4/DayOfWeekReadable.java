import java.util.Scanner;

public class DayOfWeekReadable {

	public static void main(String[] args) {

		System.out.println("Ievadiet datus: ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		if (userInput == 1) {
			System.out.println("Pirmdiena");
		} else if (userInput == 2) {
			System.out.println("Otrdiena");
		} else if (userInput == 3) {
			System.out.println("Treshdiena");
		} else if (userInput == 4) {
			System.out.println("Ceturtdiena");
		} else if (userInput == 5) {
			System.out.println("Piektdiena");
		} else if (userInput == 6) {
			System.out.println("Sestdiena");
		} else if (userInput == 7) {
			System.out.println("Svetdiena");
		} else {
			System.out.println("Nav tadas dienas");
		}
	}

}
