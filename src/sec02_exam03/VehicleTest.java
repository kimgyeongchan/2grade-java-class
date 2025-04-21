package sec02_exam03;
public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vc = new Bus();
		vc.run();
//		vc.checkFare(); //자동 타입 변환으로는 인터페이스에서 오버라이딩 한 메소드 외에는 사용 할 수 없다
		//Vehicle 인터페이스 호출로는 Bus 클래스에 있는checkFare 메소드 사용 불가

		Bus bus = new Bus();
		bus.run();
		bus.checkFare();
	}

}
