package test;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("�簢�� �׸���");
	}
	
	@Override
	public void computerArea(double a, double b) {
		System.out.println("����: "+a+", ���� : "+b+"�� �簢���� ���� = "+a*b);
	}
	
}
