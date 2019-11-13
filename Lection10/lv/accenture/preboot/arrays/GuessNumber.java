package lv.accenture.preboot.arrays;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		/*
		 * Create scanner for user input
		 * Generate random number for game
		 * boolean success = false
		 * while !success
		 * 
		 * 		Print invitation to guess
		 * 		Read user input (int userGuess = scanner.nextInt())
		 * 		if userGuess is valid
		 * 			if userGuess == random
		 * 				Print congratulations;
		 * 				success = true;
		 * 			else if userGuess < random 
		 * 				Print "try higher"
		 * 			else 
		 * 				Print "try lower"
		 * 		else
		 * 			Print input is invalid  	 
		 * */
		
		Scanner sc = new Scanner(System.in);
		int r = new Random().nextInt(10) + 1;
		//boolean success = false;

		System.out.println("Guess number [1 - 10]:");
		while (/*!success*/ true) {
			int userGuess = sc.nextInt();
			if (userGuess >= 1 && userGuess <= 10) {
				if (userGuess == r) {
					System.out.println("Success!");
					//success = true;
					break;
				} else if (userGuess < r) {
					System.out.println("Try higher!");
				} else {
					System.out.println("Try lower!");
				}
			} else {
				System.out.println("Invalid input! Try again.");
			}

		}
	

	}

}
