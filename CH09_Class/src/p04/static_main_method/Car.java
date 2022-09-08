package p04.static_main_method;

/*
 	1. instance method를 선언하고 사용하는 목적
 	  - heap memory에 생성된 instance field들을 사용하겠다는 의미
 	  - instance method 안에서 static field, static method 사용 가능
 	2. static method를 선언하고 사용하는 목적
 	  - heap memory에 생성된 instance field들을 사용하지 않겠다는 의미
 	  - 공통으로 변함없이 사용되는 메소드 (예를 들면, Math 안에 있는 메소드들)
 	    => 많이 사용되지 않는 메소드
 	  - static field는 같이 사용 가능
 	  - 굳이 instance field나 instance method를 사용하고 싶은 경우에는 static method 안에서 
 	    new로 인스턴스 생성 후에 인스턴스를 사용하면 됨.
*/

public class Car {
	int speed;
	String name;
	static String color;
	
	public Car() { }
	
	// this는 인스턴스를 의미.
	public Car(String color) {
		Car.color = color;
	}
	
	// static method
	public static void printStaticHello() {
//		speed = 10;			 오류
		System.out.println("Hello, static method");
	}
	
	// instance method
	// instance method 안에서는 instance field, 다른 instance method 사용가능
	public void printInstanceHello() {
//		speed = 10;			가능
		System.out.println("Hello, instance method");
		dummy();
	}
	
	public static void dummy() {
		System.out.println("this is dummy static method");
	}
	
	public static void main(String[] args) {
		// static method에서 static field나 다른 static method 사용가능
		color = "red";
		printStaticHello();
		
		/*
			Car.color  = "red";
			Car.printStaticHello();
		*/
		
		
//		static method에서 instance field나 다른 instance method 사용불가능
//		speed = 10;      불가 => static method인 경우 : instance 사용 x
//		printInstanceHello();  		불가
		
		
		// instance field나 instance method는 반드시 new로 인스턴스 생성 후 사용가능.
		Car car = new Car();
		car.speed = 10;
		car.printInstanceHello();
		
//		Math.cos(50);
	}
}
