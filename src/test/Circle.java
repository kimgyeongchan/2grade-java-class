package test;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("�� �׸���");
	}
	
	@Override
	public void computerArea(double a, double b) {
		System.out.println("����: "+a+", ���� : "+b+"�� ���� ���� = "+a*b*3.14);
	}
	
}
