package sec02_test01;

public class PolyDraw {
	public void pdraw(Figure Figure) {
		Figure.draw();
	}
	public void polyArea(Shape s,double width,double height) {
		s.computerAreat(width,height);
	}
	public static void main(String[] args) {
		
		Figure f1 = new Triangle();
		Figure f2 = new Rectangle();
		Figure f3 = new Circle();
		
		Shape sh1 = new Triangle();
		Shape sh2 = new Rectangle();
		Shape sh3 = new Circle();
		
		PolyDraw po = new PolyDraw(); //자신의 객체 생성
		po.pdraw(f1);
		po.polyArea(sh1,4,4);
		
		po = new PolyDraw();
		po.pdraw(f2);
		po.polyArea(sh2,4,4);
		
		po = new PolyDraw();
		po.pdraw(f3);
		po.polyArea(sh3,4,4);
		
	}
}
