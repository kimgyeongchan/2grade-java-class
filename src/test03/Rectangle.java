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
		System.out.printf("가로: %f,세로: %f, 사각형의 넓이: %f\n"
				,width,height,width*height);
	}
}
