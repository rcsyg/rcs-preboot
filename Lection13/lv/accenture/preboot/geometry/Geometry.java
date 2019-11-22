package lv.accenture.preboot.geometry;

public class Geometry {

	public static void main(String[] args) {
		
		Point a = new Point(1, 1);
		Point b = new Point(5, 2);
		Point c = new Point(3, 5);
		
		Line ab = new Line(a, b);

		ab.printSelf();
		
		System.out.println("AB length : " + ab.length());
		
		Triangle abc = new Triangle(a, b, c);
		System.out.println("ABC perimeter : " + abc.perimeter());
		
		double abcArea = abc.area();
		System.out.println("ABC area : " + abcArea);
	}

}
