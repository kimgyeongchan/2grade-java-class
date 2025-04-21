package test01_1;

public class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("»ï°¢Çü ±×¸®±â");
	}
	
	@Override
	public void area(double x, double y) {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ: "+x*y/2);
	}
}
