package demo.command.invoker;

import demo.command.command.ICommand;

public class SimpleRemoteCtrl {
	ICommand slot;
	public SimpleRemoteCtrl(){}
	public void setSlot(ICommand slot) {
		this.slot = slot;
	}
	public void pressButton() {
		slot.execute();
	}
}
