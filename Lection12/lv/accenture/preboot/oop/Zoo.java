package lv.accenture.preboot.oop;

public class Zoo {

	public static void main(String[] args) {
		Cat prince = new Cat("Prince", "White", 7);
		Dog reksis = new Dog("Reksis", "brown", 3);
		
		Mouse some = new Mouse(); 
		Mouse jerry = new Mouse("Jerry"); 
		Mouse mickey = new Mouse("Mickey", true); 
		
		//reksis.catchAnimal(jerry);
		//reksis.catchAnimal(prince);
		
		prince.performAction();
		
	}

}
