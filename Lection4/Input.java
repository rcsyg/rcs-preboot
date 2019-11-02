import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ievadiet integer: ");
		int userInput = sc.nextInt();
		
		System.out.println("Ievadiet double: ");
		double userDouble = sc.nextDouble();
		
		System.out.println("Ievadiet boolean: ");
		boolean userBoolean = sc.nextBoolean();
		
		System.out.println("Ievadiet tekstu: ");
		String userText = sc.next();
		
		System.out.println("User integer : " + userInput);
		System.out.println("User double : " + userDouble);
		System.out.println("User boolean : " + userBoolean);
		System.out.println("User text : " + userText);
		
		sc.close();
		
		sc.nextInt();

	}

}
