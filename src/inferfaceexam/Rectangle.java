package inferfaceexam;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("�簢�� �׸���");
	}
	
	@Override
	public void computer(double a, double b) {
		System.out.println(a*b);
	}
}
