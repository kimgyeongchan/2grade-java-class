package sec02_test01_2;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("원형 그리기");
	}
	
	@Override
	public void computerAreat(double a, double b) {
		System.out.println("삼각형의 넓이"+a*a*3.14);
	}
}
