package oop;

public class Circle12 {
	private double radius;
	
	public Circle12() {
		radius = 1;
	}
	
	public Circle12(double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
}
