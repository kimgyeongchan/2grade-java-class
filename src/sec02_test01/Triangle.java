package sec02_test01;

public class Triangle extends Figure implements Shape{
	
	@Override
	public void draw() {
		System.out.println("»ï°¢Çü ±×¸®±â");
	}
	@Override
	public void computerAreat(double width,double height) {
		System.out.println("»ï°¢ÇüÀÇ ³ÐÀÌ : "+width*height/2);
	}
}
