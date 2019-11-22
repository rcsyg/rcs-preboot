package lv.accenture.preboot.string;

public class StringExample {

	public static void main(String[] args) {
		String s = "Hello World!";

		System.out.println(s);
		
		String s1 = new String("Hello");
		char[] arr = {'w', 'o', 'r', 'l', 'd'};
		
		String s2 = new String(arr);
		
		String s3 = s1 + " " + s2;
		
		System.out.println(s3);
		
		System.out.println("Teksta garums : " + s3.length());
		
		String s5 = "       Janis      ";
		s5 = s5.trim();
		
		System.out.print(s5);
		System.out.println("|");
		
		String s6 = "The quick brown fox jumps over the lazy dog.";
		System.out.println(s6.substring(4));
		System.out.println(s6.substring(4, 19));
		
		System.out.println(s6.indexOf("fox"));
		
		String[] splitted = s6.split("o");
		System.out.println(splitted[3]);
		
		System.out.println(s6.charAt(14));
		
		
		
		
		
	}

}
