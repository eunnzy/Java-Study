package p05.encapsulation;

/*
	private
	  - 대상 : field, method에 사용가능. (constructor에서도 사용 가능)
	  - 사용 목적: 
	  	 1) class를 사용하는 다른 class에서 사용하지 못하게 하는 것이 목적
			 => 하지만, class내부에서는 제한없이 사용 가능
		 2) 일반적으로 object oriented programming을 할 때, field는 private으로 선언하는 것이 일반적임.
		     => 대신에 private으로 선언한 field들의 대해, 다른 class에서 해당 field를 사용하기 위해
		        public으로 선언한 getter/setter method를 제공 
		     	method에 대해서는 만약 private으로 선언한 것은 class 내부적으로만 사용하고 외부에 오픈 안 하겠다는 의미
		     	
	Encapsulation(캡슐화) : class에서 field, method 등을 private로 선언을 해서 외부에 공개하지 않는 것.
	  - information hiding(정보 은닉)
*/

public class Circle {
	private double radius;
	private String name;
	private static int numberOfObjects = 0;	// new로 생성된 인스턴스 개수를 관리
	
	public Circle() {
		this.radius = 1;			// this는 constructor를 의미함.
		this.name = "플레인피자";
		numberOfObjects++;
	}

	public Circle(double radius) {
		this.radius = radius;
		this.name = "플레인피자";
		numberOfObjects++;
	}
	
	// getter method
	public double getRadius() {
		return radius;
	}
	
	// setter method
	public void setRadius(double radius) {
		if(radius >= 0 ) {
			this.radius = radius;
		} else {
			this.radius = 0;
		}
	
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}

	// 원의 넓이
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	// 원의 둘레
	public double getPerimeter() {
		return this.radius * 2 * Math.PI;
	}
	
	private void printPrivateHello() {
		System.out.println("Hello, this is private method");
	}
	
	
//	// 원의 정보 출력
//	public void printCircleInformation() {
//		System.out.println("name : " + name + ", radius : " + radius);
//	}
	

}
