package demo.prototype.cars;

import demo.prototype.BasicCar;

public class Ford extends BasicCar {

	public Ford(String m) {
		// TODO Auto-generated constructor stub
		this.modelname = m;
	}

	@Override
	public String toString() {
		return "Ford [modelname=" + modelname + ", price=" + price + "]";
	}

	@Override
	protected Ford clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Ford) super.clone();
	}
	
}
