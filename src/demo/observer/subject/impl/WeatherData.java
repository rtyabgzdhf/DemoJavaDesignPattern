package demo.observer.subject.impl;

import java.util.ArrayList;

import demo.observer.Observer;
import demo.observer.subject.Subject;

public class WeatherData implements Subject {
	double temp;
	double humid;
	double press;
	ArrayList<Observer> observers;
	
	public WeatherData() {
		this.observers = new ArrayList<Observer>();
	}

	@Override
	public void regObserver(Observer o) {
		// TODO Auto-generated method stub
		this.observers.add(o);
	}

	@Override
	public void delObserver(Observer o) {
		// TODO Auto-generated method stub
		if(this.observers.contains(o)){
			this.observers.remove(o);
		}
	}

	@Override
	public void notifyObserver() {
		// TODO Auto-generated method stub
		for (Observer item : this.observers) {
			item.update(this.temp, this.humid, this.press);
		}
	}
	
	public void change() {
		notifyObserver();
	}
	
	public void setMeasurements(double temp,double humid,double press) {
		this.temp = temp;
		this.humid = humid;
		this.press = press;
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
	
}
