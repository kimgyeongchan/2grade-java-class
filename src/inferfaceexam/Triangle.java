package inferfaceexam;

public class Triangle extends Figure implements Shape{

	@Override
	public void draw() {
		System.out.println("삼각형 그리기");
	}
	
	@Override
	public void computer(double a, double b) {
		System.out.println((a*b)/2);
	}

}
