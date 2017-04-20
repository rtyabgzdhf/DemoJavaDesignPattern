package demo.factory.pizza.impl;

import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.pizza.Pizza;

public class CAPizzaTypeA extends Pizza {
	PizzaIngredientFactory factory;
	public CAPizzaTypeA(PizzaIngredientFactory f) {
		super();
		// TODO Auto-generated constructor stub
		this.factory = f;
	}
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		System.out.println("prepare:" + this.getType());
		this.dough = factory.createDough();
		this.sauce = factory.createSauce();
		this.cheese = factory.createCheese();
	}
}
