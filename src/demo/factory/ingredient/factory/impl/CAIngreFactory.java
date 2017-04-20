package demo.factory.ingredient.factory.impl;

import demo.factory.ingredient.cheese.Cheese;
import demo.factory.ingredient.cheese.impl.GoatCheese;
import demo.factory.ingredient.dough.Dough;
import demo.factory.ingredient.dough.impl.VeryThinDough;
import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.ingredient.sauce.Sauce;
import demo.factory.ingredient.sauce.impl.BruschettaSauce;

public class CAIngreFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new VeryThinDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new BruschettaSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new GoatCheese();
	}

}
