package test03;

public class Rectangle extends Shape{
	double width;
	double height;
	
	public Rectangle(double x, double y, double width, double height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		drawCenter();
		System.out.printf("����: %f,����: %f, �簢���� ����: %f\n"
				,width,height,width*height);
	}
}
