package oop;

public class FanTest {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan();
		fan1.setSwithedOn(true);
		fan1.setRadius(10);
		fan1.setSpeed(3);
		fan1.setColour("yellow");
		fan2.setSpeed(2);
		fan2.setRadius(5);
		System.out.println(fan1.ConvertToString());
		System.out.println(fan2.ConvertToString());
	}
}
