
public class LoopBasics {

	public static void main(String[] args) {

		int i = 1;
		while (i < 10) {
			int j = 1;
			while (j < 10) {
				System.out.print((i * j) + " ");
				j++;
			}
			System.out.print("\n");
			i++;
		}
		
		

	}

}
