package demo.factory.store.impl;

import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.ingredient.factory.impl.CHIngreFactory;
import demo.factory.pizza.Pizza;
import demo.factory.pizza.impl.CHPizzaTypeA;
import demo.factory.pizza.impl.CHPizzaTypeB;
import demo.factory.pizza.impl.CHPizzaTypeC;
import demo.factory.store.PizzaStore;

public class CHPizzaStore extends PizzaStore {
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		Pizza pizza = null;
		PizzaIngredientFactory  ingreFactory = new CHIngreFactory();
		if("typeA".equalsIgnoreCase(type)) {
			pizza = new CHPizzaTypeA(ingreFactory);
			pizza.setType("CH type A");
		}
		if("typeB".equalsIgnoreCase(type)) {
			pizza = new CHPizzaTypeB(ingreFactory);
			pizza.setType("CH type B");
		}
		if("typeC".equalsIgnoreCase(type)) {
			pizza = new CHPizzaTypeC(ingreFactory);
			pizza.setType("CH type C");
		}
		return pizza;
	}

}
