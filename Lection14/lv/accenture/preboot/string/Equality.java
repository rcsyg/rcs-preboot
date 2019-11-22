package lv.accenture.preboot.string;

public class Equality {

	public static void main(String[] args) {
		String s1 = "password";
		String s2 = "pass";
		String s3 = "word";
		
		System.out.println("password" == "password");
		System.out.println("password".equals("password"));
		
		System.out.println(s1 == (s2 + s3));
		System.out.println(s1.equals(s2 + s3));

	}

}
