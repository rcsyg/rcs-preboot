package lv.accenture.preboot.oop;

import java.util.Random;

public class Dog {

	String name;
	String color;
	int ageYears;
	
	Dog(String name, String color, int ageYears) {
		this.name = name;
		this.color = color;
		this.ageYears = ageYears;
	}
	
	void chaseCar(String stateNumber) {
		System.out.println(name + " is chasing car with # " + stateNumber);
	}
	
	void catchAnimal(Mouse mouse) {
		int r = new Random().nextInt(5);
		if (r < 4) {
			System.out.println(name + " caught mouse " + mouse + "!");
		} else {
			System.out.println("Task failed.");
		}
	}
	
	void catchAnimal(Cat cat) {
		int r = new Random().nextInt(2);
		if (r == 1) {
			System.out.println(name + " caught cat " + cat.name + "!");
		} else {
			System.out.println("Task failed.");
		}
	}
	
}
