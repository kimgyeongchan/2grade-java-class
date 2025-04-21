package sec02_exam05;

public class ABCDTest {
	public static void main(String[] args) {
		D d1 = new D();
		A ia = d1;
		ia.ma();
		System.out.println();
		
		B ib = d1;
		ib.mb();
		System.out.println();
		
		C ic = d1;
		ic.ma();
		ic.mb();
		ic.mc();
//		ic.md();/
		System.out.println();
		
		D d2 = d1;
		d2.md();
		
	}
}
