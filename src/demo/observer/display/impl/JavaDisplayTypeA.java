package demo.observer.display.impl;

import java.util.Observable;
import java.util.Observer;

import demo.observer.display.DisplayElement;
import demo.observer.subject.impl.JavaWeatherData;

public class JavaDisplayTypeA implements Observer,DisplayElement {
	Observable observable;
	double heatIndex;
	
	
	public void setObserver(Observable obs) {
		this.observable = obs;
		obs.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof JavaWeatherData){
			JavaWeatherData jwd = (JavaWeatherData) o;
			this.heatIndex  = jwd.getTemp() * jwd.getHumid() - jwd.getPress();
			display();
		}
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("java type A:" + this.heatIndex);
	}
	

}
