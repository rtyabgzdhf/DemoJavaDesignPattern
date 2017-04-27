package demo.singleton;

public class TestSingleton {
	private static TestSingleton uniqueInstance;
	private String pi;
	
	private TestSingleton() {
		this.pi = "3.14";
	}

	public static synchronized TestSingleton getInstance() {
		if (TestSingleton.uniqueInstance == null) {
			TestSingleton.uniqueInstance = new TestSingleton();
		}
		return TestSingleton.uniqueInstance;
	}

	public int plus(int a, int b) {
		return a + b;
	}
	public String getPi() {
		return this.pi;
	}
	
}
