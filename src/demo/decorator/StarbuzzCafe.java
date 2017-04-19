package demo.decorator;

import demo.decorator.component.HouseBlend;
import demo.decorator.deco.impl.Mocha;

public class StarbuzzCafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBeverage b1 = new HouseBlend();
		System.out.println(b1.getDesc() + "->" + b1.cost());
		b1 = new Mocha(b1);
		System.out.println(b1.getDesc() + "->" + b1.cost());
	}

}
