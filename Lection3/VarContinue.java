public class VarContinue {
    public static void main(String[] args){
	//byte b = (byte) 200;
	//b = (byte) (b + 100);
	//System.out.println(b);

	//System.out.println("BMax : " + Byte.MAX_VALUE);
	//System.out.println("BMin : " + Byte.MIN_VALUE);

	//System.out.println("SMax : " + Short.MAX_VALUE);
	//System.out.println("SMin : " + Short.MIN_VALUE);

	//System.out.println("IMax : " + Integer.MAX_VALUE);
	//System.out.println("IMin : " + Integer.MIN_VALUE);

	//int i = 5;
	//short s = (short) i;
	//System.out.println(s);

	//i = s;

	//char c = 65;
	//System.out.println(c);

	//boolean b = true;
	//b = (boolean) i;

	int first = 25;
	int second = 7;

	int result = first + second;
	System.out.println("Result(+) : " + result);

	result = first - second;
	System.out.println("Result(-) : " + result);

	result = first * second;
	System.out.println("Result(*) : " + result);

	result = first % second;
	System.out.println("Result(%) : " + result);

	double third = 7d;
	double dResult = 10 / 3.0;
	System.out.println("Result(d/) : " + dResult);

	System.out.println("\n\n\n");

	int i = 0;
	i = i + 1;
	System.out.println("i(1) : " + i);
	System.out.println("i(2) : " + (i++));
	System.out.println("i(3) : " + i);
	System.out.println("i(4) : " + (i--));
	System.out.println("i(5) : " + i);

	boolean boo = true;
	System.out.println("boo : " + boo);
	boo = (3 <= 5);
	System.out.println("boo : " + boo);
	boo = (3 >= 5);
	System.out.println("boo : " + boo);
	boo = (3 != 5);
	System.out.println("boo : " + boo);
	boo = (3 == 5);
	System.out.println("boo : " + boo);

}
}

