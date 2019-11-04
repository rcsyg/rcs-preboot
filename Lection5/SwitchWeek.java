import java.util.Scanner;

public class SwitchWeek {

	public static void main(String[] args) {
		System.out.println("Ievadiet datus: ");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		/*if (userInput == 1) {
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
		} */
		
		
		
		boolean workingDay = false;
		boolean holiday = false;
		String result = "";
		switch(userInput) {
			case 1: 
				result = "Pirmdiena";
				workingDay = true;
				break;
			case 2: 
				result = "Otrdiena";
				workingDay = true;
				break;
			case 3: 
				result = "Treshdiena";
				workingDay = true;
				break;
			case 4: 
				result = "Ceturtdiena";
				workingDay = true;
				break;
			case 5: 
				result = "Piektiena";
				workingDay = true;
				break;
			case 6: 
				result = "Sestdiena";
				holiday = true;
				break;
			case 7: 
				result = "Svetdiena";
				holiday = true;
				break;
			default:
				result = "Invalid date";

		}
		System.out.println("Diena : " + result);
		if(workingDay) {
			System.out.println("Darbadiena");
		} else if (holiday) {
			System.out.println("Briivdiena");
		}
		
		/*char c = 'b';
		switch(c) {
			case 'a' :
				System.out.println("AAA");
				break;
			case 'b' :
				System.out.println("BBB");
				break;
			case 'c' :
				System.out.println("CCC");
				break;
			default :
				System.out.println("WAT?!");
			
		}*/

	}

}
