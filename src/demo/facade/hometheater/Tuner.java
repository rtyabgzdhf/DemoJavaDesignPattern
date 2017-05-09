package demo.facade.hometheater;

public class Tuner {
	Amplifier amplifier;

	public Tuner(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}
	
	public void on(){
		System.out.println("tuner on");
	}
	public void off(){
		System.out.println("tuner off");
	}
	public void setAm(String am){
		System.out.println("am:" + am);
	}
	public void setFm(String fm){
		System.out.println("fm:" + fm);
	}
	public void setFreq(String fr){
		System.out.println("fr:"+ fr + " mHz");
	}
}
