package sec02_test01_2;

public class Triangle extends Figure implements Shape{

	@Override
	public void draw() {
		System.out.println("�ﰢ�� �׸���");
	}
	
	@Override
	public void computerAreat(double a, double b) {
		System.out.println("�ﰢ���� ����"+a*b/2);
	}
}
