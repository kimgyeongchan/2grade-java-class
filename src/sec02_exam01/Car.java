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
		Car car = new Car(); //�ν��Ͻ� Ÿ���� Car Ŭ���� ����Ϸ��� ��ü ����
		car.run();
		
		System.out.println("---���� ��Ƽ�� ��ü---");
		
		car.fL = new KumhoTire();
		car.fR = new KumhoTire();
		car.run();
	}
}
