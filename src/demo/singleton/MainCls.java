package demo.singleton;

public class MainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleton calculate = TestSingleton.getInstance();
		System.out.println("plus:" + calculate.plus(15, 20));
		System.out.println("plus:" + calculate.getPi());
		
//		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		ChocolateBoiler boiler2 = ChocolateBoiler.getVolatileInstance();
		boiler2.fill(); System.out.println( boiler2.isEmpty() + " - " + boiler2.isBoiled());
		ChocolateBoiler boiler = boiler2; 
		boiler.boil(); System.out.println( boiler.isEmpty() + " - " + boiler.isBoiled());
		boiler.drain(); System.out.println( boiler.isEmpty() + " - " + boiler.isBoiled());
		boiler.fill(); System.out.println( boiler.isEmpty() + " - " + boiler.isBoiled());
		boiler2.boil(); System.out.println( boiler2.isEmpty() + " - " + boiler2.isBoiled());
		boiler2.drain(); System.out.println( boiler2.isEmpty() + " - " + boiler2.isBoiled());
	}

}
