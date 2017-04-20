package com.oozinoz.firework;

import com.oozinoz.simulation.RocketSim;
import com.oozinoz.solution.PhysicalRocket;

public class OozinozRocket extends PhysicalRocket implements RocketSim {
	double simTime;
	public OozinozRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super(burnArea, burnRate, fuelMass, totalMass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getThrust() {
		return super.getThrust(this.simTime);
	}

	@Override
	public void setSimTime(double t) {
		// TODO Auto-generated method stub
		this.simTime = t;
	}

	@Override
	public double getMass() {
		// TODO Auto-generated method stub
		return super.getMass(this.simTime);
	}

}
