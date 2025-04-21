package inferfaceexam;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
	
	@Override
	public void computer(double a, double b) {
		System.out.println(a*a*3.14);
	}
}
