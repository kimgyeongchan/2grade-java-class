package test;

public class Triangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("�ﰢ�� �׸���");
	}
	
	@Override
	public void computerArea(double a, double b) {
		System.out.println("����: "+a+", ���� : "+b+"�� �ﰢ���� ���� = "+(a*b)/2);
	}
	
}
