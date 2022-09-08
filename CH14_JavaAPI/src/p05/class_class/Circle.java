package p05.class_class;

/*
	this(1, "플레인피자");의 의미
	1. this는 constructor method를 의미하여 Circle(double radius, String name)을 호출.
	2. 사용 목적은 constructor마다 반복적으로 입력값을 check하는 등 중복 coding하는 것을 막을 수 있음.
*/

public class Circle {
	double radius = 1;
	String name = "플레인피자";
	int a = 10;
	
	public Circle() {
		
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	public Circle(String newName) {
		name = newName;
	}

	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
	}
	
	// 원의 넓이
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	// 원의 둘레
	public double getPerimeter() {
		return this.radius * 2 * Math.PI;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public void dummy() {
		
	}
}
