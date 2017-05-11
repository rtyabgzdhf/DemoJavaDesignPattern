package demo.strategy;

import demo.strategy.color.impl.GreenColor;
import demo.strategy.color.impl.RedColor;
import demo.strategy.duck.Duck;
import demo.strategy.duck.MallardDuck;
import demo.strategy.duck.ModelDuck;



public class DuckSimMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		MallardDuck malD = new MallardDuck();
//		malD.display();
//		malD.swim();
//		malD.performFly();
//		malD.performQuark();
//		System.out.println("----------------");
//		ModelDuck modD = new ModelDuck();
//		modD.display();
//		modD.swim();
//		modD.performFly();
//		modD.performQuark();
//		modD.setFlyBehavior(new FlyByRocket());
//		modD.performFly();
//		System.out.println("----------------");
//		malD.setQuarkBehavior(new Squeak());
//		malD.performQuark();
//		System.out.println("----------------");
//		Duck d1 = new Duck() {
//			
//			@Override
//			public void display() {
//				// TODO Auto-generated method stub
//				System.out.println("duck");
//			}
//		};
//		d1.setFlyBehavior(new NoFly());
//		d1.setQuarkBehavior(new MuteSquark());
//		d1.display();
//		d1.swim();
//		d1.performFly();
//		d1.performQuark();
		
		System.out.println("A bridge pattern demo");
		Duck redDuck = new MallardDuck();
		redDuck.setDuckcolor(new RedColor());
		Duck greenDuck = new ModelDuck();
		greenDuck.setDuckcolor(new GreenColor());		
		System.out.println("Duck color:" + redDuck.getDuckcolor().color + " - " + greenDuck.getDuckcolor().color);
		greenDuck.setDuckcolor(new RedColor());
		System.out.println("Duck color:" + redDuck.getDuckcolor().color + " - " + greenDuck.getDuckcolor().color);
	}

}
