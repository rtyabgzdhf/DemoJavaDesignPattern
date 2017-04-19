package demo.observer.display.impl;

import demo.observer.Observer;
import demo.observer.display.DisplayElement;
import demo.observer.subject.Subject;

public class HeatIndexDisplay implements DisplayElement, Observer {

	double heatIndex;
	Subject src;

	public void setSrc(Subject src) {
		this.src = src;
		src.regObserver(this);
	}

	@Override
	public void update(double temp, double humid, double press) {
		// TODO Auto-generated method stub
		this.heatIndex = temp * humid - press;
		display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("HI:" + this.heatIndex);
	}

}
