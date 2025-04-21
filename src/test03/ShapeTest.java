package test03;

public class ShapeTest {
	public static void main(String[] args) {
		Shape sh = new Rectangle(2, 3, 3.67, 7.89);
		sh.draw();
		sh = new Circle(3, 4, 4.82);
		sh.draw();
		
//ผ๖วเ x
//		System.out.println();
//		Shape[] sa = {new Rectangle(2, 3, 3.67, 7.89),new Circle(3, 4, 4.82)};
//		sa[0].draw();
//		sa[1].draw();
	}
}
