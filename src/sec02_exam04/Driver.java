package sec02_exam04;
public class Driver {
	
	public void drive(Vehicle vh) {
		if(vh instanceof Bus) {
			Bus bus = (Bus)vh;
			bus.checkFare();
		}
		vh.run();
	}
	public static void main(String[] args) {
		Driver dr = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		dr.drive(bus);
		dr.drive(taxi);
	}

}
