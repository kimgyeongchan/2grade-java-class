package sec02_exam02;

public class Driver {
	public void drive (Vehicle vh) {
		vh.run();
	}
	public static void main(String[] args) {
		Driver dr = new Driver();
		Bus bus = new Bus();
		Taxi ta = new Taxi();
		
		dr.drive(bus);
		dr.drive(ta);
	}
}
