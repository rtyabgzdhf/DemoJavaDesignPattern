package demo.factory.store.impl;

import demo.factory.pizza.Pizza;
import demo.factory.pizza.impl.CAPizzaTypeA;
import demo.factory.store.PizzaStore;

public class CAPizzaStore extends PizzaStore {

	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if("typeA".equalsIgnoreCase(type)) {
			return new CAPizzaTypeA();
		}	
		return null;
	}

}
