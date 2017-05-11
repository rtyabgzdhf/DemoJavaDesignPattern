package demo.prototype;

import demo.prototype.cars.Ford;
import demo.prototype.cars.Volga;

public class PrototypeMainCls {


	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		BasicCar car1 = new Volga("car1");
		car1.price = 1000;
		BasicCar car2 = new Ford("car2");
		car1.price = 2000;
		
		System.out.println(car1.toString() +" ~ "+car2.toString());
		
		System.out.println(">>==->");
		BasicCar car11  = car1.clone();
		car11.setPrice();
		BasicCar car21 = car2.clone();
		car21.price = 5000;
		System.out.println(car11.toString() +" ~ "+car21.toString());
	}

}
