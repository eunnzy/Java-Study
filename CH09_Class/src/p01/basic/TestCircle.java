package p01.basic;

/*
 	1. Circle c의 의미
	 - Circle : class 이름이면서 data type
	 - Circle class 내부에는 field인 radius가 있고, method인 getArea(), getPerimeter(), setRadius() 존재
	 - c1, c2 : Circle 인스턴스(instance)/Object를 가리키는 변수 
	2. new Circle() 명령어의 기계어로 변환시 실행 순서
	  1) new를 실행 : heap 메모리에 Circle class의 인스턴스를 만들고, 인스턴스의 힙메모리 주소를 갖고 있음
	    - instance 안에는 field들만 갖고 있음. (즉, radius field만 갖고 있음) 메소드는 힙메모리에 없음.
	  2) Circle class의 생성자(constructor) method인 public Circle()을 실행함.
	  	=> heap 메모리의 주소를 class내에 this라는 변수이름으로 전달(this : Java 내부에서 관리되는 이름)
	  3) heap 메모리에서 생성된 인스턴스 주소를 stack 메모리에 있는 변수 c에 넣어줌.
	3. Circle class의 인스턴스인 c, c2를 사용하여 Circle class의 field와 method를 사용. 
*/

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println("Circle class 객체(인스턴스)인 c1인 반지름 :" + c1.radius);
		System.out.println("Circle class 객체인 c1의 면적 : " + c1.getArea());
		System.out.println("Circle class 객체인 c의 둘레 : " + c1.getPerimeter());
		
		System.out.println();
		
		c1.setRadius(3);
		System.out.println("Circle class 객체(인스턴스)인 c1인 반지름 :" + c1.radius);
		System.out.println("Circle class 객체인 c1의 면적 : " + c1.getArea());
		System.out.println("Circle class 객체인 c1의 둘레 : " + c1.getPerimeter());
		
		System.out.println();
		
		Circle c2 = new Circle(2);
		System.out.println("Circle class 객체(인스턴스)인 c2인 반지름 :" + c2.radius);
		System.out.println("Circle class 객체인 c2의 면적 : " + c2.getArea());
		System.out.println("Circle class 객체인 c2의 둘레 : " + c2.getPerimeter());
		
	}

}
