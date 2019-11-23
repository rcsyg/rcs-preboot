package lv.accenture.preboot.collections;

public class CollectionTest {

	public static void main(String[] args) {
		AwesomeList list = new AwesomeList();
		list.add(3);
		list.add(5);
		list.add(7);
		list.add(11);
		list.add(13);
		list.add(17);
		
		list.printSelf();
		
		System.out.println("\n");
		System.out.println("Element by index 3 : " + list.get(3));
		
		list.remove(5);
		list.printSelf();
		
		System.out.println("\n");
		
		list.add(23);
		list.printSelf();
	}

}
