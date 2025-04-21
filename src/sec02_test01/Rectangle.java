package sec02_test01;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	@Override
	public void computerAreat(double width,double height) {
		System.out.println("사각형의 넓이 : "+width*height);
	}
}
