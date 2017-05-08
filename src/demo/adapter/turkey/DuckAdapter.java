package demo.adapter.turkey;

import demo.strategy.duck.Duck;

public class DuckAdapter implements ITurkey {
	Duck duck;
	
	public DuckAdapter(Duck duck) {
		super();
		this.duck = duck;
	}
	

	@Override
	public void keu() {
		// TODO Auto-generated method stub
		duck.performQuark();
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		duck.performFly();
	}

}
