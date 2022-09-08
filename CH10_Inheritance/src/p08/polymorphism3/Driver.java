package p08.polymorphism3;

public class Driver {
	
	// method parameter에서 promotion 발생
	public void driver(Vehicle vehicle) {
		vehicle.run();		// override method => polymorphism 발생
	}
	
}
