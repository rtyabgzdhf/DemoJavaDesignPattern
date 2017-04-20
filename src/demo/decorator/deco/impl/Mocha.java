package demo.decorator.deco.impl;

import demo.decorator.IBeverage;
import demo.decorator.deco.CondimentDeco;

public class Mocha extends CondimentDeco {
	IBeverage beverage;
	
	public Mocha(IBeverage b) {
		super();
		this.beverage = b;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.2 + this.beverage.cost();
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return this.beverage.getDesc() + "+ Deco: mocha";
	}

}
