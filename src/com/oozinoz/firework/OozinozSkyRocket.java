package com.oozinoz.firework;

import com.oozinoz.simulation.SkyRocket;
import com.oozinoz.solution.PhysicalRocket;

public class OozinozSkyRocket extends SkyRocket {
	private PhysicalRocket physicalRocket;

	public OozinozSkyRocket(PhysicalRocket physicalRocket) {
		super(1.0,2.0,3.0);
		this.physicalRocket = physicalRocket;
	}
	public double getMass() {
		return super.getMass() + this.physicalRocket.getMass(this.simTime);
	}

	public double getThrust() {
		return super.getThrust() + this.physicalRocket.getThrust(this.simTime);
	}
}
