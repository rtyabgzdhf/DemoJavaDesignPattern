package demo.facade;

import demo.facade.hometheater.Amplifier;
import demo.facade.hometheater.CdPlayer;
import demo.facade.hometheater.DvdPlayer;
import demo.facade.hometheater.PopcornMaker;
import demo.facade.hometheater.Screen;
import demo.facade.hometheater.Tuner;

public class FacadeMainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PopcornMaker popper = new PopcornMaker();
		Amplifier amp = new Amplifier();
		Screen scr = new Screen();
		Tuner tuner = new Tuner(amp);
		DvdPlayer dvdPlayer = new DvdPlayer(amp);
		CdPlayer cdPlayer = new CdPlayer(amp);
		
		//without impl Facade pattern
//		popper.on();popper.pop();
//		scr.down();
//		amp.on();
//		amp.setTuner(tuner);
//		amp.setDvdPlayer(dvdPlayer);
//		amp.setCdPlayer(cdPlayer);
//		
//		dvdPlayer.on();
//		dvdPlayer.play("blah dvd");
		
		//impl pattern
		HomeTheaterFacade fd = new HomeTheaterFacade(amp, tuner, dvdPlayer, cdPlayer, scr, popper);
		fd.playMovie("haha blah bleh blih");
		System.out.println(">>----------->");
		fd.stopMovie();
	}

}
