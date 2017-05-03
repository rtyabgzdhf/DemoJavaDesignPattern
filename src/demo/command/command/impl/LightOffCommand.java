package demo.command.command.impl;

import demo.command.command.ICommand;
import demo.command.receiver.Light;

public class LightOffCommand implements ICommand {
	Light light;
	
	
	public LightOffCommand(Light light) {
		super();
		this.light = light;
	}


	@Override
	public void execute() {
		// TODO Auto-generated method stub
		this.light.off();
	}


	@Override
	public void undo() {
		// TODO Auto-generated method stub
		this.light.on();
	}

}
