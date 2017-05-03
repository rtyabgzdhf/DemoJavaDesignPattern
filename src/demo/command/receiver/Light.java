package demo.command.receiver;

public class Light {
	String name;
	public Light(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public Light() {
		this.name = "";
	}
	public void on() {
		System.out.println(this.name + " light on");
	}
	public void off() {
		System.out.println(this.name + " light off");
	}
}
