package demo.singleton;


public class ChocolateBoiler {
	private volatile static ChocolateBoiler boiler = new ChocolateBoiler();
	boolean empty;
	boolean boiled;
	
	private ChocolateBoiler() {
		this.empty = true;
		this.boiled = false;
	}
	
	public static ChocolateBoiler getInstance() {
		return ChocolateBoiler.boiler;
	}
	
	public static ChocolateBoiler getVolatileInstance() {
		if(boiler == null) {
			synchronized (ChocolateBoiler.class) {
				if(boiler == null) {
					boiler = new ChocolateBoiler();
				}
			}
		}
		return boiler;
		
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
	
	public void fill() {
		if(isEmpty()) {
			empty = false;
			boiled = false;
		}
	}
	public void drain() {
		if( !isEmpty() && isBoiled() ) {
			empty = true;
		}
	}
	public void boil() {
		if( !isEmpty() && !isBoiled() ) {
			boiled = true;
		}
	}
}
