package p01.basic2;

/*
	1. Java 클래스는 main method가 있는 class와 main method가 없는 class들로 구분 가능하다.
	2. Java Programming을 한다는 말의 의미
	  - 1개의 main method가 있는 class 와 main method가 없는 여러개의 class들
	  - main method가 있는 class는 main method가 없는 class들을 사용.
	  - main method가 없는 class들도 main method가 없는 다른 class들을 사용가능.
	3. main method가 없는 class들을 일반적으로 Java Library라 부름.
	  - Java에서 기본적으로 제공하는 library : Scanner, System, ... 등
	  - JSP, Spring에서 제공하는 web programming class library
	  - Java 개발자가 만든 class library
	4. class 하나가 OOP(Object Oriented Programming)의 1개의 객체를 의미
*/

public class Circle {
	double radius = 1;
	String name = "플레인피자";
	
	public Circle() {		// 디폴트 생성자
	}

	public Circle(double newRadius) {
		radius = newRadius;
	}
	
	
	private Circle(String newName) {
		name = newName;
	}
	
	public Circle(double newRadius, String newName) {
		radius = newRadius;
		name = newName;
	}

	// 원의 면적을 구하는 method 선언
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	// 원의 둘레 구하는 (원주율) method 선언
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
}
