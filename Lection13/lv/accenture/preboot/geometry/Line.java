package lv.accenture.preboot.geometry;

public class Line {
	private Point start;
	private Point end;
	
	public Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	public void printSelf() {
		System.out.println("a[x]: " + start.getX() + " a[y]: " + start.getY());
		System.out.println("b[x]: " + end.getX() + " b[y]: " + end.getY());
	}
	
	public double length() {
		int diffX = end.getX() - start.getX();
		int diffY = end.getY() - start.getY();
		double catet1Square = Math.pow(diffX, 2); // diffX * diffX
		double catet2Square = Math.pow(diffY, 2); // diffY * diffY
		double result = Math.sqrt(catet1Square + catet2Square);
		return result;
	}
	
	
}
