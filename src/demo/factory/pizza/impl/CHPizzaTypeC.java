package demo.factory.pizza.impl;

import demo.factory.pizza.Pizza;

public class CHPizzaTypeC extends Pizza {
	public CHPizzaTypeC() {
		super();
		// TODO Auto-generated constructor stub
		this.setType("Ch type C");
	}
	public void cut() {
		System.out.println("cut following to CH style");
	}
}
