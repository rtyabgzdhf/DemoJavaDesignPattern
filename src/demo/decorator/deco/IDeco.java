package demo.decorator.deco;

import demo.decorator.IBeverage;

public interface IDeco extends IBeverage {
	public String getDesc();
	public double cost();
	
}
