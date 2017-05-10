package demo.template.compare;

import java.util.Arrays;

public class DuckSortMainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck[] ducks = {
			new Duck("2014", 150.19),
			new Duck("2013", 132.14),
			new Duck("2015", 162.11),
			new Duck("2016", 176.63),
			new Duck("2017M4", 62.09),
		};
		display(ducks);
		
		Arrays.sort(ducks);
		System.out.println(">>======================>>");
		display(ducks);
		
	}
	
	static void display(Duck[] ds){
		for(Duck item : ds) {
			System.out.println(item.toString());
		}
	}

}
