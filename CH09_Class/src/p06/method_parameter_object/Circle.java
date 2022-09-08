package p06.method_parameter_object;

public class Circle {
	private double radius;
	private String name;
	private static int numberOfObjects = 0;	// new로 생성된 인스턴스 개수를 관리
	
	public Circle() {
		this.radius = 1;			// this는 constructor를 의미함.
		numberOfObjects++;
	}

	public Circle(double radius) {
		this.radius = radius;
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
