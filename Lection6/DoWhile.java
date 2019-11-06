
public class DoWhile {

	public static void main(String[] args) {
		int i = 0;
		//int i = 6;

		while (i < 5) {
			System.out.print(i + " ");
			i++;
		}

		System.out.println("\n");
		i = 6;

		do {
			System.out.print(i + " ");
			i++;
		} while (i < 5);

	}

}
