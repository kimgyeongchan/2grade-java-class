package sec02_exam01;

public class Car {
	Tire fL = new HankookTire();
	Tire fR = new HankookTire();
	Tire bL = new HankookTire();
	Tire bR = new HankookTire();
	
	void run() {
		fL.roll();
		fR.roll();
		bL.roll();
		bR.roll();
	}
	public static void main(String[] args) {
		Car car = new Car(); //인스턴스 타입인 Car 클래스 사용하려면 객체 생성
		car.run();
		
		System.out.println("---앞쪽 아티어 교체---");
		
		car.fL = new KumhoTire();
		car.fR = new KumhoTire();
		car.run();
	}
}
