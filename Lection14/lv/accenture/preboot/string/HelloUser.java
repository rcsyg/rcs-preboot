package lv.accenture.preboot.string;

import java.util.Scanner;

public class HelloUser {

	public static void main(String[] args) {
		String example = "   jOhN lemOn HooK Kukainis  ";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter name and surname: ");
		String fullName = sc.nextLine();

		fullName = fullName.trim();
		
		String[] splitted = fullName.split(" ");
		if(splitted.length < 2) {
			System.out.println("Insufficient data");
		} else {
			String name = splitted[0];
			String firstLetterCapitalized = name.substring(0, 1).toUpperCase();
			String restOfTheName = name.substring(1).toLowerCase();
			System.out.print("'" + firstLetterCapitalized + restOfTheName + " ");
			
			for(int i=1; i<splitted.length; i++) {
				String surname = splitted[i];
				System.out.print(surname.toUpperCase());
				if(i < splitted.length - 1) {
					System.out.print("-");
				}
			}
			
			System.out.print("'");
		}
		
	}

}
