package aps.lab.lab18;

public class Point {
	
	// Instance Variables
	private double x, y;
	
	// Constructors
	public Point() {
		setX(1);
		setY(1);
	}
	
	public Point(double x, double y) {
		this.setX(x);
		this.setY(y);
	}

	// Getters & Setters
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	// Methods
	public String toString() {
		return "(1, 2)";
	}
	
	public double distance(Point p) {
		return Math.sqrt(((p.x-this.x)*(p.x-this.x))+((p.y-this.y)*(p.y-this.y)));
	}
}
