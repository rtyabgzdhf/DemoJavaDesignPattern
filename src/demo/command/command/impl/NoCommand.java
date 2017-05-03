package demo.command.command.impl;

import demo.command.command.ICommand;

public class NoCommand implements ICommand{

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("do nothing");
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		
	}

}
