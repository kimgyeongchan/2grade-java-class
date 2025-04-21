package test03;

public abstract class Shape {
	protected double x;
	protected double y;
	
	public Shape(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public void drawCenter() {
		System.out.println("(x,y) = "+x+" "+y);
	}
	
	public abstract void draw();
}
