package demo.template.impl;

import demo.template.AssemblyLine;

public class TankAssembly extends AssemblyLine {

	@Override
	public void createChasis(String type) {
		// TODO Auto-generated method stub
		System.out.println("make a tank chasis "+ type );
	}

	@Override
	public void createTires(String type) {
		// TODO Auto-generated method stub
		System.out.println("Create double chainlinks for tank " + type +", no tire");
	}

	@Override
	public void createBlah(String type) {
		// TODO Auto-generated method stub
		System.out.println("add armor, gun, blah blah");
	}
	//a hook
	public boolean needDelivery(String target){
		boolean flag = false;
		if("army".equalsIgnoreCase(target)) {
			flag = true;
		}
		return flag;
	}

}
