package sec02_test01_2;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("�簢�� �׸���");
	}
	
	@Override
	public void computerAreat(double a, double b) {
		System.out.println("�簢���� ����"+a*b);
	}
}
