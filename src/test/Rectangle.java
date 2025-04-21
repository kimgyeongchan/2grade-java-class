package test;

public class Rectangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
	@Override
	public void computerArea(double a, double b) {
		System.out.println("가로: "+a+", 높이 : "+b+"인 사각형의 넓이 = "+a*b);
	}
	
}
