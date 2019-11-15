package lv.accenture.preboot.oop;

public class OOPExample {

	public static void main(String[] args) {
		
		int i = 5;
		
		Cat prince = new Cat("Prince", "White", 7);
		Cat muris = new Cat("Muris", "Black", 5);
		
		System.out.println("Cat name : " + prince.name);
		System.out.println("Cat color : " + prince.color);
		System.out.println("Cat age : " + prince.ageYears + " years");
		
		System.out.println("Cat name : " + muris.name);
		System.out.println("Cat color : " + muris.color);
		System.out.println("Cat age : " + muris.ageYears + " years");
	}
}

