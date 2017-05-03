package demo.command.client;

import demo.command.command.impl.GarageDoorOpenCommand;
import demo.command.command.impl.LightOnCommand;
import demo.command.invoker.SimpleRemoteCtrl;
import demo.command.receiver.GarageDoor;
import demo.command.receiver.Light;


public class RemoteCtrller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleRemoteCtrl ctrl = new SimpleRemoteCtrl();
		
		Light l = new Light("");
		LightOnCommand lightOn = new LightOnCommand(l);
		
		ctrl.setSlot(lightOn);
		ctrl.pressButton();
		
		ctrl.setSlot(new GarageDoorOpenCommand(new GarageDoor()));
		ctrl.pressButton();
	}

}
