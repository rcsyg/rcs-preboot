package lv.accenture.preboot.oop;

import java.util.Scanner;

public class SquareEquation {

	/*
	*
	* 	x^2 + 3x -4 = 0 (2 saknes)

		x^2 + 12x +36 = 0 (1 sakne)

		5x^2 + 3x + 7 = 0 (nav saknes)

		------------------------------

		D = b^2 - 4*a*c

		x1 = (-b - Sqrt(D)) / 2a
		x2 = (-b + Sqrt(D)) / 2a
	*
	* */
	
	void calculate(double a, double b, double c) {
		double d = Math.pow(b, 2) - 4 * a * c;
		if (d > 0) {
			double x1 = (-b - Math.sqrt(d)) / (2 * a);
			double x2 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("x1 : " + x1 + " | x2: " + x2);
		} else if (d == 0) {
			double x = (-b) / (2 * a);
			System.out.println("Only root x : " + x);
		} else {
			System.out.println("Sorry, no roots");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first coefficient : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter second coefficient : ");
		double b = sc.nextDouble();
		
		System.out.println("Enter third coefficient : ");
		double c = sc.nextDouble();
		
		SquareEquation squareEquation = new SquareEquation();
		squareEquation.calculate(a, b, c);

	}

}
