package demo.prototype.cars;

import demo.prototype.BasicCar;

public class Volga extends BasicCar {

	public Volga(String m) {
		// TODO Auto-generated constructor stub
		this.modelname = m;
	}

	@Override
	public String toString() {
		return "Volga [modelname=" + modelname + ", price=" + price + "]";
	}

	@Override
	protected Volga clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Volga) super.clone();
	}
	
}
