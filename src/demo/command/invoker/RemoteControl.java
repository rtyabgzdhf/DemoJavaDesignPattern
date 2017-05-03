package demo.command.invoker;

import java.util.ArrayList;

import demo.command.command.ICommand;
import demo.command.command.impl.NoCommand;

public class RemoteControl {
	ArrayList<ICommand> onCmds;
	ArrayList<ICommand> offCmds;
	ICommand undoCmd;
	
	public RemoteControl() {
		super();
		// TODO Auto-generated constructor stub
		this.onCmds = new ArrayList<ICommand>();
		this.offCmds = new ArrayList<ICommand>();

		ICommand noCmd = new NoCommand();
		for (int i = 0; i < 7; i++) {
			this.offCmds.add(noCmd);
			this.onCmds.add(noCmd);
		}
		undoCmd = noCmd;
	}

	public void setCommand(int slot, ICommand onCmd, ICommand offCmd) {
		this.onCmds.add(slot, onCmd);
		this.offCmds.add(slot, offCmd);
	}

	public void onCommand(int slot) {
		this.onCmds.get(slot).execute();
		undoCmd = this.onCmds.get(slot);
	}

	public void offCommand(int slot) {
		this.offCmds.get(slot).execute();
		undoCmd = this.offCmds.get(slot);
	}
	
	public void undoCommand() {
		undoCmd.undo();
	}

	public String toString() {
		String res = "";
		for (int i = 0; i < this.onCmds.size(); i++) {
			res += i + ": " + this.onCmds.get(i).getClass().getName() + " - "
					+ this.offCmds.get(i).getClass().getName() + "\n";
		}
		res += this.undoCmd.getClass().getName() + "\n";
		return res;
	}
}
