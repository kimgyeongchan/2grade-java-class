package sec02_exam03;
public class VehicleTest {

	public static void main(String[] args) {
		Vehicle vc = new Bus();
		vc.run();
//		vc.checkFare(); //�ڵ� Ÿ�� ��ȯ���δ� �������̽����� �������̵� �� �޼ҵ� �ܿ��� ��� �� �� ����
		//Vehicle �������̽� ȣ��δ� Bus Ŭ������ �ִ�checkFare �޼ҵ� ��� �Ұ�

		Bus bus = new Bus();
		bus.run();
		bus.checkFare();
	}

}
