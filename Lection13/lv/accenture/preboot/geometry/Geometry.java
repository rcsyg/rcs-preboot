package lv.accenture.preboot.geometry;

public class Geometry {

	public static void main(String[] args) {
		
		Point a = new Point(1, 1);
		Point b = new Point(5, 2);
		
		Line ab = new Line(a, b);

		ab.printSelf();
		
		System.out.println("AB line length : " + ab.length());
	}

}
