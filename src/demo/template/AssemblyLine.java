package demo.template;

public abstract class AssemblyLine {
	public void produceVehicle(String project,String target){
		createChasis(project);
		createTires(project);
		createBlah(project);
		doBleh();
		if(needDelivery(target)){
			delivery(target);
		}
	}
	public abstract void createChasis(String type);
	public abstract void createTires(String type);
	public abstract void createBlah(String type);
	public void doBleh() {
		System.out.println("Print a serial number to vehicle");
	}
	public boolean needDelivery(String target) { return false;}
	public void delivery(String target) {
		System.out.println("delivery to " + target);
	}
}
