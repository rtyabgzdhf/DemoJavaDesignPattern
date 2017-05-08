package demo.adapter.turkey;

import demo.strategy.duck.Duck;

public class TurkeyAdapter extends Duck {

	ITurkey turkey;
	
	public TurkeyAdapter(ITurkey turkey) {
		super();
		this.turkey = turkey;
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("turkey!");
	}
	public void performFly() { 
		turkey.fly(); 
	}
	public void performQuark() { 
		turkey.keu();
	}
}
