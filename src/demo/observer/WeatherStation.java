package demo.observer;

import demo.observer.display.impl.DisplayTypeB;
import demo.observer.display.impl.HeatIndexDisplay;
import demo.observer.display.impl.JavaDisplayTypeA;
import demo.observer.subject.impl.JavaWeatherData;
import demo.observer.subject.impl.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherData dataSrc = new WeatherData();
		
//		CurrentDisplay display1 = new CurrentDisplay(dataSrc);		
//		dataSrc.setMeasurements(15, 12, 16);
//		dataSrc.setHumid(0.5);
//		dataSrc.setTemp(34);
		
//		System.out.println("=======");
//		dataSrc.delObserver(display1);
//		dataSrc.setPress(100);
		
		HeatIndexDisplay hid = new HeatIndexDisplay();
		hid.setSrc(dataSrc);
		dataSrc.setMeasurements(35	, 84, 177);
		
		System.out.println("=======");
		JavaWeatherData jdataSrc1 = new JavaWeatherData();
		JavaDisplayTypeA jd1 = new JavaDisplayTypeA();
		jd1.setObserver(jdataSrc1);		
		DisplayTypeB displayTypeB = new DisplayTypeB();
		displayTypeB.setObservable(jdataSrc1);		
		jdataSrc1.setMeasurements(35 , 84, 177);
	}

}
