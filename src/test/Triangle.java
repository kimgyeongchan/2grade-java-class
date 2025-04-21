package test;

public class Triangle extends Figure implements Shape{
	@Override
	public void draw() {
		System.out.println("삼각형 그리기");
	}
	
	@Override
	public void computerArea(double a, double b) {
		System.out.println("가로: "+a+", 높이 : "+b+"인 삼각형의 넓이 = "+(a*b)/2);
	}
	
}
