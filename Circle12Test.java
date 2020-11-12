package oop;

public class Circle12Test {

	public static void main(String[] args) {
		Circle12 c1 = new Circle12();
		System.out.println("Area of c1 " + c1.getArea() + ", perimeter of c1 " + c1.getPerimeter());
		
		Circle12 c2 = new Circle12(5);
		System.out.println("Area of c2 " + c2.getArea() + ", perimeter of c2 " + c2.getPerimeter());
		
		c1.setRadius(10);
		System.out.println("Area of c1 " + c1.getArea() + ", perimeter of c1 " + c1.getPerimeter());
		
	}

}
