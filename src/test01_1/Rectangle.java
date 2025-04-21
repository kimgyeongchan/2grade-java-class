package test01_1;

public class Rectangle extends Shape{
	@Override
	public void draw() {
		System.out.println("사각형 그리기");
	}
	
	@Override
	public void area(double x, double y) {
		System.out.println("사각형의 넓이: "+x*y);
	}
}
