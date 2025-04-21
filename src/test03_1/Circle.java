package test03_1;

public class Circle extends Shape{
	double radius;
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		drawCenter();
		System.out.println("반지름: "+radius+" ,원의 면적"
	+radius*radius*3.14);
	}
}
