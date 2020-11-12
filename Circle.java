package oop;

public class Circle {
	public double radius;
	
	public Circle() {
		radius = 1;
	}
	
	public Circle(double newRadius) {
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
