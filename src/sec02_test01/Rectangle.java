package sec02_test01;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("�簢�� �׸���");
	}
	@Override
	public void computerAreat(double width,double height) {
		System.out.println("�簢���� ���� : "+width*height);
	}
}
