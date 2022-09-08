package p08.polymorphism3;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver();
		Vehicle v;

		Bus bus = new Bus();
//		v = bus;	// promotion 발생
		
//		v = new Bus();
//		v = new Taxi();
//		v = new Sedan();
		
		driver.driver(bus);
		
		driver.driver(new Taxi());
		driver.driver(new Sedan());	
		
	}

}
