package lv.accenture.preboot.string;

public class CapitalizeEachWord {

	public static void main(String[] args) {
		String s = "The quick brown fox jumps over the lazy dog.";
		
		//Splits a text into word array
		String[] splitted = s.split(" ");
		for (int i = 0; i < splitted.length; i++) {
			// System.out.print(splitted[i] + " ");
			String word = splitted[i];
			String capitalized = word.substring(0, 1).toUpperCase();
			System.out.print(capitalized);
			System.out.print(word.substring(1) + " ");
		}

	}

}
