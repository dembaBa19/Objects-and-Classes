package oop;

public class RegularPolygonTest {

	public static void main(String[] args) {
		RegularPolygon p1 = new RegularPolygon();
		RegularPolygon p2 = new RegularPolygon(6,4);
		RegularPolygon p3 = new RegularPolygon(10,4,5.6,7.8);
		displayPolygon(p1);
		displayPolygon(p2);
		displayPolygon(p3);
	}
	static void displayPolygon(RegularPolygon p) {
		System.out.println("The perimeter is: "  + p.getPerimeter() + ". The area is: " + p.getArea() + ".");
	}

}
