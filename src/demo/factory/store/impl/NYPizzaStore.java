package demo.factory.store.impl;

import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.ingredient.factory.impl.NYIngreFactory;
import demo.factory.pizza.Pizza;
import demo.factory.pizza.impl.NYPizzaTypeA;
import demo.factory.pizza.impl.NYPizzaTypeB;
import demo.factory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory  ingreFactory = new NYIngreFactory();
		if("typeA".equalsIgnoreCase(type)) {
			pizza = new NYPizzaTypeA(ingreFactory);
			pizza.setType("NY type A");
		}
		if("typeB".equalsIgnoreCase(type)) {
			pizza = new NYPizzaTypeB(ingreFactory);
			pizza.setType("NY type B");
		}
		
		return pizza;
	}

}
