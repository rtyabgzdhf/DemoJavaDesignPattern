package demo.singleton;

public class MainCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestSingleton calculate = TestSingleton.getInstance();
		System.out.println("plus:" + calculate.plus(15, 20));
		System.out.println("plus:" + calculate.getPi());
		
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill(); System.out.println( boiler.isEmpty() + " - " + boiler.isBoiled());
		boiler.boil(); System.out.println( boiler.isEmpty() + " - " + boiler.isBoiled());
		boiler.drain(); System.out.println( boiler.isEmpty() + " - " + boiler.isBoiled());
	}

}
