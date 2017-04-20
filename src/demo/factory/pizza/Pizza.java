package demo.factory.pizza;

public abstract class Pizza {
	String type;
	String dough;
	String sauce;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getDough() {
		return dough;
	}
	public void setDough(String dough) {
		this.dough = dough;
	}
	public String getSauce() {
		return sauce;
	}
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	public void prepare(){
		System.out.println("->");
		System.out.println("prepare pz");
	}
	public void bake(){
		System.out.println("bake pz");
	}
	public void cut(){
		System.out.println("cut pz");
	}
	public void box(){
		System.out.println("box pz");
	}
	
}
