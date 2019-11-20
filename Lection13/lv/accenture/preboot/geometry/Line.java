package lv.accenture.preboot.geometry;

public class Line {
	private Point a;
	private Point b;
	
	public Line(Point a, Point b) {
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}
	
	public void printSelf() {
		System.out.println("a[x]: " + a.getX() + " a[y]: " + a.getY());
		System.out.println("b[x]: " + b.getX() + " b[y]: " + b.getY());
	}

	public double length() {
		return 0d;
	}
	
	
}
