package sec01_exam02;
public class Test {
	public static void main(String[] args) {
		Remocon rc = new TV();
		rc.turnOn();
		rc.setVolume(25);
		rc.setVolume(5);
		rc.turnOff();
		
		System.out.println("---------");
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(-5);
		rc.setVolume(7);
		rc.turnOff();
	}
}
