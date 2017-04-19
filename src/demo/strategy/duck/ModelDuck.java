package demo.strategy.duck;

import demo.strategy.behavior.fly.impl.NoFly;
import demo.strategy.behavior.quark.impl.LoudQuark;

public class ModelDuck extends Duck {

	public ModelDuck() {
		super();
		// TODO Auto-generated constructor stub
		this.flyBehavior = new NoFly();
		this.quarkBehavior = new LoudQuark();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("model duck");
	}

}
