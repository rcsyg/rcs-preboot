package lv.accenture.preboot.oop;

import java.util.Random;

public class Cat {
	
	static int legCount = 4;
	
	String name;
	String color;
	int ageYears;
	
	Cat(String name, String color, int ageYears) {
		this.name = name;
		this.color = color;
		this.ageYears = ageYears;
	}
	
	void sleep() {
		System.out.println(name + " sleeps ^_^");
	}
	
	void eat(String something) {
		System.out.println(name + " eats " + something);
	}
	
	Mouse[] huntMouses() {
		int m = new Random().nextInt(3);
		Mouse[] catchedMouses = new Mouse[m];
		for (int i = 0; i < catchedMouses.length; i++) {
			catchedMouses[i] = new Mouse();
		}
		return catchedMouses;
	}
	
	void performAction() {
		int r = new Random().nextInt(2);
		if (r == 1) {
			sleep();
		} else {
			eat("my hand");
		}
	}
	

}
