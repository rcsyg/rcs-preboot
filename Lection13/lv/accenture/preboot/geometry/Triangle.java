package lv.accenture.preboot.geometry;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;
	
	public Triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double perimeter() {
		Line ab = new Line(a,b);
		double abLength = ab.length();
		
		Line ac = new Line(a,c);
		double acLength = ac.length();
		
		Line bc = new Line(b,c);
		double bcLength = bc.length();
		
		double result = abLength + acLength + bcLength;
		
		return result;
	}
	
	public double area() {
		
		Line ab = new Line(a,b);
		double abLength = ab.length();
		
		Line ac = new Line(a,c);
		double acLength = ac.length();
		
		Line bc = new Line(b,c);
		double bcLength = bc.length();
		
		double halfPerimter = perimeter() / 2;
		
		double area = Math.sqrt(halfPerimter * 
				(halfPerimter - abLength) * 
				(halfPerimter - acLength) *
				(halfPerimter - bcLength)
		);
		
		return area;
	}

}
