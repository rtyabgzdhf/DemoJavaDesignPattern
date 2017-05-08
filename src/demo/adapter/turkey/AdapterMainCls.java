package demo.adapter.turkey;

import demo.adapter.turkey.impl.WildTurkey;
import demo.strategy.duck.Duck;
import demo.strategy.duck.MallardDuck;

public class AdapterMainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildTurkey tk = new WildTurkey();
		Duck d1 = new MallardDuck();
		Duck adpt = new TurkeyAdapter(tk);
		adpt.display();
		adpt.performFly();
		adpt.performQuark();
		System.out.println("------------");
		d1.display();
		d1.performFly();
		d1.performQuark();
		
		System.out.println("+++++++++++");
		
		ITurkey fakeByDuck = new DuckAdapter(d1);
		fakeByDuck.fly();
		fakeByDuck.keu();
	}

}
