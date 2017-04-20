package demo.factory.ingredient.factory;

import demo.factory.ingredient.cheese.Cheese;
import demo.factory.ingredient.dough.Dough;
import demo.factory.ingredient.sauce.Sauce;

public interface PizzaIngredientFactory {
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
}
