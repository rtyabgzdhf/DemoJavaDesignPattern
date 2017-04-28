package demo.command.command.impl;

import demo.command.command.ICommand;
import demo.command.receiver.GarageDoor;

public class GarageDoorOpenCommand implements ICommand {
	GarageDoor gd;
	
	
	public GarageDoorOpenCommand(GarageDoor gd) {
		super();
		this.gd = gd;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		gd.lightOn();
		gd.up();
		gd.lightOff();
		System.out.println("opened!");
	}

}
