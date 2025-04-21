package test01;

public class Triangle extends Shape{
	@Override
	public void draw() {
		System.out.println("»ï°¢Çü ±×¸®±â");
	}
	@Override
	public void area(double a, double b) {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ : "+a*b/2);
	}
}
