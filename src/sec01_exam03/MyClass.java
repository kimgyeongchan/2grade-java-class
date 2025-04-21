package sec01_exam03;

public class MyClass {
	Remocon rc = new TV();
	MyClass(){}
	MyClass(Remocon rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void mA() {
		System.out.println("mA()호출");
		Remocon rc = new Audio();
		rc.turnOn();
		rc.setVolume(3);
	}
	void mB(Remocon rc) {
		System.out.println("mB()호출");
		rc.turnOn();
		rc.setVolume(8);
	}
}
