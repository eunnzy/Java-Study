package p01.basic;

/*
	class 이름 : Circle
	1. field (속성) : radius
	2. constructor(생성자) : Circle(),  Circle(double newRadius)
	   - 생성자의 이름과 class 이름은 동일함.
	   - 생성자는 특수한 경우에 사용하는 method 
	     (생성자는 new Circle() 같은 방식으로 힙 메모리에 인스턴스 만들 때 Java 내부적으로 오직 1번만 실행) 
	   - 생성자 overloading : method overloading과 같은 개념 (디폴트 생성자와 Circle(double newRadius))
	   - class내에 생성자는 여러개 만들어 질 수 있음.
	3. class method : getArea(), getPerimeter(), setRadius()
*/

public class Circle {
	double radius = 1;
	
	public Circle() {		// 디폴트 생성자
		System.out.println("Circle default constructor 호출");
	}

	public Circle(double newRadius) {
		System.out.println("Circle(double newRadius) constructor 호출");
		radius = newRadius;
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
