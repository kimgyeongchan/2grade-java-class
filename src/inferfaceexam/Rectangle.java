package inferfaceexam;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
	@Override
	public void computer(double a, double b) {
		System.out.println(a*b);
	}
}
