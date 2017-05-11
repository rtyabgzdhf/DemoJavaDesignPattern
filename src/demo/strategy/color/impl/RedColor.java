package demo.strategy.color.impl;

import demo.strategy.color.IColor;

public class RedColor extends IColor {

	
	public RedColor() {
		super();
		// TODO Auto-generated constructor stub
		this.color = "red";
	}

	@Override
	public void fillColor() {
		// TODO Auto-generated method stub
		this.color = "red";
	}

}
