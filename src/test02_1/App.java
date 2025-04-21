package test02_1;

public class App {
	public static void main(String[] args) {
//		Adder adder = new Adder();
//		Subtracter sub = new Subtracter();
//		adder.run();
//		sub.run();
		
		Calculator cal = new Adder();
		cal.run();
		cal = new Subtracter();
		cal.run();
	}
}
