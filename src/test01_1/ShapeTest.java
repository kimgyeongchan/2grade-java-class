package test01_1;

public class ShapeTest {
	public static void main(String[] args) {
		Shape sh = new Rectangle();
		sh.draw();
		sh.area(5, 10);
		
		System.out.println("-------------------");
		
		sh = new Triangle();
		sh.draw();
		sh.area(5, 10);
	}
}
