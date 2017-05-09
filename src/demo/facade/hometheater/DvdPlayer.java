package demo.facade.hometheater;

public class DvdPlayer {
	Amplifier amplifier;

	public DvdPlayer(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}
	public void on(){
		System.out.println("dvd on");
	}
	public void off(){
		System.out.println("dvd off");
	}
	public void play(String nm){
		System.out.println("dvd play "+nm);
	}
	public void stop(){
		System.out.println("dvd stop");
	}
}
