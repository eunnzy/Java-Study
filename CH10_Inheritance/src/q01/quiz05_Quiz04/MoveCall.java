package q01.quiz05_Quiz04;

public class MoveCall {
	
	public static void main(String[] args) {
		Car car = new Car();
		Plane plane = new Plane();
		VehicleUse vehicleUse = new VehicleUse();
		vehicleUse.getMoveStyle(car);
		vehicleUse.getMoveStyle(plane);
	}
	
}
