package demo.strategy.color.impl;

import demo.strategy.color.IColor;

public class GreenColor extends IColor {

	
	public GreenColor() {
		super();
		// TODO Auto-generated constructor stub
		this.color = "green";
	}

	@Override
	public void fillColor() {
		// TODO Auto-generated method stub
		this.color = "green";
	}

}
