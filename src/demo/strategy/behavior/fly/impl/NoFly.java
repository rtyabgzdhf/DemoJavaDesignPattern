package demo.strategy.behavior.fly.impl;

import demo.strategy.behavior.fly.FlyBehavior;

public class NoFly implements FlyBehavior {

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("can not fly");
	}

}
