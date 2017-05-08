package demo.command.client;

import demo.command.command.ICommand;
import demo.command.command.impl.CeilingFanHighCommand;
import demo.command.command.impl.CeilingFanMedCommand;
import demo.command.command.impl.CeilingFanOffCommand;
import demo.command.command.impl.LightOffCommand;
import demo.command.command.impl.LightOnCommand;
import demo.command.command.impl.MacroCommand;
import demo.command.invoker.RemoteControl;
import demo.command.receiver.CeilingFan;
import demo.command.receiver.Light;

public class RemoteLoader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rm = new RemoteControl();
		Light livingRoomLight = new Light("living room");
		Light kitchenRoomLight = new Light("kitchen");
		
		LightOnCommand lvRmOnCmd = new LightOnCommand(livingRoomLight);
		LightOffCommand lvRmOffCmd = new LightOffCommand(livingRoomLight);
		
		LightOnCommand ktOnCmd = new LightOnCommand(kitchenRoomLight);
		LightOffCommand ktOffCmd = new LightOffCommand(kitchenRoomLight);
		
		rm.setCommand(0, ktOnCmd, ktOffCmd);
		rm.setCommand(1, lvRmOnCmd, lvRmOffCmd);
		
		System.out.println(rm);
		rm.onCommand(0); rm.offCommand(0); rm.undoCommand();
		System.out.println("--------------");
		System.out.println(rm);
		rm.undoCommand();
		
		rm.offCommand(1); rm.onCommand(1); rm.undoCommand();
		
		rm.onCommand(3); rm.undoCommand();
		
		System.out.println("--------------");
		Light blahLight = new Light("blah");
		LightOnCommand blahOnCmd = new LightOnCommand(blahLight);
		LightOffCommand blahOffCmd = new LightOffCommand(blahLight);
		rm.setCommand(5, blahOnCmd, blahOffCmd);
		System.out.println(rm);
		rm.onCommand(5); rm.offCommand(5); rm.undoCommand();
		
		System.out.println("--------------");
		CeilingFan blehFan = new CeilingFan("bleh");
		CeilingFanHighCommand blehHigh = new CeilingFanHighCommand(blehFan);
		CeilingFanMedCommand blehMed = new CeilingFanMedCommand(blehFan);
		CeilingFanOffCommand blehOff = new CeilingFanOffCommand(blehFan);
		rm.setCommand(4, blehHigh, blehOff);
		rm.setCommand(6, blehMed, blehOff);
		rm.onCommand(6);rm.offCommand(6); rm.undoCommand();rm.undoCommand();
		rm.onCommand(4);rm.undoCommand(); 
		
		System.out.println("--------------");
		ICommand[] ptOn = { lvRmOnCmd, ktOnCmd, blahOnCmd, blehHigh };
		ICommand[] ptOff = { lvRmOffCmd, ktOffCmd, blahOffCmd, blehOff };
		MacroCommand ptOnCmd = new MacroCommand(ptOn);
		MacroCommand ptOffCmd = new MacroCommand(ptOff);
		RemoteControl rm1 = new RemoteControl();
		rm1.setCommand(0, ptOnCmd, ptOffCmd);
		rm1.onCommand(0);
		System.out.println("=>");
		rm1.offCommand(0);
		System.out.println("=>");
		rm1.undoCommand(); rm1.undoCommand();
	}

}
