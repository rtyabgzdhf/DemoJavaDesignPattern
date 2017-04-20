package demo.factory.store.impl;

import demo.factory.pizza.Pizza;
import demo.factory.pizza.impl.NYPizzaTypeA;
import demo.factory.pizza.impl.NYPizzaTypeB;
import demo.factory.store.PizzaStore;

public class NYPizzaStore extends PizzaStore {
	Pizza pizza;
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if("typeA".equalsIgnoreCase(type)){
			this.pizza = new NYPizzaTypeA();
		}
		else if("typeB".equalsIgnoreCase(type)) {
			this.pizza = new NYPizzaTypeB();
		}
		else this.pizza = null;
		return this.pizza;
	}

}
