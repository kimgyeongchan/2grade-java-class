package test01_1;

public class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("�簢�� �׸���");
	}
	
	@Override
	public void area(double x, double y) {
		System.out.println("�簢���� ����: "+x*y);
	}
}
