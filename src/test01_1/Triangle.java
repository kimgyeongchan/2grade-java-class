package test01_1;

public class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("�ﰢ�� �׸���");
	}
	
	@Override
	public void area(double x, double y) {
		System.out.println("�ﰢ���� ����: "+x*y/2);
	}
}
