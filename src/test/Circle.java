package test;

public class Circle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("원 그리기");
	}
	
	@Override
	public void computerArea(double a, double b) {
		System.out.println("가로: "+a+", 높이 : "+b+"인 원의 넓이 = "+a*b*3.14);
	}
	
}
