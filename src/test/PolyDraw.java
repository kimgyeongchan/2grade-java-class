package test;

public class PolyDraw {
	public static void pDraw(Figure f) {
		f.draw();
	}
	
	public static void pArea(Shape s, double a, double b) {
		s.computerArea(a, b);
	}
	
	public static void main(String[] args) {
		
		Triangle t = new Triangle();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		
		Figure ft = t;
		Figure fr = r;
		Figure fc = c;
		
		Shape st = t;
		Shape sr = r;
		Shape sc = c;
		
		pDraw(ft); 
		pArea(st, 3, 4);
		
		pDraw(fr); 
		pArea(sr, 4, 2.5);
		
		pDraw(fc); 
		pArea(sc, 6, 6);
	}
}
