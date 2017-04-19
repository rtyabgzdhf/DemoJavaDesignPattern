package demo.observer.display.impl;

import demo.observer.Observer;
import demo.observer.display.DisplayElement;
import demo.observer.subject.Subject;

public class CurrentDisplay implements DisplayElement,Observer {
	double temp;
	double humid;
	Subject dataSrc;
	
	public CurrentDisplay(Subject dataSrc) {
		this.dataSrc = dataSrc;
		dataSrc.regObserver(this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("current:" + this.temp + " ~ " + this.humid);
	}

	@Override
	public void update(double temp, double humid, double press) {
		// TODO Auto-generated method stub
		this.temp = temp;
		this.humid = humid;
		display();
	}

}
