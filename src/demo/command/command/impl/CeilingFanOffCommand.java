package demo.command.command.impl;

import demo.command.command.ICommand;
import demo.command.receiver.CeilingFan;

public class CeilingFanOffCommand implements ICommand {
	CeilingFan ceilingFan;
	int prevSpeed;
	
	
	public CeilingFanOffCommand(CeilingFan ceilingFan) {
		super();
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		prevSpeed = ceilingFan.getSpeed();
		ceilingFan.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		if(prevSpeed == CeilingFan.HIGH) { ceilingFan.high();}
		else if(prevSpeed == CeilingFan.MED) { ceilingFan.med();}
		else if(prevSpeed == CeilingFan.LOW) { ceilingFan.low();}
		else if(prevSpeed == CeilingFan.OFF) { ceilingFan.off();}
	}

}
