package demo.factory.ingredient.factory.impl;

import demo.factory.ingredient.cheese.Cheese;
import demo.factory.ingredient.cheese.impl.ReggianoCheese;
import demo.factory.ingredient.dough.Dough;
import demo.factory.ingredient.dough.impl.ThinDough;
import demo.factory.ingredient.factory.PizzaIngredientFactory;
import demo.factory.ingredient.sauce.Sauce;
import demo.factory.ingredient.sauce.impl.MariranaSauce;

public class NYIngreFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		// TODO Auto-generated method stub
		return new ThinDough();
	}

	@Override
	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return new MariranaSauce();
	}

	@Override
	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return new ReggianoCheese();
	}

}
