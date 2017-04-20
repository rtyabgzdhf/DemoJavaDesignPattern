package demo.factory.store.impl;

import demo.factory.pizza.Pizza;
import demo.factory.pizza.impl.CHPizzaTypeA;
import demo.factory.pizza.impl.CHPizzaTypeB;
import demo.factory.pizza.impl.CHPizzaTypeC;
import demo.factory.store.PizzaStore;

public class CHPizzaStore extends PizzaStore {
	Pizza pizza;
	@Override
	public Pizza createPizza(String type) {
		// TODO Auto-generated method stub
		if("typeA".equalsIgnoreCase(type)){
			this.pizza = new CHPizzaTypeA();
		}
		else if("typeB".equalsIgnoreCase(type)) {
			this.pizza = new CHPizzaTypeB();
		}
		else if("typeC".equalsIgnoreCase(type)) {
			this.pizza = new CHPizzaTypeC();
		}
		else this.pizza = null;
		return this.pizza;
	}

}
