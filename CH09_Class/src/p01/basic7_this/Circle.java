package p01.basic7_this;

/*
	this(1, "플레인피자");의 의미
	1. this는 constructor method를 의미하여 Circle(double radius, String name)을 호출.
	2. 사용 목적은 constructor마다 반복적으로 입력값을 check하는 등 중복 coding하는 것을 막을 수 있음.
*/

public class Circle {
	double radius;
	String name;
	
	public Circle() {
//		this.radius = 1;			// this는 constructor를 의미함.
//		this.name = "플레인피자";
		this(1, "플레인피자");			// -> Circle(double radius, String name)을 실행시킴.		
		
		System.out.println("end of Default Constructor call");
	}

	public Circle(double radius) {
//		this.radius = radius;
//		this.name = "플레인피자";
		this(radius, "플레인피자");
		System.out.println("end of Circle(double radius) call");
	}
	
	public Circle(String name) {
//		this.radius = 1;
//		this.name = name;
		this(1, name);
	}

	public Circle(double radius, String name) {
		System.out.println("Circle(double radius, String name) is called"); 
		// formal parameter의 입력값이 valid(유효한 값)인지 check하는 로직이 코딩 되어야 함.
		if(radius > 0) {
			this.radius = radius;
		} else {
			this.radius = 1;		// 최소 원의 반지름은 1이상
		}
		this.name = name;
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
	
	// 원의 정보 출력
	public void printCircleInformation() {
		System.out.println("name : " + name + ", radius : " + radius);
	}
	

}
