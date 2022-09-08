package p04.polymorphism2;

public class Driver {
	
	// method parameter의 data type로 interface 사용 가능. 
	// promotion 발생 (자식 클래스에서 부모 interface type으로 변환)
	public void drive(Vehicle vehicle) {
		vehicle.run();    // polymorphism
	}
	
}
