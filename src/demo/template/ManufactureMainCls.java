package demo.template;

import demo.template.impl.CarAssembly;
import demo.template.impl.TankAssembly;

public class ManufactureMainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AssemblyLine l1 = new TankAssembly();
		AssemblyLine l2 = new CarAssembly();
		
		l1.produceVehicle("T-34-85","army");
		System.out.println("--------------------");
		l2.produceVehicle("Lada blah","");
	}

}
