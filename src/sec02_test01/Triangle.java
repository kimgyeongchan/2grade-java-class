package sec02_test01;

public class Triangle extends Figure implements Shape{
	
	@Override
	public void draw() {
		System.out.println("�ﰢ�� �׸���");
	}
	@Override
	public void computerAreat(double width,double height) {
		System.out.println("�ﰢ���� ���� : "+width*height/2);
	}
}
