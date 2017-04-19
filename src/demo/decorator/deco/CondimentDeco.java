package demo.decorator.deco;

import demo.decorator.IBeverage;

public abstract class CondimentDeco implements IBeverage {
	@Override
	public abstract String getDesc();
	@Override
	public abstract double cost();

}
