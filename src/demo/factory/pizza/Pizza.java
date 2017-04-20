package demo.factory.pizza;

import demo.factory.ingredient.cheese.Cheese;
import demo.factory.ingredient.dough.Dough;
import demo.factory.ingredient.sauce.Sauce;

public abstract class Pizza {
	String type;
	public Dough dough;
	public Sauce sauce;
	public Cheese cheese;
	

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public abstract void prepare();

	public void bake() {
		System.out.println("bake pz");
	}

	public void cut() {
		System.out.println("cut pz");
	}

	public void box() {
		System.out.println("box pz");
	}

}
