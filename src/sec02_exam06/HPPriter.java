package sec02_exam06;

public class HPPriter extends Device implements Connectable {
	@Override
	public void print() { //Device �߻�Ŭ���� ������
		System.out.println("HP �������Դϴ�.");
	}
	@Override
	public void connect() {
		System.out.println("������ : USB HP�����͸� �����մϴ�.");
	}
}
