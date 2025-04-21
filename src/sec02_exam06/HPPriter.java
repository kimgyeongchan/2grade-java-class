package sec02_exam06;

public class HPPriter extends Device implements Connectable {
	@Override
	public void print() { //Device 추상클래스 재정의
		System.out.println("HP 프린터입니다.");
	}
	@Override
	public void connect() {
		System.out.println("연결방법 : USB HP프린터를 연결합니다.");
	}
}
