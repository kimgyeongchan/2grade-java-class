package sec02_test01_2;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
	
	@Override
	public void computerAreat(double a, double b) {
		System.out.println("�ﰢ���� ����"+a*a*3.14);
	}
}
