package demo.command.receiver;

public class CeilingFan {
	public static final int HIGH = 3;
	public static final int MED = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;

	int speed;
	String location;
	
	public CeilingFan( String location) {
		super();
		this.speed = OFF;
		this.location = location;
	}

	public int getSpeed() {
		return this.speed;
	}
	
	public void high() {
		this.speed = HIGH;
		System.out.println("high!");
	}
	public void med() {
		this.speed = MED;
	}
	public void low() {
		this.speed = LOW;
	}
	public void off() {
		this.speed = OFF;
		System.out.println("off!");
	}
	
}
