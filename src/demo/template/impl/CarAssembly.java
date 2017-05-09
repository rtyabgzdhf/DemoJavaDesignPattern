package demo.template.impl;

import demo.template.AssemblyLine;

public class CarAssembly extends AssemblyLine {

	@Override
	public void createChasis(String type) {
		// TODO Auto-generated method stub
		System.out.println("Create a car chasis:" + type);
	}

	@Override
	public void createTires(String type) {
		// TODO Auto-generated method stub
		 System.out.println("add 4 wheels and tires");
	}

	@Override
	public void createBlah(String type) {
		// TODO Auto-generated method stub
		System.out.println("add flower pattern print on top of car:" + type );
	}

}
