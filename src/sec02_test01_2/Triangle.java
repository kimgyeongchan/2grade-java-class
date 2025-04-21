package sec02_test01_2;

public class Triangle extends Figure implements Shape{

	@Override
	public void draw() {
		System.out.println("»ï°¢Çü ±×¸®±â");
	}
	
	@Override
	public void computerAreat(double a, double b) {
		System.out.println("»ï°¢ÇüÀÇ ³ĞÀÌ"+a*b/2);
	}
}
