package demo.factory;

import demo.factory.pizza.Pizza;
import demo.factory.store.PizzaStore;
import demo.factory.store.impl.CAPizzaStore;
import demo.factory.store.impl.CHPizzaStore;
import demo.factory.store.impl.NYPizzaStore;

public class PizzaMainSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStore nystore = new NYPizzaStore();
		Pizza pizza = nystore.orderPizza("typeA");
		System.out.println("Pz:" + pizza.getType() + " - " + pizza.dough.getIngreType() + " - " + pizza.sauce.getIngreType() + " - " + pizza.cheese.getIngreType());
		pizza = nystore.orderPizza("typeB");
		System.out.println("Pz:" + pizza.getType() + " - " + pizza.dough.getIngreType() + " - " + pizza.sauce.getIngreType() + " - " + pizza.cheese.getIngreType());

		System.out.println("------------");
		PizzaStore chStore = new CHPizzaStore();
		pizza = chStore.orderPizza("typeA");
		System.out.println("Pz:" + pizza.getType() + " - " + pizza.dough.getIngreType() + " - " + pizza.sauce.getIngreType() + " - " + pizza.cheese.getIngreType());
		// pizza = chStore.orderPizza("typeB");
		// System.out.println("Pz:" + pizza.getType() + " - " + pizza.getDough() + " - " + pizza.getSauce() );
		// pizza = chStore.orderPizza("typeC");
		// System.out.println("Pz:" + pizza.getType() + " - " + pizza.getDough() + " - " + pizza.getSauce() );
		
		System.out.println("------------");
		PizzaStore caStore = new CAPizzaStore();
		pizza = caStore.orderPizza("typeA");
		System.out.println("Pz:" + pizza.getType() + " - " + pizza.dough.getIngreType() + " - " + pizza.sauce.getIngreType() + " - " + pizza.cheese.getIngreType());
	}

}
