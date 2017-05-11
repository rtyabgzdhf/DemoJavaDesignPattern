package demo.prototype;

import java.util.Random;

public abstract class BasicCar implements Cloneable {
	public String modelname;
	public int price;

	public String getModelname() {
		return modelname;
	}

	public void setModelname(String modelname) {
		this.modelname = modelname;
	}

	public static int setPrice() {
		int price = 0;
		Random r = new Random();
		int p = r.nextInt(100000);
		price = p;
		return price;
	}

	public BasicCar() {
		// TODO Auto-generated constructor stub

	}

	@Override
	public String toString() {
		return "BasicCar [modelname=" + modelname + ", price=" + price + "]";
	}

	@Override
	protected BasicCar clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (BasicCar) super.clone();
	}

}
