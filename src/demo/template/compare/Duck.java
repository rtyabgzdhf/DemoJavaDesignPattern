package demo.template.compare;

public class Duck implements Comparable<Duck> {
	String name;
	double weight;
	
	
	public Duck(String name, double weight) {
		super();
		this.name = name;
		this.weight = weight;
	}


	@Override
	public String toString() {
		return "Duck [name=" + name + ", weight=" + weight + "]";
	}


	@Override
	public int compareTo(Duck o) {
		// TODO Auto-generated method stub
		if(this.weight < o.weight) { return -1;}
		else if(this.weight > o.weight) { return 1;}
		else return 0;
	}

}
