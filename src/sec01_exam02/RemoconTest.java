package sec01_exam02;
public class RemoconTest {
	public static void main(String[] args) {
		SmartTV stv = new SmartTV();
		Remocon rc = stv;
		rc.turnOn();
		rc.setVolume(2);
		rc.setVolume(11);
		Search sc = stv;
		sc.urlSearch("https://www.daum.net/");
		stv.turnOff();
		
	}

}
