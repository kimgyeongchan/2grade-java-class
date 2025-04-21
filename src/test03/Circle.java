package test03;

public class Circle extends Shape{
	
	double radius;
	
	public Circle(double x, double y, double radius) {
		super(x,y);
		this.radius = radius;
	}

	@Override
	public void draw() {
		drawCenter();
		System.out.printf("������:%f, ���� ����: %f\n"
				,radius,radius*radius*3.14);
	}
}
