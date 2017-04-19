package demo.observer.subject.impl;

import java.util.Observable;

public class JavaWeatherData extends Observable {
	double temp;
	double humid;
	double press;
	public void change() {
		this.setChanged();
		this.notifyObservers();
	}
	public void setMeasurements(double temp,double humid,double press) {
		this.temp = temp*10;
		this.humid = humid * 100;
		this.press = press * 1000;
		change();
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
		change();
	}

	public void setHumid(double humid) {
		this.humid = humid;
		change();
	}

	public void setPress(double press) {
		this.press = press;
		change();
	}
	public double getTemp() {
		return temp;
	}
	public double getHumid() {
		return humid;
	}
	public double getPress() {
		return press;
	}
	
}
