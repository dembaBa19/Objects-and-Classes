package oop;

public class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	private int speed = this.SLOW;
	private boolean switchedOn = false;
	private double radius = 5.0;
	private String colour = "blue";
	void setSpeed(int newSpeed) {
		this.speed = newSpeed;
	}
	void setSwithedOn(boolean OnOff) {
		this.switchedOn = OnOff;
	}
	void setRadius(double newRadius) {
		this.radius = newRadius;
	}
	void setColour(String newColour) {
		this.colour = newColour; 
	}
	int getSpeed() {
		return this.speed;
	}
	boolean getSwithedOn() {
		return this.switchedOn;
	}
	double getRadius() {
		return this.radius;
	}
	String getColour() {
		return this.colour;
	}
	String ConvertToString() {
		String speed1 = Integer.toString(speed);
		String radius1 = Double.toString(radius);
		if (switchedOn) {
			return ("The speed is " + speed1 + ". The radius is " + radius1 + ". The colour is " + colour + "."); 
		} else {
			return ("It's switched off. The radius is " + radius1 + ". The colour is " + colour + "."); 
		}
	}
}