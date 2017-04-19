package demo.strategy.duck;
import demo.strategy.behavior.fly.FlyBehavior;
import demo.strategy.behavior.quark.QuarkBehavior;


public abstract class Duck {
	FlyBehavior flyBehavior;
	QuarkBehavior quarkBehavior;
	public Duck() {}
	public abstract void display();
	public void performFly() { 
		flyBehavior.fly(); 
	}
	public void performQuark() { 
		quarkBehavior.quark();
	}
	public void swim() { 
		System.out.println("All Swim");
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuarkBehavior getQuarkBehavior() {
		return quarkBehavior;
	}
	public void setQuarkBehavior(QuarkBehavior quarkBehavior) {
		this.quarkBehavior = quarkBehavior;
	}
	
	

}
