package demo.facade.hometheater;

public class Amplifier {
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	public Amplifier(Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer) {
		super();
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
	}
	public Amplifier(){
		super();
	}
	
	public void on(){
		System.out.println("Amplifier on");
	}
	public void off(){
		System.out.println("Amplifier off");
	}
	public void setTuner(Tuner tuner) {
		this.tuner = tuner;
	}
	public void setDvdPlayer(DvdPlayer dvdPlayer) {
		this.dvdPlayer = dvdPlayer;
	}
	public void setCdPlayer(CdPlayer cdPlayer) {
		this.cdPlayer = cdPlayer;
	}
	public void setVol(String vol){
		System.out.println("vol:" + vol);
	}
}
