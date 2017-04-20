package demo.factory.store.impl;

import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.ingredient.factory.impl.CAIngreFactory;
import demo.factory.pizza.Pizza;
import demo.factory.pizza.impl.CAPizzaTypeA;
import demo.factory.store.PizzaStore;

public class CAPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory  ingreFactory = new CAIngreFactory();
		if("typeA".equalsIgnoreCase(type)) {
			pizza = new CAPizzaTypeA(ingreFactory);
			pizza.setType("CA type A");
		}	
		return pizza;
	}

}
