package com.oozinoz.mainpkg;

import com.oozinoz.firework.OozinozRocket;
import com.oozinoz.firework.OozinozSkyRocket;


public class RocketMain {
	public static void main(String[] args) {
		//class adapter
		OozinozRocket oor = new OozinozRocket(10, 20, 30, 40);
		oor.setSimTime(5);
		System.out.println("thrust:" + oor.getThrust());
		System.out.println("mass:" + oor.getMass());
		
		OozinozSkyRocket oosr = new OozinozSkyRocket(oor);
		
		oosr.setSimTime(10);
		
		System.out.println("thrust:" + oosr.getThrust());
		System.out.println("mass:" + oosr.getMass());
		
	}
}
