package demo.command.command.impl;

import demo.command.command.ICommand;
import demo.command.receiver.Light;

public class LightOnCommand implements ICommand {
	Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		light.on();
	}

}
