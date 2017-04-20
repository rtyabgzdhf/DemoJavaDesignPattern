package demo.decorator.deco.impl;

import demo.decorator.IBeverage;
import demo.decorator.deco.IDeco;

public class Mocha implements IDeco {
	IBeverage beverage;
	String size = "";
	
	public Mocha(IBeverage b) {
		super();
		this.beverage = b;
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double k = 0;
		if("S".equalsIgnoreCase(this.getSize())){ k = 0.5; }
		if("M".equalsIgnoreCase(this.getSize())){ k = 0.75; }
		if("L".equalsIgnoreCase(this.getSize())){ k = 1; }
		return 0.2 * k + this.beverage.cost();
	}

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return this.beverage.getDesc() + "+ Deco: mocha "+ this.size ;
	}

	@Override
	public String getSize() {
		// TODO Auto-generated method stub
		return this.size;
	}

	@Override
	public void setSize(String s) {
		// TODO Auto-generated method stub
		this.size = s;
	}

}
