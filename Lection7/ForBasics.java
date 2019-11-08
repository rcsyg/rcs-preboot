
public class ForBasics {

	public static void main(String[] args) {
		
		/*int i = 0;
		while (i < 10) {
			System.out.print(i + " ");
			i++;
		}*/
		
		/*for (int i=0, j = 0; i<10; i++, j+=2) {
			System.out.print(i + " - " + j + " | ");
		}*/
		
		/*System.out.println("Before");
		for (int i=0, j = 0; i<10 && j<10; i++, j+=2) {
			System.out.println("Inside");
		}
		System.out.println("After");*/
		
		for(int i = 0;i < 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");
		
		/* 1 */
		for(int i = 9;i >= 0; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println("\n");

		/* 2 */
		for(int i = 0;i < 10; i++) {
			System.out.print((9 - i) + " ");
		}
		
	}

}
