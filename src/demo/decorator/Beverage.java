package demo.decorator;

public abstract class Beverage {
	String desc = "unknown Beverage";
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public abstract double cost();
}
