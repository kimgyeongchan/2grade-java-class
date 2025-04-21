package sec01_exam03;

public class MyTest {
	public static void main(String[] args) {
		MyClass mc1 = new MyClass();
		mc1.rc.turnOn();
		mc1.rc.setVolume(1);
		System.out.println("--------");
		
		MyClass mc2 = new MyClass(new Audio());
		System.out.println("--------");
		
		mc2.mA();
		System.out.println("--------");
		mc2.mB(new TV());
	}
}
