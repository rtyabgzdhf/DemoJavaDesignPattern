package demo.facade;

import demo.facade.hometheater.Amplifier;
import demo.facade.hometheater.CdPlayer;
import demo.facade.hometheater.DvdPlayer;
import demo.facade.hometheater.PopcornMaker;
import demo.facade.hometheater.Screen;
import demo.facade.hometheater.Tuner;

public class HomeTheaterFacade {
	Amplifier amplifier;
	Tuner tuner;
	DvdPlayer dvdPlayer;
	CdPlayer cdPlayer;
	Screen screen;
	PopcornMaker maker;
	public HomeTheaterFacade(Amplifier amplifier, Tuner tuner,
			DvdPlayer dvdPlayer, CdPlayer cdPlayer, Screen screen,
			PopcornMaker maker) {
		super();
		this.amplifier = amplifier;
		this.tuner = tuner;
		this.dvdPlayer = dvdPlayer;
		this.cdPlayer = cdPlayer;
		this.screen = screen;
		this.maker = maker;
	}
	public void playMovie(String movie){
		System.out.println("ready to play " + movie);
		maker.on();
		screen.down();
		amplifier.on();
		
		dvdPlayer.on();
		dvdPlayer.play(movie);
	}
	public void stopMovie(){
		System.out.println("end!");
		maker.off();
		dvdPlayer.stop();
		dvdPlayer.off();
		amplifier.off();
		screen.up();
	}
}
