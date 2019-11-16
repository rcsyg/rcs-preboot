package lv.accenture.preboot.oop;

public class OOPContinueExample {

	public static void main(String[] args) {
		
		int i = 5;
		
		Cat prince = new Cat("Prince", "White", 7);
		Cat muris = new Cat("Muris", "Black", 5);
		
		/*System.out.println("Cat name : " + prince.name);
		System.out.println("Cat color : " + prince.color);
		System.out.println("Cat age : " + prince.ageYears + " years");
		
		System.out.println("\n");
		
		System.out.println("Cat name : " + muris.name);
		System.out.println("Cat color : " + muris.color);
		System.out.println("Cat age : " + muris.ageYears + " years");*/
		System.out.println("\n");
		
		prince.sleep();
		muris.eat("fish");
		
		Mouse[] todayCatch = prince.huntMouses();
		System.out.println(prince.name + " today's catch : " + todayCatch.length + " mouses");
	
		System.out.println("\n");
		
		Dog reksis = new Dog("Reksis", "brown", 3);
		System.out.println("Dog name : " + reksis.name);
		System.out.println("Dog color : " + reksis.color);
		System.out.println("Dog age : " + reksis.ageYears + " years");
		
		reksis.chaseCar("BF-3534");
		reksis.catchAnimal(muris);
	
	}
}

