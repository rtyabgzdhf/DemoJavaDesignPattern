package demo.observer.display.impl;

import java.util.Observable;
import java.util.Observer;

import demo.observer.display.DisplayElement;
import demo.observer.subject.impl.JavaWeatherData;

public class DisplayTypeB implements DisplayElement, Observer {

	Observable observable;
	double temp,humid,press;
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("java typeB:" + this.temp + " - " + this.humid + " - " + this.press);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof JavaWeatherData){
			JavaWeatherData jwd = (JavaWeatherData) o;
			this.temp  = jwd.getTemp() ;
			this.humid = jwd.getHumid();
			this.press = jwd.getPress();
			display();
		}
	}
	
	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getHumid() {
		return humid;
	}

	public void setHumid(double humid) {
		this.humid = humid;
	}

	public double getPress() {
		return press;
	}

	public void setPress(double press) {
		this.press = press;
	}

	public void setObservable(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}



}
