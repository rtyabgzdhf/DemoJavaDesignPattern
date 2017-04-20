package demo.strategy.duck;

import demo.strategy.behavior.fly.impl.FlyByWing;
import demo.strategy.behavior.quark.impl.LoudQuark;

public class MallardDuck extends Duck {

	public MallardDuck() {
		this.flyBehavior = new FlyByWing();
		this.quarkBehavior = new LoudQuark();
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("mallard!");
	}
	
}
