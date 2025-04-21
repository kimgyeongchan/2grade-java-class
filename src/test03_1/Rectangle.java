package test03_1;

public class Rectangle extends Shape{
	double width, heigth;
	
	public Rectangle(double x, double y, double width, double heigth) {
		super(x,y);
		this.width = width;
		this.heigth = heigth;
	}
	
	@Override
	public void draw() {
		drawCenter();
		System.out.println("가로: "+width+" ,세로: "+heigth+"사각형의 넓이"+width*heigth);
	}
}
