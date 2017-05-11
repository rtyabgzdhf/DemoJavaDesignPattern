package demo.strategy.duck;
import demo.strategy.behavior.fly.FlyBehavior;
import demo.strategy.behavior.quark.QuarkBehavior;
import demo.strategy.color.IColor;


public abstract class Duck {
	FlyBehavior flyBehavior;
	QuarkBehavior quarkBehavior;
	IColor duckcolor;
	public Duck() {}
	public Duck(IColor c) {
		this.duckcolor = c;
	}
	
	public IColor getDuckcolor() {
		return duckcolor;
	}
	public void setDuckcolor(IColor duckcolor) {
		this.duckcolor = duckcolor;
	}
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
