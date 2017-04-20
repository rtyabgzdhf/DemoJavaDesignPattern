package demo.factory.ingredient.factory.impl;

import demo.factory.ingredient.cheese.Cheese;
import demo.factory.ingredient.cheese.impl.MozzarellaCheese;
import demo.factory.ingredient.dough.Dough;
import demo.factory.ingredient.dough.impl.SuperThickDough;
import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.ingredient.sauce.Sauce;
import demo.factory.ingredient.sauce.impl.PlumTomatoSauce;

public class CHIngreFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new SuperThickDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new PlumTomatoSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new MozzarellaCheese();
	}

}
