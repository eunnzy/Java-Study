package p05.casting;

// 부모가 Interface type인 경우라도 casting할 때, instanceof 사용 가능.
public class DriverEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();		// promotion
		
		vehicle.run();
		
//		vehicle.checkFare();
		
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;		// casting
			bus.checkFare();			
		}
		
	}

}
