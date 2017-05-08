package demo.command.command.impl;

import demo.command.command.ICommand;

public class MacroCommand implements ICommand {
	ICommand[] commands;
	
	
	public MacroCommand(ICommand[] commands) {
		super();
		this.commands = commands;
	}
	

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		for(ICommand item : commands){
			item.execute();
		}
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		for(ICommand item : commands){
			item.undo();
		}
	}

}
