package oop;

public class RegularPolygon {
	private int n = 3;
	private double sideLength = 1;
	private double x = 0;
	private double y = 0;
	RegularPolygon() {
		//default values
	}
	RegularPolygon(int num, double dylv){
		this.n = num;
		this.sideLength = dylv;
	}
	RegularPolygon(int num, double dylv, double xx, double yy) {
		this.n = num;
		this.sideLength = dylv;
		this.y = yy;
		this.x = xx;
	}
	void setBrojStrani(int newBrojStrani) {
		this.n = newBrojStrani;
	}
	void setDylvinaStrana(int newDylvinaStrana) {
		this.sideLength = newDylvinaStrana;
	}
	void setX(int xx) {
		this.x = xx;
	}
	void setY(int yy) {
		this.y = yy;
	}
	int getN() {
		return this.n;
	}
	double getSideLength() {
		return this.sideLength;
	}
	double getX() {
		return this.x;
	}
	double getY() {
		return this.y;
	}
	double getPerimeter() {
		return n*sideLength;
	}
	double getArea() {
		double a = Math.toRadians(180/n);
		return (n*sideLength*sideLength)/(4*Math.tan(a));
	}
}