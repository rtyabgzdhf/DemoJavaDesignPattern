package demo.observer.subject;

import demo.observer.Observer;

public interface Subject {
	public void regObserver(Observer o);

	public void delObserver(Observer o);

	public void notifyObserver();
}
