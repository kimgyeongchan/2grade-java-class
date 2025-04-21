package test03_1;

public class ShapeTest {
	
	public static void pdraw(Shape sh) {
		sh.draw();
	}
	
	public static void main(String[] args) {
		Rectangle re = new Rectangle(3, 3, 4, 4);
		pdraw(re);
	}
	
}
