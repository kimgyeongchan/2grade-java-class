package test01;

public class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("�ﰢ�� �׸���");
	}
	@Override
	public void area(double a, double b) {
		System.out.println("�ﰢ���� ���� : "+a*b/2);
	}
}
