package demo.facade.hometheater;

public class CdPlayer {
	Amplifier amplifier;

	public CdPlayer(Amplifier amplifier) {
		super();
		this.amplifier = amplifier;
	}
	public void on(){
		System.out.println("cd on");
	}
	public void off(){
		System.out.println("cd off");
	}
	public void play(String nm){
		System.out.println("cd play "+nm);
	}
	public void stop(){
		System.out.println("cd stop");
	}
	public void out(){
		System.out.println("cd out");
	}
}
