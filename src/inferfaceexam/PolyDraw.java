package inferfaceexam;

public class PolyDraw{
	public void pdraw(Figure f) {
		f.draw();
	}
	public void polyArea(Shape s) {
		s.computer(4, 4);
	}
	
	public static void main(String[] args) {
		PolyDraw po = new PolyDraw();
		Figure f1 = new Triangle();
		Figure f2 = new Rectangle();
		Figure f3 = new Circle();
		
		Shape Sh1 = new Triangle();
		Shape Sh2 = new Rectangle();
		Shape Sh3 = new Circle();
		
		
		po.pdraw(f1);
		po.polyArea(Sh1);
		
		po.pdraw(f2);
		po.polyArea(Sh2);
		
		po.pdraw(f3);
		po.polyArea(Sh3);
	}
}
