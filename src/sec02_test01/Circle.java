package sec02_test01;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("���� �׸���");
	}
	@Override
	public void computerAreat(double width,double height) {
		System.out.println("�ﰢ���� ���� : "+width*width*3.14);
	}
}
