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
		System.out.println("����: "+width+" ,����: "+heigth+"�簢���� ����"+width*heigth);
	}
}
