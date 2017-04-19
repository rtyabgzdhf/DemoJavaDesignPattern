package demo.decorator.component;

import demo.decorator.IBeverage;

public class HouseBlend implements IBeverage {

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "this is HouseBlend";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 0.89;
	}

}
