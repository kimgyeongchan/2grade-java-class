package sec02_test01_2;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
	@Override
	public void computerAreat(double a, double b) {
		System.out.println("사각형의 넓이"+a*b);
	}
}
