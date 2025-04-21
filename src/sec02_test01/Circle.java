package sec02_test01;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("원형 그리기");
	}
	@Override
	public void computerAreat(double width,double height) {
		System.out.println("삼각형의 넓이 : "+width*width*3.14);
	}
}
